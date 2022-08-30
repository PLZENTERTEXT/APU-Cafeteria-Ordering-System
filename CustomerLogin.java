package General;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerLogin extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    private static Logger logger = LogManager.getLogger();
    
    public CustomerLogin() {
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
        headerPanel = new javax.swing.JPanel();
        custLoginHeader = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custPasswordLabel = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        custPasswordField = new javax.swing.JPasswordField();
        custIDField = new javax.swing.JTextField();
        custLoginBtn = new javax.swing.JButton();
        custBackBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 640));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        custLoginHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custLoginHeader.setForeground(new java.awt.Color(0, 0, 0));
        custLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custLoginHeader.setText("CUSTOMER LOGIN");
        custLoginHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custLoginHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custLoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custLoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setText("Password:");

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        custIDLabel.setText("Customer ID:");

        custPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        custPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });
        custPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custPasswordFieldKeyPressed(evt);
            }
        });

        custIDField.setBackground(new java.awt.Color(255, 255, 255));
        custIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custIDField.setForeground(new java.awt.Color(0, 0, 0));
        custIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });

        custLoginBtn.setBackground(new java.awt.Color(0, 48, 73));
        custLoginBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        custLoginBtn.setText("LOGIN");
        custLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginBtnActionPerformed(evt);
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
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(custIDLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custPasswordLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(custLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(custClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(custIDField)
                    .addComponent(custPasswordField))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed

    }//GEN-LAST:event_custPasswordFieldActionPerformed
        
    //Gets the user ID and password from the text fields and converts the password to SHA-256 format
    private void custLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginBtnActionPerformed
        cust.setUserID(custIDField.getText());
        try {
            cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception occurred - " + e.toString());
        }
        
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");
        
        try {
            
            //The customer file is first checked if the user ID is present and the if the account is set to APPROVED
            if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                
                //Next, if the password is equivalent to the password within the same line it will log the user in
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                    custLogin.setVisible(true);
                    this.dispose();
                    logger.info("User " + cust.getUserID() + " has logged in successfully.");
                }
                
                //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                else{
                    JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                    logger.error("A user has failed to login with an incorrect ID or Password.");
                }   
            }
            //If the customer ID is not found in the manager text file then it will show an error
            else{
                JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                logger.error("A user has typed in a Customer ID that does not exist.");
            }
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_custLoginBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        logger.info("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custPasswordField.setText(null);
        logger.info("A user has cleared the fields in Customer Login page.");
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed

    }//GEN-LAST:event_custIDFieldActionPerformed

    private void custPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custPasswordFieldKeyPressed
       
        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            cust.setUserID(custIDField.getText());
            try {
                cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
            } catch (NoSuchAlgorithmException e) {
                logger.error("Exception occurred - " + e.toString());
            }

            FileHandling custFile = new FileHandling();
            File file = new File("custAccount.txt");

            try {
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                    if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                        custLogin.setVisible(true);
                        this.dispose();
                        logger.info("User " + cust.getUserID() + " has logged in successfully.");
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                        logger.error("A user has failed to login with an incorrect ID or Password.");
                    }   
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                    logger.error("A user has typed in a Customer ID that does not exist.");
                }
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
            }
        }
    }//GEN-LAST:event_custPasswordFieldKeyPressed

  
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.error("Exception occurred - " + ex.toString());
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JButton custLoginBtn;
    private javax.swing.JLabel custLoginHeader;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
