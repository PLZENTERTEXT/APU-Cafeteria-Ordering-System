package General;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CustomerOrderHistory extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    String completedOrdersFile = "completedOrders.txt";
    private static Logger logger = LogManager.getLogger();
    
    public CustomerOrderHistory(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        loadOrderHistoryTable();
        reviewTextArea.setLineWrap(true);
        reviewTextArea.setWrapStyleWord(true);
    }
    
    // Loads the order history of completed orders in the JTable
    private void loadOrderHistoryTable(){
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        File file = new File(completedOrdersFile);
        
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Only adding the users orders in the order history
                    if (data[1].equals(cust.getUserID())) {
                        // Adding the data into the order history table
                        
                        Double totalPrice;
                        totalPrice = Double.parseDouble(data[4]) * Integer.parseInt(data[5]);
                        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
                        String totalPriceStr;
                        totalPriceStr = totalPrice.toString();
                        orderHistoryTableModel.addRow(new Object[]{data[0], data[2], data[3], 
                                                data[4], data[5], totalPriceStr, idToDateConversion(data[0])});
                    }
                }
                br.close();
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }
        } catch (FileNotFoundException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
        }
    }
    
    public String idToDateConversion(String orderID) {
        
        String day = orderID.substring(0, 2);
        String month = orderID.substring(2,4);
        String year = orderID.substring(4,8);         
        String date = day + "-" + month + "-" + year;

        return date;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel1 = new javax.swing.JPanel();
        custHomeHeader1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custBackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        custOrderHistoryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        orderHistoryLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        orderHistoryLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        custSubmitReviewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        headerPanel1.setBackground(new java.awt.Color(255, 255, 255));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(0, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("ORDER HISTORY");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanel1Layout = new javax.swing.GroupLayout(headerPanel1);
        headerPanel1.setLayout(headerPanel1Layout);
        headerPanel1Layout.setHorizontalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel1Layout.setVerticalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });

        custOrderHistoryTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custOrderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Food ID", "Food", "Price", "Quantity", "Total Price", "Ordered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custOrderHistoryTable.setToolTipText("");
        custOrderHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custOrderHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(custOrderHistoryTable);
        if (custOrderHistoryTable.getColumnModel().getColumnCount() > 0) {
            custOrderHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel.setForeground(new java.awt.Color(0, 0, 0));
        orderHistoryLabel.setText("Order History");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel1.setForeground(new java.awt.Color(0, 0, 0));
        orderHistoryLabel1.setText("Review");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderHistoryLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel1)
                .addContainerGap())
        );

        reviewTextArea.setColumns(20);
        reviewTextArea.setRows(5);
        jScrollPane1.setViewportView(reviewTextArea);

        custSubmitReviewBtn.setBackground(new java.awt.Color(0, 48, 73));
        custSubmitReviewBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custSubmitReviewBtn.setForeground(new java.awt.Color(255, 255, 255));
        custSubmitReviewBtn.setText("SUBMIT REVIEW");
        custSubmitReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSubmitReviewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custSubmitReviewBtn))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(267, 267, 267)
                                    .addComponent(jLabel2)))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custSubmitReviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(headerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

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

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        CustomerHome mgrBack = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        logger.info("User " + cust.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custOrderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMouseClicked
        
    }//GEN-LAST:event_custOrderHistoryTableMouseClicked
    
    //Appends customer review into the text file
    private void custSubmitReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSubmitReviewBtnActionPerformed
        FileHandling fh = new FileHandling();
        File reviewFile = new File("customerReviews.txt");
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        
        try {
            if (!"NA".equals(fh.locateItemInFile(orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 0).toString(), orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 0).toString(), reviewFile, 0, 1))){
                javax.swing.JOptionPane.showMessageDialog(null, "Order has already been reviewed.");
                reviewTextArea.setText(null);
            }
            
            else if(custOrderHistoryTable.getSelectedRowCount() == 1){
                if(reviewTextArea.getText().length()<4){
                    javax.swing.JOptionPane.showMessageDialog(null, "Minimum of 10 characters.");
                }
                
                else if (reviewTextArea.getText().length()<300||reviewTextArea.getText().length()>4){
                    String reviewContents = orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString() 
                            + "|" + cust.getUserID()
                            + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 1).toString()
                            + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 2).toString()
                            + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 6).toString()
                            + "|" + reviewTextArea.getText();
                    reviewTextArea.setText(null);
                    try {
                        fh.appendToFile(reviewContents, reviewFile);
                        logger.info("User " + cust.getUserID() + " has submitted a review for Order ID " + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString());
                        javax.swing.JOptionPane.showMessageDialog(null, "Order review submitted.");
                    } catch (IOException e) {
                        logger.error("Exception occurred - " + e.toString());
                        javax.swing.JOptionPane.showMessageDialog(null, "File cannot be opened.");
                    }
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Maximum of 300 characters.");
                }
            }
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_custSubmitReviewBtnActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerOrderHistory().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTable custOrderHistoryTable;
    private javax.swing.JButton custSubmitReviewBtn;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orderHistoryLabel;
    private javax.swing.JLabel orderHistoryLabel1;
    private javax.swing.JTextArea reviewTextArea;
    // End of variables declaration//GEN-END:variables
}
