package General;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManagerLogin extends javax.swing.JFrame {
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    private static Logger logger = LogManager.getLogger();

    public ManagerLogin() {
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
        mgrLoginHeader = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mgrIDLabel = new javax.swing.JLabel();
        mgrPasswordField = new javax.swing.JPasswordField();
        mgrIDField = new javax.swing.JTextField();
        mgrBackBtn = new javax.swing.JButton();
        mgrClearBtn = new javax.swing.JButton();
        mgrLoginBtn = new javax.swing.JButton();
        mgrPasswordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        mgrLoginHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrLoginHeader.setForeground(new java.awt.Color(0, 0, 0));
        mgrLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrLoginHeader.setText("MANAGER LOGIN");
        mgrLoginHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mgrLoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mgrLoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        mgrIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setText("Manager ID:");

        mgrPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        mgrPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mgrPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        mgrPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrPasswordFieldActionPerformed(evt);
            }
        });
        mgrPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mgrPasswordFieldKeyPressed(evt);
            }
        });

        mgrIDField.setBackground(new java.awt.Color(244, 244, 244));
        mgrIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mgrIDField.setForeground(new java.awt.Color(0, 0, 0));
        mgrIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrIDFieldActionPerformed(evt);
            }
        });

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });

        mgrClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrClearBtn.setText("CLEAR");
        mgrClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrClearBtnActionPerformed(evt);
            }
        });

        mgrLoginBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrLoginBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrLoginBtn.setText("LOGIN");
        mgrLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLoginBtnActionPerformed(evt);
            }
        });

        mgrPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setText("Password:");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mgrIDLabel)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77)
                        .addComponent(mgrPasswordLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(mgrPasswordField)
                        .addGap(188, 188, 188))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(mgrIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(188, Short.MAX_VALUE))))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(355, 355, 355)
                    .addComponent(mgrLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(mgrClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(mgrBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgrIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgrIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgrPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgrPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addContainerGap(307, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mgrLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mgrClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mgrBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(84, 84, 84)))
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
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void mgrPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrPasswordFieldActionPerformed
    
    }//GEN-LAST:event_mgrPasswordFieldActionPerformed

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        logger.info("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    private void mgrLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLoginBtnActionPerformed
        
        //Gets the user ID and password from the text fields and converts the password to SHA-256 format
        mgr.setUserID(mgrIDField.getText());
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception occurred - " + e.toString());
        }
        
        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        
        //If the user ID keyed in is admin and the password is "admin123" it will be logged in as the administrator
        if (mgr.getUserID().equals("admin") && mgr.getUserPassword().equals("240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9")){
                JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
                ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                mgrLogin.setVisible(true);
                this.dispose();        
        } 
        
        //If it's not the admin id and password the login will be as a manager account 
        else {
            try {
                //The manager file is first checked if the user ID is present and the if the account is set to APPROVED
                if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), "APPROVED", file, 0, 4))){
                    
                    //Next, if the password is equivalent to the password within the same line it will log the user in
                    if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), mgr.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                        mgrLogin.setVisible(true);
                        this.dispose();
                        logger.info("Manager " + mgr.getUserID() + " has logged in successfully.");
                     
                    //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Unsuccessful. Incorrect ID or Password.");
                        logger.error("A user has failed to login with an incorrect ID or Password.");
                    }   
                    
                //If the manager ID is not found in the manager text file then it will show an error
                } else {
                    JOptionPane.showMessageDialog(null, "Manager ID does not exist.");
                    logger.error("A user has typed in a Manager ID that does not exist.");
                }
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
            }
        }
    }//GEN-LAST:event_mgrLoginBtnActionPerformed

    private void mgrIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrIDFieldActionPerformed

    }//GEN-LAST:event_mgrIDFieldActionPerformed

    private void mgrClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrClearBtnActionPerformed
        mgrIDField.setText(null);
        mgrPasswordField.setText(null);
        logger.info("A user has cleared the fields in Customer Login page.");
    }//GEN-LAST:event_mgrClearBtnActionPerformed

    private void mgrPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mgrPasswordFieldKeyPressed
        
        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            mgr.setUserID(mgrIDField.getText());
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception occurred - " + e.toString());
        }
        
        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        
        
        if (mgr.getUserID().equals("admin") && mgr.getUserPassword().equals("240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9")){
                JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
                ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                mgrLogin.setVisible(true);
                this.dispose();
                logger.info("Admin " + mgr.getUserID() + " has logged in successfully.");
            }
        
        else{
            try {

                if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), "APPROVED", file, 0, 4))){
                    if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), mgr.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                        mgrLogin.setVisible(true);
                        this.dispose();
                        logger.info("User " + mgr.getUserID() + " has logged in successfully.");
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Login Unsuccessful. Incorrect ID or Password.");
                        logger.error("A user has failed to login with an incorrect ID or Password.");
                    }   
                }

                else{
                    JOptionPane.showMessageDialog(null, "Manager ID does not exist.");
                    logger.error("A user has typed in a Manager ID that does not exist.");
                }
            } catch (IOException e) {
                logger.error("Exception occurred - " + e.toString());
            }
        }
        }
    }//GEN-LAST:event_mgrPasswordFieldKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrClearBtn;
    private javax.swing.JTextField mgrIDField;
    private javax.swing.JLabel mgrIDLabel;
    private javax.swing.JButton mgrLoginBtn;
    private javax.swing.JLabel mgrLoginHeader;
    private javax.swing.JPasswordField mgrPasswordField;
    private javax.swing.JLabel mgrPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
