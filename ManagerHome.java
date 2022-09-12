package General;

import Utilities.UserRegistrationInfo;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManagerHome extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    private static Logger logger = LogManager.getLogger();
    
    public ManagerHome(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        
        if (userID.equals("admin")){
            mgrHomeHeader.setText("ADMIN HOME");
        } else {
            mgrHomeHeader.setText("MANAGER HOME");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel1 = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mgrLogoutBtn = new javax.swing.JButton();
        mgrProfileBtn = new javax.swing.JButton();
        mgrUpdateMenuBtn = new javax.swing.JButton();
        mgrSalesReportBtn = new javax.swing.JButton();
        mgrAccountApprovalBtn = new javax.swing.JButton();
        mgrFeedbackBtn = new javax.swing.JButton();
        mgrOrderHistoryBtn = new javax.swing.JButton();
        mgrManageOrderBtn = new javax.swing.JButton();
        mgrAuditLogBtn = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        mgrHomeHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel1.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel1.setForeground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel1.setText("USER ID");
        userPanel.add(userDisplayLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        userPanel.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 120, 70));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        mgrLogoutBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        mgrLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrLogoutBtn.setText("LOGOUT");
        mgrLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLogoutBtnActionPerformed(evt);
            }
        });

        mgrProfileBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrProfileBtn.setText("Profile");
        mgrProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrProfileBtnActionPerformed(evt);
            }
        });

        mgrUpdateMenuBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrUpdateMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrUpdateMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrUpdateMenuBtn.setText("Update Menu");
        mgrUpdateMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrUpdateMenuBtnActionPerformed(evt);
            }
        });

        mgrSalesReportBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrSalesReportBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrSalesReportBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrSalesReportBtn.setText("Sales Report");
        mgrSalesReportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrSalesReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrSalesReportBtnActionPerformed(evt);
            }
        });

        mgrAccountApprovalBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrAccountApprovalBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrAccountApprovalBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrAccountApprovalBtn.setText("Account Approval");
        mgrAccountApprovalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrAccountApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrAccountApprovalBtnActionPerformed(evt);
            }
        });

        mgrFeedbackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrFeedbackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrFeedbackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrFeedbackBtn.setText("Feedback");
        mgrFeedbackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrFeedbackBtnActionPerformed(evt);
            }
        });

        mgrOrderHistoryBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrOrderHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrOrderHistoryBtn.setText("Order History");
        mgrOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrOrderHistoryBtnActionPerformed(evt);
            }
        });

        mgrManageOrderBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrManageOrderBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrManageOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrManageOrderBtn.setText("Manage Order");
        mgrManageOrderBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrManageOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrManageOrderBtnActionPerformed(evt);
            }
        });

        mgrAuditLogBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrAuditLogBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrAuditLogBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrAuditLogBtn.setText("Audit Log");
        mgrAuditLogBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrAuditLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrAuditLogBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mgrLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mgrUpdateMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(mgrProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(mgrSalesReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(mgrOrderHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgrManageOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(mgrAccountApprovalBtn)
                .addGap(51, 51, 51)
                .addComponent(mgrAuditLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrUpdateMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrOrderHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrManageOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgrProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrSalesReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgrFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgrAccountApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgrAuditLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(mgrLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        mgrHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrHomeHeader.setForeground(new java.awt.Color(0, 0, 0));
        mgrHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrHomeHeader.setText("MANAGER HOME");
        mgrHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        mgrHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mgrHomeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mgrHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void mgrLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLogoutBtnActionPerformed
        WelcomePage mgrLogout = new WelcomePage();
        mgrLogout.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Welcome page.");
    }//GEN-LAST:event_mgrLogoutBtnActionPerformed

    private void mgrFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrFeedbackBtnActionPerformed
        ManagerFeedback mgrFeedback = new ManagerFeedback(mgr.getUserID(), mgr.getUserPassword());
        mgrFeedback.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Feedback page.");
    }//GEN-LAST:event_mgrFeedbackBtnActionPerformed

    private void mgrUpdateMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrUpdateMenuBtnActionPerformed
        ManagerMenu mgrMenu = new ManagerMenu(mgr.getUserID(), mgr.getUserPassword());
        mgrMenu.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Menu page.");
    }//GEN-LAST:event_mgrUpdateMenuBtnActionPerformed

    private void mgrOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrOrderHistoryBtnActionPerformed
        ManagerOrderHistory mgrOrderHistory = new ManagerOrderHistory(mgr.getUserID(), mgr.getUserPassword());
        mgrOrderHistory.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Order History page.");
    }//GEN-LAST:event_mgrOrderHistoryBtnActionPerformed

    private void mgrProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrProfileBtnActionPerformed
        ManagerProfile mgrProfile = new ManagerProfile(mgr.getUserID(), mgr.getUserPassword());
        mgrProfile.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Profile page.");
    }//GEN-LAST:event_mgrProfileBtnActionPerformed

    private void mgrSalesReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrSalesReportBtnActionPerformed
        ManagerSalesReport mgrSalesReport;
        try {
            mgrSalesReport = new ManagerSalesReport(mgr.getUserID(), mgr.getUserPassword());
            mgrSalesReport.setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Sales Report page.");
    }//GEN-LAST:event_mgrSalesReportBtnActionPerformed

    private void mgrManageOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrManageOrderBtnActionPerformed
        ManagerManageOrder mgrManageOrder = new ManagerManageOrder(mgr.getUserID(), mgr.getUserPassword());
        mgrManageOrder.setVisible(true);
        this.dispose();
        logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Manage Order page.");
    }//GEN-LAST:event_mgrManageOrderBtnActionPerformed

    private void mgrAccountApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAccountApprovalBtnActionPerformed
        if (mgr.getUserID().equals("admin")){    
            ManagerApproval mgrApproval = new ManagerApproval(mgr.getUserID(),mgr.getUserPassword());
            mgrApproval.setVisible(true);
            this.dispose();
            logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Account Approval page.");
        } else {
            logger.info("Manager " + mgr.getUserID() + " that did not have admin level access has attempted to view Manager Account Approval page.");
            JOptionPane.showMessageDialog(null, "Page requires admin level access.");
        }
    }//GEN-LAST:event_mgrAccountApprovalBtnActionPerformed

    private void mgrAuditLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAuditLogBtnActionPerformed
        if (mgr.getUserID().equals("admin")){
            ManagerAuditLog mgrAuditLog  = new ManagerAuditLog (mgr.getUserID(), mgr.getUserPassword());
            mgrAuditLog.setVisible(true);
            this.dispose();
            logger.info("Manager " + mgr.getUserID() + " has attempted to view Manager Audit Log page.");
        } else{
            logger.info("Manager " + mgr.getUserID() + " that did not have admin level access has attempted to view Manager Account Approval page.");
            JOptionPane.showMessageDialog(null, "Page requires admin level access.");
        }
    }//GEN-LAST:event_mgrAuditLogBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrAccountApprovalBtn;
    private javax.swing.JButton mgrAuditLogBtn;
    private javax.swing.JButton mgrFeedbackBtn;
    private javax.swing.JLabel mgrHomeHeader;
    private javax.swing.JButton mgrLogoutBtn;
    private javax.swing.JButton mgrManageOrderBtn;
    private javax.swing.JButton mgrOrderHistoryBtn;
    private javax.swing.JButton mgrProfileBtn;
    private javax.swing.JButton mgrSalesReportBtn;
    private javax.swing.JButton mgrUpdateMenuBtn;
    private javax.swing.JLabel userDisplayLabel1;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
