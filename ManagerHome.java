/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JFrame;

/**
 *
 * @author darrs
 */
public class ManagerHome extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    
    public ManagerHome(String userID) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        mgr.setUserID(userID);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        custHomeHeader = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custLogoutBtn = new javax.swing.JButton();
        mgrProfileBtn = new javax.swing.JButton();
        mgrUpdateMenuBtn = new javax.swing.JButton();
        mgrSalesReportBtn = new javax.swing.JButton();
        mgrAccountApprovalBtn = new javax.swing.JButton();
        mgrFeedbackBtn = new javax.swing.JButton();
        mgrOrderHistoryBtn = new javax.swing.JButton();
        mgrManageOrderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        custHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader.setForeground(new java.awt.Color(0, 0, 0));
        custHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader.setText("HOME");
        custHomeHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        custHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        custLogoutBtn.setBackground(new java.awt.Color(0, 48, 73));
        custLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        custLogoutBtn.setText("LOGOUT");
        custLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLogoutBtnActionPerformed(evt);
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

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mgrUpdateMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(mgrProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mgrOrderHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mgrSalesReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mgrAccountApprovalBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgrFeedbackBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgrManageOrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
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
                            .addComponent(mgrFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(mgrAccountApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(custLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void custLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLogoutBtnActionPerformed
        WelcomePage mgrLogout = new WelcomePage();
        mgrLogout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custLogoutBtnActionPerformed

    private void mgrFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrFeedbackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgrFeedbackBtnActionPerformed

    private void mgrUpdateMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrUpdateMenuBtnActionPerformed
        ManagerMenu mgrMenu = new ManagerMenu(mgr.getUserID());
        mgrMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mgrUpdateMenuBtnActionPerformed

    private void mgrOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrOrderHistoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgrOrderHistoryBtnActionPerformed

    private void mgrProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgrProfileBtnActionPerformed

    private void mgrSalesReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrSalesReportBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgrSalesReportBtnActionPerformed

    private void mgrAccountApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAccountApprovalBtnActionPerformed
        ManagerApproval mgrBack = new ManagerApproval(mgr.getUserID());
        mgrBack.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mgrAccountApprovalBtnActionPerformed

    private void mgrManageOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrManageOrderBtnActionPerformed
        ManagerManageOrder mgrManageOrder = new ManagerManageOrder(mgr.getUserID());
        mgrManageOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mgrManageOrderBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JButton custLogoutBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrAccountApprovalBtn;
    private javax.swing.JButton mgrFeedbackBtn;
    private javax.swing.JButton mgrManageOrderBtn;
    private javax.swing.JButton mgrOrderHistoryBtn;
    private javax.swing.JButton mgrProfileBtn;
    private javax.swing.JButton mgrSalesReportBtn;
    private javax.swing.JButton mgrUpdateMenuBtn;
    // End of variables declaration//GEN-END:variables
}