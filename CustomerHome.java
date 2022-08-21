/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JFrame;

/**
 *
 * @author darrs
 */
public class CustomerHome extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    
    public CustomerHome(String userID) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cust.setUserID(userID);
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
        custProfileBtn = new javax.swing.JButton();
        custMenuBtn = new javax.swing.JButton();
        custOrderHistoryBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

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
                .addComponent(custHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
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

        custProfileBtn.setBackground(new java.awt.Color(0, 48, 73));
        custProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        custProfileBtn.setText("Profile");
        custProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProfileBtnActionPerformed(evt);
            }
        });

        custMenuBtn.setBackground(new java.awt.Color(0, 48, 73));
        custMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        custMenuBtn.setText("Menu");
        custMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custMenuBtnActionPerformed(evt);
            }
        });

        custOrderHistoryBtn.setBackground(new java.awt.Color(0, 48, 73));
        custOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custOrderHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        custOrderHistoryBtn.setText("Order History");
        custOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        custOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custOrderHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(custOrderHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(custLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(custMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(custProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custOrderHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(custLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLogoutBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_custLogoutBtnActionPerformed

    private void custProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProfileBtnActionPerformed
        CustomerProfile custProfile = new CustomerProfile(cust.getUserID());
        custProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custProfileBtnActionPerformed

    private void custOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custOrderHistoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custOrderHistoryBtnActionPerformed

    private void custMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMenuBtnActionPerformed
        CustomerMenu custMenu = new CustomerMenu(cust.getUserID());
        custMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custMenuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JButton custLogoutBtn;
    private javax.swing.JButton custMenuBtn;
    private javax.swing.JButton custOrderHistoryBtn;
    private javax.swing.JButton custProfileBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}