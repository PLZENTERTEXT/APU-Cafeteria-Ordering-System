package General;


import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerMenu extends javax.swing.JFrame implements Menu {

    private String foodID;
    private int quantity;
    private double total;
    private String orderID;
    public double systemBalance;
    
    UserRegistrationInfo cust = new UserRegistrationInfo();
    private static Logger logger = LogManager.getLogger();
    
    // Create new form "CustomerMenu"
    public CustomerMenu(String userID, String userPassword) {
        initComponents();
        setContentPane(customerMenuPanel);
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(1080,635); 
       
        // Set the user ID
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        // Load the menu as soon as the window loads from "CustomerMenu" class
        loadMenu();
        
        // Set a formatted date and time in the datetime text field
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateObj.format(formatObj);
        datetimeTF.setText(formattedDate);
        
        // Set the total price to be 0.00 at the start
        totalTF.setText("0.00");
    }
    
    // Clearing the input for the menu
    @Override
    public void refreshMenuSelection() {
        custFoodIDTF.setText(null);
        foodQuantitySpinner.setValue(1);
    }
    
    // To load the menu by putting everything in menu.txt to menu table (Only AVAILABLE items)
    @Override
    public void loadMenu() {
        DefaultTableModel menuTableModel = (DefaultTableModel) custMenuTable.getModel();
        menuTableModel.setRowCount(0);
        File file = new File(MENUFILE);
        
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Only adding "AVAILABLE" items in the menu
                    if (data[4].equals("AVAILABLE")) {
                        // Adding the data into the menu table
                        menuTableModel.addRow(new Object[]{data[0], data[1], data[2], data[3]});
                    }
                }
                br.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
                logger.error("IOException occured: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
            logger.error("FileNotFoundException occured: " + e.getMessage());
        }
    }
    
    // Check if a value exists in the Jtable or not (Return 1 if exists)
    public int checkValueExistsInTable(DefaultTableModel tableModel, JTable table, String query) {
        for(int row = 0; row < tableModel.getRowCount(); row++) {
            for(int col = 0; col < tableModel.getColumnCount(); col++) {
                // If the value exists in the table, return 1
                if (tableModel.getValueAt(row,col).equals(query)) {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    // Calculate and display the total
    public double calculateAndDisplayTotal() {
        DefaultTableModel orderItemTableModel = (DefaultTableModel) orderItemTable.getModel();
        total = 0;
        
        // Getting the data in menu table by row and column
        for(int row = 0; row < orderItemTableModel.getRowCount(); row++) {  
            String strPrice = (String) orderItemTable.getValueAt(row, 2);
            double douPrice = Double.parseDouble(strPrice);
    
            String strQuantity = (String) orderItemTable.getValueAt(row, 3);
            int douQuantity = Integer.parseInt(strQuantity);
            
            total += (douPrice * douQuantity);
        }
        total = Math.round(total * 100.0) / 100.0;
        totalTF.setText(String.valueOf(total));
        return total;
    }
    
    // Display a pop out message for the transaction and calculate balance - price
    // If transaction success, success == 1
    // If not enough balance, success == 0
    public double showBalancePrompt(double balance, double price, int success) {
        String generatedMessage = "";
        double difference = 0;
        
        generatedMessage += ("You have currently: RM" + balance + "\n");
        generatedMessage += ("Total: RM" + price + "\n");
        
        if (success == 1) {
            difference = balance - price;
            difference = Math.round(difference * 100.0) / 100.0;
            generatedMessage += ("\nTransaction Successful!"
                    + "\nYour order will be ready in a few minutes."
                    + "\nYour current balance is: RM" + difference);
            
        } else {
            generatedMessage += ("\nInsufficient balance!\nPlease top up at the nearest kiosk.");
        }
        
        JOptionPane.showMessageDialog(null, generatedMessage);
        
        return difference;
    }

    // Generating Order ID using date and time
    public String orderIDGenerator() {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        String formattedOrderID = dateObj.format(formatObj);
        return formattedOrderID;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerMenuPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        datetimeTF = new javax.swing.JTextField();
        welcomeLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custMenuTable = new javax.swing.JTable();
        menuLabel = new javax.swing.JLabel();
        menuInputPanel = new javax.swing.JPanel();
        foodQuantityLabel = new javax.swing.JLabel();
        custFoodIDLabel = new javax.swing.JLabel();
        custFoodIDTF = new javax.swing.JTextField();
        foodQuantitySpinner = new javax.swing.JSpinner();
        addTCButton = new javax.swing.JButton();
        deleteFCButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemTable = new javax.swing.JTable();
        orderItemLabel = new javax.swing.JLabel();
        proceedTCButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalTF = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerMenuPanel.setBackground(new java.awt.Color(244, 244, 244));
        customerMenuPanel.setPreferredSize(new java.awt.Dimension(1080, 600));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setForeground(new java.awt.Color(255, 255, 255));

        timeLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(18, 18, 18));
        timeLabel.setText("Time:");

        datetimeTF.setEditable(false);
        datetimeTF.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        datetimeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datetimeTF.setEnabled(false);
        datetimeTF.setFocusable(false);
        datetimeTF.setRequestFocusEnabled(false);
        datetimeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetimeTFActionPerformed(evt);
            }
        });

        welcomeLabel.setBackground(new java.awt.Color(18, 18, 18));
        welcomeLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(18, 18, 18));
        welcomeLabel.setText("Welcome To The APU Cafeteria Ordering System !");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLabel))
                .addContainerGap())
        );

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));
        tablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custMenuTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custMenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food", "Price", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custMenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custMenuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(custMenuTable);
        if (custMenuTable.getColumnModel().getColumnCount() > 0) {
            custMenuTable.getColumnModel().getColumn(0).setResizable(false);
            custMenuTable.getColumnModel().getColumn(1).setResizable(false);
            custMenuTable.getColumnModel().getColumn(2).setResizable(false);
            custMenuTable.getColumnModel().getColumn(3).setResizable(false);
        }

        tablePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, 410, 410));

        menuLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(18, 18, 18));
        menuLabel.setText("MENU");
        tablePanel.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        menuInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuInputPanel.setPreferredSize(new java.awt.Dimension(380, 433));

        foodQuantityLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodQuantityLabel.setForeground(new java.awt.Color(18, 18, 18));
        foodQuantityLabel.setText("Quantity:");

        custFoodIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        custFoodIDLabel.setForeground(new java.awt.Color(18, 18, 18));
        custFoodIDLabel.setText("Food ID:");

        custFoodIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custFoodIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custFoodIDTFActionPerformed(evt);
            }
        });

        foodQuantitySpinner.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        foodQuantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        addTCButton.setBackground(new java.awt.Color(0, 48, 73));
        addTCButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addTCButton.setForeground(new java.awt.Color(255, 255, 255));
        addTCButton.setText("Add To Cart");
        addTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTCButtonActionPerformed(evt);
            }
        });

        deleteFCButton.setBackground(new java.awt.Color(0, 48, 73));
        deleteFCButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        deleteFCButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteFCButton.setText("Delete From Cart");
        deleteFCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFCButtonActionPerformed(evt);
            }
        });

        orderItemTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        orderItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food", "Price", "Quantity"
            }
        ));
        orderItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderItemTable);
        if (orderItemTable.getColumnModel().getColumnCount() > 0) {
            orderItemTable.getColumnModel().getColumn(0).setResizable(false);
            orderItemTable.getColumnModel().getColumn(1).setResizable(false);
            orderItemTable.getColumnModel().getColumn(2).setResizable(false);
            orderItemTable.getColumnModel().getColumn(3).setResizable(false);
        }

        orderItemLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        orderItemLabel.setForeground(new java.awt.Color(18, 18, 18));
        orderItemLabel.setText("Ordered Items");

        proceedTCButton.setBackground(new java.awt.Color(0, 48, 73));
        proceedTCButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        proceedTCButton.setForeground(new java.awt.Color(255, 255, 255));
        proceedTCButton.setText("Proceed To Checkout");
        proceedTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedTCButtonActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(18, 18, 18));
        totalLabel.setText("Total:");

        totalTF.setEditable(false);
        totalTF.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        totalTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalTF.setEnabled(false);
        totalTF.setFocusable(false);
        totalTF.setRequestFocusEnabled(false);
        totalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuInputPanelLayout = new javax.swing.GroupLayout(menuInputPanel);
        menuInputPanel.setLayout(menuInputPanelLayout);
        menuInputPanelLayout.setHorizontalGroup(
            menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuInputPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodQuantitySpinner)
                            .addComponent(deleteFCButton, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(menuInputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custFoodIDLabel)
                    .addComponent(custFoodIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodQuantityLabel)
                .addGap(145, 145, 145))
            .addGroup(menuInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proceedTCButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderItemLabel)
                    .addGroup(menuInputPanelLayout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuInputPanelLayout.setVerticalGroup(
            menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custFoodIDLabel)
                    .addComponent(foodQuantityLabel))
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuInputPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(custFoodIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuInputPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(foodQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteFCButton)
                    .addComponent(addTCButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(proceedTCButton)
                .addContainerGap())
        );

        backButton.setBackground(new java.awt.Color(0, 48, 73));
        backButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        userPanel.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        userPanel.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 50));

        javax.swing.GroupLayout customerMenuPanelLayout = new javax.swing.GroupLayout(customerMenuPanel);
        customerMenuPanel.setLayout(customerMenuPanelLayout);
        customerMenuPanelLayout.setHorizontalGroup(
            customerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerMenuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(customerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(customerMenuPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                    .addGroup(customerMenuPanelLayout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        customerMenuPanelLayout.setVerticalGroup(
            customerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerMenuPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(customerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(customerMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CustomerHome custHome = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        custHome.setVisible(true);
        this.dispose();
        logger.info("User " + cust.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_backButtonActionPerformed

    private void datetimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetimeTFActionPerformed

    }//GEN-LAST:event_datetimeTFActionPerformed

    private void custMenuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custMenuTableMouseClicked
        DefaultTableModel menuTableModel = (DefaultTableModel) custMenuTable.getModel();
        custFoodIDTF.setText(menuTableModel.getValueAt(custMenuTable.getSelectedRow(),0 ).toString());
    }//GEN-LAST:event_custMenuTableMouseClicked

    private void custFoodIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custFoodIDTFActionPerformed

    }//GEN-LAST:event_custFoodIDTFActionPerformed

    private void addTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTCButtonActionPerformed
        DefaultTableModel menuTableModel = (DefaultTableModel) custMenuTable.getModel();
        DefaultTableModel orderItemTableModel = (DefaultTableModel) orderItemTable.getModel();

        // Getting user input
        foodID = custFoodIDTF.getText().toUpperCase();
        try {
             // If the text field is left blank then show a message, if not, put it into menu.txt & menu
            if(custFoodIDTF.getText().equals("")) {
                // If the text fields is left blank then show a message
                logger.error("Exception occured: User " + cust.getUserID() + " did not enter all data fields.");
                JOptionPane.showMessageDialog(null, "Error: Please enter all data fields!.");
            } else {
                // If the Food ID does not exist, show error
                if (checkValueExistsInTable(menuTableModel, custMenuTable, foodID) == 0) {
                    logger.error("Exception occured: User " + cust.getUserID() + " entered an invalid Food ID.");
                    JOptionPane.showMessageDialog(null, "Error: Food ID does not exist.");
                // If the Food ID exists, add the quantity amount
                } else if (checkValueExistsInTable(orderItemTableModel, orderItemTable, foodID) == 1) {
                    quantity = (int) foodQuantitySpinner.getValue();
                    
                    // Add on the quantity to the existing quantity in the table with the same FoodID
                    for(int row = 0; row < orderItemTableModel.getRowCount(); row++) {
                        if (orderItemTableModel.getValueAt(row,0).equals(foodID)) {
                            String strOriQuantity = (String) orderItemTableModel.getValueAt(row,3);
                            int intOriQuantity = Integer.parseInt(strOriQuantity);
                            quantity += intOriQuantity;
                            orderItemTableModel.setValueAt(String.valueOf(quantity), row, 3);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Item added successfully!");
                    logger.info("User " + cust.getUserID() + " has added " + quantity + " Food ID " + foodID + " into orderItemTable.");
                    
                    // Display total value
                    calculateAndDisplayTotal();

                    // Clearing the input for the menu
                    refreshMenuSelection();                    
                } else {
                    // Getting certain information based on the user input
                    quantity = (int) foodQuantitySpinner.getValue();
                    
                    int row = custMenuTable.getSelectedRow();       
                    Object[] col = new Object[4];
        
                    // Appending the data into the orderItemTable 
                    col[0] = menuTableModel.getValueAt(row,0);  // foodID
                    col[1] = menuTableModel.getValueAt(row,1);  // food
                    col[2] = menuTableModel.getValueAt(row,2);  // price
                    col[3] = String.valueOf(quantity);
                    orderItemTableModel.addRow(col);
                    JOptionPane.showMessageDialog(null, "Item added successfully!");
                    logger.info("User " + cust.getUserID() + " has added " + quantity + " Food ID " + foodID + " into orderItemTable.");
                    
                    // Display total value
                    calculateAndDisplayTotal();

                    // Clearing the input for the menu
                    refreshMenuSelection();
                }
            }
        } catch (HeadlessException | IllegalArgumentException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addTCButtonActionPerformed

    private void deleteFCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFCButtonActionPerformed
        DefaultTableModel orderItemTableModel = (DefaultTableModel) orderItemTable.getModel();

        if (orderItemTable.getSelectedRowCount() >= 1) {
            orderItemTableModel.removeRow(orderItemTable.getSelectedRow());
        } else if (orderItemTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for deleting!");
        }
        
        // Display total value
        calculateAndDisplayTotal();
        
        // Clearing the input for the menu
        refreshMenuSelection();
        
        logger.info("User " + cust.getUserID() + " has deleted a row in orderItemTable.");
    }//GEN-LAST:event_deleteFCButtonActionPerformed

    private void orderItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderItemTableMouseClicked

    }//GEN-LAST:event_orderItemTableMouseClicked
    
    // Payment handling
    // Show current balance, if enough, deduct amount from their balance, add balance to ours, prompt your order is ongoing, add to pendingOrders.txt
    // If insufficient balance, prompt go back to home page
    private void proceedTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedTCButtonActionPerformed
        double totalPrice;
        double currentBalance;
        double newBalance;
        
        // Calculate the total price
        totalPrice = calculateAndDisplayTotal();
        
        FileHandling fh = new FileHandling();
        File CAfile = new File(CAFILE);
        String userIDLine = "";
        
        // Finding the line in the file which matches the current user ID
        try {
            userIDLine = fh.locateItemInFile(cust.getUserID(), CAfile, 0);
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
        // Extract the currentBalance from the line found
        String[] userIDSection = userIDLine.split("\\|");
        currentBalance = Double.parseDouble(userIDSection[4]);
       
        if (currentBalance >= totalPrice) {
            // Show the prompt that the transaction was a success
            newBalance = showBalancePrompt(currentBalance, totalPrice, 1);
            
            // Modify new balance into the file
            fh.rewriteContent(CAfile, 0, cust.getUserID(), String.valueOf(newBalance));
            // Add into new system balance
            systemBalance += totalPrice;
            
            // Add the current orders into pendingOrders.txt   
            DefaultTableModel orderItemTableModel = (DefaultTableModel) orderItemTable.getModel();
            File POfile = new File(POFILE);
            
            // Generate the Order ID
            orderID = orderIDGenerator();
            
            try {
                FileWriter fw = new FileWriter(POfile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                
                // Getting the data in menu table by row and column
                for(int row = 0; row < orderItemTableModel.getRowCount(); row++) {
                    
                    // Append order ID and user ID at the start of the line
                    bw.write(orderID + "|" + cust.getUserID() + "|");
                    
                    // Append other details from orderItemTable
                    for(int col = 0; col < orderItemTableModel.getColumnCount(); col++) {
                        String data = (String)orderItemTableModel.getValueAt(row, col);
                        // Appending | delimeter after every entry
                        bw.write(data + "|");
                    }
                    bw.newLine();
                }
                // REMEMBER TO CLOSE BufferedWriter FIRST !
                bw.close();
                fw.close();
                logger.info("User " + cust.getUserID() + " has completed a transaction successfully with the Order ID: " + orderID);
            
                
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                
            }

        } else {
            // Show the prompt that there is insufficient balance
            showBalancePrompt(currentBalance, totalPrice, 0);
            logger.info("User " + cust.getUserID() + " has insufficient balance. Transaction was unsuccessful.");
        }
        
        // Return to customer Home Page
        CustomerHome custHome = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        custHome.setVisible(true);
        this.dispose();
        logger.info("User " + cust.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_proceedTCButtonActionPerformed

    private void totalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTFActionPerformed

    }//GEN-LAST:event_totalTFActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTCButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel custFoodIDLabel;
    private javax.swing.JTextField custFoodIDTF;
    private javax.swing.JTable custMenuTable;
    private javax.swing.JPanel customerMenuPanel;
    private javax.swing.JTextField datetimeTF;
    private javax.swing.JButton deleteFCButton;
    private javax.swing.JLabel foodQuantityLabel;
    private javax.swing.JSpinner foodQuantitySpinner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuInputPanel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel orderItemLabel;
    private javax.swing.JTable orderItemTable;
    private javax.swing.JButton proceedTCButton;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTF;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    
}
