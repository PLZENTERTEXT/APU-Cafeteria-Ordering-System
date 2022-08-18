
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

// All file related actions
public class FileHandling {
    
    int MAX_ARRAY_SIZE = 8; // A line in any file would only have 8 sections
    
    
    // Read through the specified file for a specified string, and return the line
    public static String locateInFile(String query, File file) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
  
        while ((line = br.readLine()) != null){   
            if (line.contains(query)){
                return line; 
            }
        }
        
        return "NA";
    }
    
    // THIS IS NOT WORKING
    // 
    // Spliting the line into tokens -> Returns a particular section from the line/array
    public String tokenFinder(String line, File file, int section) throws FileNotFoundException, IOException {
        // To contain the tokens of the line
        String[] inputArray = new String[MAX_ARRAY_SIZE];
        
        // Create input file
        Scanner inputFile = new Scanner(file);
     
        // Returns true if the scanner has another token in its input
        while (inputFile.hasNext()) {
            StringTokenizer str = new StringTokenizer(line, "|");
            for (int i = 0; i < MAX_ARRAY_SIZE; i++) {
                inputArray[i] = str.nextToken();
            }
        }
        return inputArray[section];
    }
    
    // Appending data to file
     public static void appendToFile(String line, File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);  
        fw.write(line + "\n");
        fw.close();
    }
}
