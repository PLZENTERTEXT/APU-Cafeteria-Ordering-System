package General;

public interface OrderHistory {
    
    final String COFILE = "completedOrders.txt";
    
    // Loads the order history of completed orders in the JTable
    public void loadOrderHistoryTable();
            
    // Extracts the date from the order ID and converts it into a date format
    public String idToDateConversion(String orderID);
}
