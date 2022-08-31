package General;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManagerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    private static Logger logger = LogManager.getLogger();
    
    public ManagerRegistration() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mgrIDLabel = new javax.swing.JLabel();
        mgrPasswordLabel = new javax.swing.JLabel();
        mgrNameLabel = new javax.swing.JLabel();
        mgrEmailLabel = new javax.swing.JLabel();
        mgrPasswordField = new javax.swing.JPasswordField();
        mgrEmailField = new javax.swing.JTextField();
        mgrIDField = new javax.swing.JTextField();
        mgrNameField = new javax.swing.JTextField();
        mgrRegisterBtn = new javax.swing.JButton();
        mgrBackBtn = new javax.swing.JButton();
        mgrClearBtn = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        mgrRegHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        mgrIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setText("Manager ID:");

        mgrPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setText("Password:");

        mgrNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrNameLabel.setText("Manager Name:");

        mgrEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrEmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        mgrEmailLabel.setText("Email:");

        mgrPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        mgrPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrPasswordFieldActionPerformed(evt);
            }
        });

        mgrEmailField.setBackground(new java.awt.Color(244, 244, 244));
        mgrEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrEmailFieldActionPerformed(evt);
            }
        });

        mgrIDField.setBackground(new java.awt.Color(244, 244, 244));
        mgrIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrIDFieldActionPerformed(evt);
            }
        });

        mgrNameField.setBackground(new java.awt.Color(244, 244, 244));
        mgrNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(244, 244, 244))); // NOI18N

        mgrRegisterBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrRegisterBtn.setText("REGISTER");
        mgrRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRegisterBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mgrPasswordLabel)
                            .addComponent(mgrEmailLabel)))
                    .addComponent(mgrIDLabel)
                    .addComponent(mgrNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mgrPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgrNameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgrIDField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(mgrRegisterBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mgrClearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(mgrBackBtn))
                    .addComponent(mgrEmailField))
                .addGap(267, 267, 267))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgrRegisterBtn)
                    .addComponent(mgrClearBtn)
                    .addComponent(mgrBackBtn))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        mgrRegHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrRegHeader.setForeground(new java.awt.Color(0, 0, 0));
        mgrRegHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrRegHeader.setText("MANAGER REGISTRATION");
        mgrRegHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mgrRegHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mgrRegHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrPasswordFieldActionPerformed

    }//GEN-LAST:event_mgrPasswordFieldActionPerformed

    private void mgrEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrEmailFieldActionPerformed

    }//GEN-LAST:event_mgrEmailFieldActionPerformed

    private void mgrIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrIDFieldActionPerformed

    }//GEN-LAST:event_mgrIDFieldActionPerformed

    private void mgrClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrClearBtnActionPerformed
        mgrIDField.setText(null);
        mgrNameField.setText(null);
        mgrPasswordField.setText(null);
        mgrEmailField.setText(null);
        logger.info("A user has cleared the fields in Customer Registration page.");
    }//GEN-LAST:event_mgrClearBtnActionPerformed

    private void mgrRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRegisterBtnActionPerformed
        
        //Converts UserID and UserName to UpperCase
        mgr.setUserID(mgrIDField.getText().toUpperCase());
        mgr.setUserName(mgrNameField.getText().toUpperCase());
        
        //Converts password into hash format of SHA-256
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception occurred - " + e.toString());
        }
        mgr.setUserEmail(mgrEmailField.getText());
        
        //Stores contents string of credentials into variable to be appended into the file later
        String mgrRegCredentials = mgr.concatenateCredentials() + "|TO BE APPROVED";
        
        //Create FileHandling object and file object to store data into the the manager account text file    
        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        
        try {
            
            //If any of the text fields are blank then an error message is shown
            if (mgr.getUserID().equals("")||mgr.getUserName().equals("")||
                mgr.getUserPassword().equals("")||mgr.getUserEmail().equals("")){
                logger.error("A user did not enter all data fields.");
                JOptionPane.showMessageDialog(null, "Error: All text fields must be filled out.");
            }
            // If the manager ID exists within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), file, 0))){
                logger.error("A user entered an existing Manager ID.");
                JOptionPane.showMessageDialog(null, "Error: Manager ID already exists.");
            }
            
            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserEmail(), file, 3))){
                logger.error("A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Manager Email already exists.");
            }
            
            //If all the other conditions are met then the user will be registered successfully
            else {
                mgrFile.appendToFile(mgrRegCredentials, file);
                logger.info("Manager " + mgr.getUserID() + " has been registered successfully.");
                WelcomePage mgrBack = new WelcomePage();
                mgrBack.setVisible(true);
                this.dispose();
                logger.info("Manager " + mgrIDField.getText().toUpperCase() + " has attempted to view Welcome page.");
            }
            
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_mgrRegisterBtnActionPerformed

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        logger.info("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrClearBtn;
    private javax.swing.JTextField mgrEmailField;
    private javax.swing.JLabel mgrEmailLabel;
    private javax.swing.JTextField mgrIDField;
    private javax.swing.JLabel mgrIDLabel;
    private javax.swing.JTextField mgrNameField;
    private javax.swing.JLabel mgrNameLabel;
    private javax.swing.JPasswordField mgrPasswordField;
    private javax.swing.JLabel mgrPasswordLabel;
    private javax.swing.JLabel mgrRegHeader;
    private javax.swing.JButton mgrRegisterBtn;
    // End of variables declaration//GEN-END:variables
}
