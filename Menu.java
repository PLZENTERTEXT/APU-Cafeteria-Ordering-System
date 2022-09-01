package General;

public interface Menu {
    
    final String MENUFILE = "menu.txt";
    final String CAFILE = "custAccount.txt";
    final String POFILE = "pendingOrders.txt";
    
    // Clearing the input for the menu
    public void refreshMenuSelection();
    
    // To load the menu
    public void loadMenu();
}
