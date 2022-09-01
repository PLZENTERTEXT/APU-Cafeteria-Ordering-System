package General;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ManagerSalesReport extends javax.swing.JFrame{

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    SalesReportCalculations report = new SalesReportCalculations() {};
    private static Logger logger = LogManager.getLogger();
    
    public ManagerSalesReport(String userID, String userPassword) throws IOException {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        //Calculates and displays system balance, total orders and total customers
        systemBalanceLabel.setText("RM " + String.valueOf(report.calculateSystemBalance()));
        totalOrdersLabel.setText(String.valueOf(report.totalNumber(0)));
        totalCustomersLabel.setText(String.valueOf(report.totalNumber(1)));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        headerPanel1 = new javax.swing.JPanel();
        custHomeHeader1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mgrBackBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        systemBalanceLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalOrdersLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        totalCustomersLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dateSearchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        printRptBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        totalSalesLabel = new javax.swing.JLabel();
        totalSalesAmountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        userPanel.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 128, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        userPanel.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, 128, 56));

        jPanel1.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 17, 150, 120));

        headerPanel1.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(0, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("SALES REPORT");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        headerPanel1.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 812, 100));

        jPanel1.add(headerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 17, -1, 120));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        contentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 480, -1, 31));

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        contentPanel.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 408, 100, 56));

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setForeground(new java.awt.Color(244, 244, 244));
        jPanel2.setToolTipText("");

        systemBalanceLabel.setBackground(new java.awt.Color(255, 255, 255));
        systemBalanceLabel.setForeground(new java.awt.Color(0, 0, 0));
        systemBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemBalanceLabel.setToolTipText("");
        systemBalanceLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM BALANCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(systemBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        contentPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));
        jPanel3.setForeground(new java.awt.Color(244, 244, 244));
        jPanel3.setToolTipText("");

        totalOrdersLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalOrdersLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalOrdersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOrdersLabel.setToolTipText("");
        totalOrdersLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL ORDERS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalOrdersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalOrdersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        contentPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(244, 244, 244));
        jPanel4.setForeground(new java.awt.Color(244, 244, 244));
        jPanel4.setToolTipText("");

        totalCustomersLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalCustomersLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalCustomersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalCustomersLabel.setToolTipText("");
        totalCustomersLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TOTAL CUSTOMERS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCustomersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalCustomersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        contentPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 6, -1, 115));

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "Total Sales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(0).setResizable(false);
            salesTable.getColumnModel().getColumn(1).setResizable(false);
            salesTable.getColumnModel().getColumn(2).setResizable(false);
            salesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        contentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 132, 720, 265));

        jPanel6.setBackground(new java.awt.Color(244, 244, 244));
        jPanel6.setForeground(new java.awt.Color(244, 244, 244));
        jPanel6.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE");

        dateSearchField.setBackground(new java.awt.Color(255, 255, 255));
        dateSearchField.setForeground(new java.awt.Color(0, 0, 0));
        dateSearchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateSearchField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        dateSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSearchFieldActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 48, 73));
        searchBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date format: dd-mm-yyyy");

        printRptBtn.setBackground(new java.awt.Color(0, 48, 73));
        printRptBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        printRptBtn.setForeground(new java.awt.Color(255, 255, 255));
        printRptBtn.setText("PRINT REPORT");
        printRptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(printRptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printRptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        contentPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 132, -1, -1));

        jPanel5.setBackground(new java.awt.Color(244, 244, 244));
        jPanel5.setForeground(new java.awt.Color(244, 244, 244));

        totalSalesLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalSalesLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        totalSalesLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalSalesLabel.setText(" Total Sales on Selected Date: ");

        totalSalesAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalSalesAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalSalesAmountLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalSalesAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalSalesAmountLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        totalSalesAmountLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(totalSalesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSalesAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalSalesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(totalSalesAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        contentPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 408, -1, -1));

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 147, 994, 477));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(),mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    private void dateSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSearchFieldActionPerformed

    }//GEN-LAST:event_dateSearchFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel salesTableModel = (DefaultTableModel) salesTable.getModel();
        salesTableModel.setRowCount(0); //Setting the row count to 0 each time the button is clicked
        
        //Setting the orderDate back to null
        String orderDate = null; 
        totalSalesAmountLabel.setText(null);

        try {
            //Validates date format 
            orderDate = report.dateValidation(dateSearchField.getText());
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        if (orderDate != null){
            //itemDetails object reference created for storing item details from file
            ArrayList<String> itemIDs = new ArrayList<String>();
            //Initialize total sales
            double totalSales = 0;
            
            try {
                //Gets all the lines in the file and stores it in a string variable
                for (int i = 0; i < report.findAllSales(orderDate).size(); i++){
                    String line = report.findAllSales(orderDate).get(i);
                    
                    //Splits the lines by delimiter
                    String [] lineArray = line.split("\\|");
                    
                    totalSales = totalSales + Double.parseDouble(lineArray[4]) * Integer.parseInt(lineArray[5]);
                    totalSales = (double) Math.round(totalSales * 100)/100;
                    //If ID is not already in lineArray, then it appended into it (Ensures unique ID)
                    if (!itemIDs.contains(lineArray[2])){
                        itemIDs.add(lineArray[2]);
                    }
                }
                
                for (int j = 0; j < itemIDs.size(); j++){
                    
                    double itemSales = 0;
                    int itemQuantity = 0;
                    String itemName = null;
                    String salesAmount = null;
                    
                    for (int k = 0; k < report.findAllSales(orderDate,itemIDs.get(j)).size(); k++){
                        String lines = report.findAllSales(orderDate, itemIDs.get(j)).get(k);
                        
                        //Splits string into multiple sections of an array
                        String [] lineArray = lines.split("\\|");
                        
                        //Adding the quantity of the item in each iteration
                        itemQuantity += Integer.parseInt(lineArray[5]);
                        
                        //Adding the sales of the item in each iteration and rounds the amount to 2 decimal places
                        itemSales += Double.parseDouble(lineArray[4]) * itemQuantity;
                        itemSales = Math.round(itemSales * 100.0) / 100.0;
                        salesAmount = "RM " + String.valueOf(itemSales);
                        
                        //Stores the name of the item
                        itemName = lineArray[3];
                    }
                    
                    //Appends lines into the table
                    salesTableModel.addRow(new Object[] {itemIDs.get(j), itemName, itemQuantity, salesAmount});
                    
                    //Calculates the total sales amount for that particular date
                    totalSalesAmountLabel.setText("RM " + String.valueOf(totalSales) + " ");
                }
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void printRptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRptBtnActionPerformed
        DefaultTableModel salesTableModel = (DefaultTableModel) salesTable.getModel();
        if(salesTableModel.getRowCount() > 0){
            // Set the header and the footer of the report
            MessageFormat header = new MessageFormat("Daily Sales Report (" + dateSearchField.getText() + ")");

            try {
                // Add the total row
                salesTableModel.addRow(new Object[] {"", "", "", ""});
                salesTableModel.addRow(new Object[] {"Total Sales", "", "", totalSalesAmountLabel.getText()});
                
                // Print the table as a report
                salesTable.print(JTable.PrintMode.FIT_WIDTH, header, null); 
                
            } catch(PrinterException e) {
                logger.error("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: No data to generate report!");
        }

        logger.info("Manager " + mgr.getUserID() + " has attempted to print the daily report of the date " + dateSearchField.getText() + ".");
    }//GEN-LAST:event_printRptBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTextField dateSearchField;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton printRptBtn;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel systemBalanceLabel;
    private javax.swing.JLabel totalCustomersLabel;
    private javax.swing.JLabel totalOrdersLabel;
    private javax.swing.JLabel totalSalesAmountLabel;
    private javax.swing.JLabel totalSalesLabel;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
