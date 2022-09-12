package General;


import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManagerManageOrder extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    private static Logger logger = LogManager.getLogger();
    
    private final String POFILE = "pendingOrders.txt";
    private final String COFILE = "completedOrders.txt";
    
    // Create new form "ManagerMenu"
    public ManagerManageOrder(String userID, String userPassword) {
        initComponents();
        setContentPane(mainPanel);
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(1080,635); 

        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);

        // Load the menu as soon as the window loads
        loadMenu();
        
        // Set a formatted date and time in the datetime text field
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateObj.format(formatObj);
        datetimeTF.setText(formattedDate);
    }

    // To load the menu by putting everything in pendingOrders.txt to pendingOrdersTable
    private void loadMenu() {
        DefaultTableModel POTableModel = (DefaultTableModel) pendingOrdersTable.getModel();
        POTableModel.setRowCount(0);
        File file = new File(POFILE);
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Adding the data into the pendingOrdersTable
                    POTableModel.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5]});
                }
                br.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
                logger.error("Exception occurred - " + e.toString());
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
            logger.error("Exception occurred - " + e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        datetimeTF = new javax.swing.JTextField();
        welcomeLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingOrdersTable = new javax.swing.JTable();
        pendingOrdersLabel = new javax.swing.JLabel();
        orderCompleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(244, 244, 244));
        mainPanel.setPreferredSize(new java.awt.Dimension(1080, 600));

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
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(timeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLabel))
                .addGap(22, 22, 22))
        );

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));
        tablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pendingOrdersTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        pendingOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "User ID", "Food ID", "Food", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendingOrdersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingOrdersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pendingOrdersTable);
        if (pendingOrdersTable.getColumnModel().getColumnCount() > 0) {
            pendingOrdersTable.getColumnModel().getColumn(0).setResizable(false);
            pendingOrdersTable.getColumnModel().getColumn(1).setResizable(false);
            pendingOrdersTable.getColumnModel().getColumn(2).setResizable(false);
            pendingOrdersTable.getColumnModel().getColumn(3).setResizable(false);
            pendingOrdersTable.getColumnModel().getColumn(4).setResizable(false);
            pendingOrdersTable.getColumnModel().getColumn(5).setResizable(false);
        }

        tablePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, 860, 330));

        pendingOrdersLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        pendingOrdersLabel.setForeground(new java.awt.Color(18, 18, 18));
        pendingOrdersLabel.setText("Pending Orders:");
        tablePanel.add(pendingOrdersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, -1));

        orderCompleteButton.setBackground(new java.awt.Color(0, 48, 73));
        orderCompleteButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        orderCompleteButton.setForeground(new java.awt.Color(255, 255, 255));
        orderCompleteButton.setText("Order Completed");
        orderCompleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderCompleteButtonActionPerformed(evt);
            }
        });
        tablePanel.add(orderCompleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 240, 40));

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
        userPanel.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 68));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ManagerHome mgrHome = new ManagerHome(mgr.getUserID(), mgr.getUserPassword());
        mgrHome.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_backButtonActionPerformed

    private void datetimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetimeTFActionPerformed

    }//GEN-LAST:event_datetimeTFActionPerformed

    private void pendingOrdersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingOrdersTableMouseClicked

    }//GEN-LAST:event_pendingOrdersTableMouseClicked

    private void orderCompleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderCompleteButtonActionPerformed
        DefaultTableModel POTableModel = (DefaultTableModel) pendingOrdersTable.getModel();
        File POFile = new File(POFILE);
        
        if (pendingOrdersTable.getSelectedRowCount() >= 1) {
            
            int row = pendingOrdersTable.getSelectedRow();
            Object[] section = new Object[6];

            // Getting the data from pendingOrdersTable
            for (int col = 0; col < POTableModel.getColumnCount(); col++) {
                section[col] = POTableModel.getValueAt(row,col);
            }

            String orderID = String.valueOf(section[0]);
            String foodID = String.valueOf(section[2]);

            // Remove the line in pendingOrders.txt
            FileHandling fh = new FileHandling();
            fh.removeLine(POFile, 0, 2, orderID, foodID);

            try {
                // Add the line to completedOrders.txt
                File COFile = new File(COFILE);
                String fileData = section[0] + "|" + section[1] + "|" + section[2] + "|" + section[3] + "|" + section[4] + "|" + section[5];
                fh.appendToFile(fileData, COFile);
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
                throw new IllegalArgumentException("File does not exist!");
            }

            // Reloading the table
            loadMenu();

            JOptionPane.showMessageDialog(null, "Order ID " + orderID + " with Food ID " + foodID + " has been marked as completed!");
            logger.info("Order ID " + orderID + " with Food ID " + foodID + " has been marked as completed by Manager " + mgr.getUserID() + ".");
            
        } else if (pendingOrdersTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for completion!");
        }
    }//GEN-LAST:event_orderCompleteButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField datetimeTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton orderCompleteButton;
    private javax.swing.JLabel pendingOrdersLabel;
    private javax.swing.JTable pendingOrdersTable;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    
}
