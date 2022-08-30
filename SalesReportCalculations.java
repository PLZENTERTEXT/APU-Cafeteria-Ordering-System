package General;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SalesReportCalculations {
    
    FileHandling fh = new FileHandling();
    File file = new File("completedOrders.txt");
    
    public Double calculateSystemBalance() throws IOException{
        Double balance = 0.0;
        
        //Iterate through each line of the file and adds the money
        for (int i = 0; i < fh.numberOfLines(file); i++){
            
            //Reads each line in the file and first splits them
            String data = fh.returnLines(file).get(i);
            String[] section = data.split("\\|");
            
            //Converts the amount of money and quantity in each line to calculate the balance
            balance += Double.parseDouble(section[4]) * Integer.parseInt(section[5]);
            balance = (double) Math.round(balance * 100)/100; //Rounding off to 2 decimal places
        }
        return balance;
    }
    
    //Calculates the total of a particular section in each row (has to be a value that can be calculated)
    public int totalNumber(int sectionNumber) throws IOException{
        int total = 0;
        ArrayList<String> lines = new ArrayList<String>();
        
        //Iterate through each line of the file and adds the money
        for (int i = 0; i < fh.numberOfLines(file); i++){
            String data = fh.returnLines(file).get(i);
            String[] section = data.split("\\|");
            //If the line number is already in the list then add increment total by 1
            if (!lines.contains(section[sectionNumber])){
                lines.add(section[sectionNumber]);
                total++;
            }
        }
        return total;
    }  
    
    //Finds all sales on a particular date within the text files and returns them in the form of an array list
    public ArrayList<String> findAllSales(String orderDate) throws IOException{
        int dailySales = 0;
        ArrayList<String> lines = new ArrayList<String>();
        
        
        for (int i = 0; i < fh.numberOfLines(file); i++){
            
            //Reads each line in the file and first splits them
            String data = fh.returnLines(file).get(i);
            String[] section = data.split("\\|");
            
            //Converts the order ID in each row to a date format
            String lineDate = section[0].substring(0, 9);
            String day = lineDate.substring(0, 2);
            String month = lineDate.substring(2,4);
            String year = lineDate.substring(4,8);         
            String date = day + "-" + month + "-" + year;
            
            //Add it into the text array list if the date is equivalent to the argument
            if (orderDate.equals(date)){
                lines.add(data);
            }
        }
        return lines;
    }
    
    //Finds all sales on a particular date and item id in the text file and returns them in the form of an array list
    public ArrayList<String> findAllSales(String orderDate, String itemID) throws IOException{
        
        
        int dailySales = 0;
        ArrayList<String> lines = new ArrayList<String>();
        
        for (int i = 0; i < fh.numberOfLines(file); i++){
            
            //Reads each line in the file and first splits them
            String data = fh.returnLines(file).get(i);
            String[] section = data.split("\\|");
            
            //Converts the order ID in each row to a date format
            String lineDate = section[0].substring(0, 9);
            String day = lineDate.substring(0, 2);
            String month = lineDate.substring(2,4);
            String year = lineDate.substring(4,8);         
            String date = day + "-" + month + "-" + year;
            
            //Add it into the text array list if the date is equivalent to the arguments
            if (orderDate.equals(date) && itemID.equals(section[2])){
                lines.add(data);
            }
        }
        return lines;
    }
    
    //Validates the date entered by the user by checking the text files to see if the date exists
    public String dateValidation(String orderDate) throws IOException{
        int dailySales = 0;
        
        //If the orderDate is blank, then it will immediately return a null value
        if (orderDate.equals("")){
                return null;
            }
        
        for (int i = 0; i < fh.numberOfLines(file); i++){
            //Reads each line in the file and first splits them
            String data = fh.returnLines(file).get(i);
            String[] section = data.split("\\|");
            
            
            //Converts the order ID in each row to a date format
            String lineDate = section[0].substring(0, 9);
            String day = lineDate.substring(0, 2);
            String month = lineDate.substring(2,4);
            String year = lineDate.substring(4,8);         
            String date = day + "-" + month + "-" + year;
            
            //Add it into the text array list if the date is equivalent to the arguments
            if (orderDate.equals(date)){
                return orderDate;
            }
        }
        return null;
    }
    
}
