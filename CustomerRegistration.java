package General;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    private static Logger logger = LogManager.getLogger();
    
    public CustomerRegistration() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        custPasswordLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        custEmailLabel = new javax.swing.JLabel();
        custPasswordField = new javax.swing.JPasswordField();
        custEmailField = new javax.swing.JTextField();
        custIDField = new javax.swing.JTextField();
        custNameField = new javax.swing.JTextField();
        custRegisterBtn = new javax.swing.JButton();
        custBackBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        custRegHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 600));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        custIDLabel.setText("Customer ID:");

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setText("Password:");

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        custNameLabel.setText("Customer Name:");

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setText("Email:");

        custPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        custPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        custPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });

        custEmailField.setBackground(new java.awt.Color(255, 255, 255));
        custEmailField.setForeground(new java.awt.Color(0, 0, 0));
        custEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        custEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custEmailFieldActionPerformed(evt);
            }
        });

        custIDField.setBackground(new java.awt.Color(255, 255, 255));
        custIDField.setForeground(new java.awt.Color(0, 0, 0));
        custIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });

        custNameField.setBackground(new java.awt.Color(255, 255, 255));
        custNameField.setForeground(new java.awt.Color(0, 0, 0));
        custNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        custNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameFieldActionPerformed(evt);
            }
        });

        custRegisterBtn.setBackground(new java.awt.Color(0, 48, 73));
        custRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        custRegisterBtn.setText("REGISTER");
        custRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegisterBtnActionPerformed(evt);
            }
        });

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });

        custClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        custClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        custClearBtn.setText("CLEAR");
        custClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custPasswordLabel)
                            .addComponent(custEmailLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custIDLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(custPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custNameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custIDField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                        .addComponent(custRegisterBtn)
                        .addGap(18, 18, 18)
                        .addComponent(custClearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(custBackBtn))
                    .addComponent(custEmailField))
                .addGap(267, 267, 267))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custRegisterBtn)
                    .addComponent(custClearBtn)
                    .addComponent(custBackBtn))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        custRegHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custRegHeader.setForeground(new java.awt.Color(0, 0, 0));
        custRegHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custRegHeader.setText("CUSTOMER REGISTRATION");
        custRegHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custRegHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custRegHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed
  
    }//GEN-LAST:event_custPasswordFieldActionPerformed

    private void custEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custEmailFieldActionPerformed
  
    }//GEN-LAST:event_custEmailFieldActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed
   
    }//GEN-LAST:event_custIDFieldActionPerformed

    //Clears the text fields to null upon click
    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custNameField.setText(null);
        custPasswordField.setText(null);
        custEmailField.setText(null);
        logger.info("A user has cleared the fields in Customer Registration page.");
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameFieldActionPerformed
 
    }//GEN-LAST:event_custNameFieldActionPerformed

    private void custRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegisterBtnActionPerformed
        
        //Converts UserID and UserName to UpperCase
        cust.setUserID(custIDField.getText().toUpperCase());
        cust.setUserName(custNameField.getText().toUpperCase());
        try {
            cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception occurred - " + e.toString());
        }
        cust.setUserEmail(custEmailField.getText());

        // Setting the default balance among users
        String custRegCredentials = cust.concatenateCredentials() + "|50.0";
            
        //Create FileHandling object and file object to store data into the the customer account text file
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");
        
        try {
            //If any of the text fields are blank then an error message is shown
            if (cust.getUserID().equals("")||cust.getUserName().equals("")||
                cust.getUserPassword().equals("")||cust.getUserEmail().equals("")){
                    logger.error("A user did not enter all data fields.");
                    JOptionPane.showMessageDialog(null, "Error: Please fill out all text fields.");
            }
            
            // If the manager ID exists within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                logger.error("A user entered an existing Customer ID.");
                JOptionPane.showMessageDialog(null, "Error: Customer ID already exists.");
            }

            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserEmail(), file, 3))){
                logger.error("A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Customer Email already exists.");
            }
            
            //If all the other conditions are met then the user will be registered successfully
            else {
                custFile.appendToFile(custRegCredentials, file);
                logger.info("User " + cust.getUserID() + " has been registered successfully.");
                WelcomePage custBack = new WelcomePage();
                custBack.setVisible(true);
                this.dispose();
                logger.info("User " + custIDField.getText().toUpperCase() + " has attempted to view Welcome page.");
            }
            
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
        }        
    }//GEN-LAST:event_custRegisterBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        logger.info("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_custBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custEmailField;
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JTextField custNameField;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JLabel custRegHeader;
    private javax.swing.JButton custRegisterBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
