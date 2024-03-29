package General;


import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManagerMenu extends javax.swing.JFrame implements Menu {
      
    private String foodID;
    private String food;
    private double price;
    private String type;
    private String status;
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    private static Logger logger = LogManager.getLogger();
    
    // Create new form "ManagerMenu"
    public ManagerMenu(String userID, String userPassword) {
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
    
    // Clearing the input for the menu
    @Override
    public void refreshMenuSelection() {
        foodIDTF.setText(null);
        foodTF.setText(null);
        priceTF.setText(null);
        typeDDL.setSelectedItem("Select type");
        statusDDL.setSelectedItem("Select type");
    }

    // To load the menu by putting everything in menu.txt to menu table
    @Override
    public void loadMenu() {
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        menuTableModel.setRowCount(0);
        File file = new File(MENUFILE);
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Adding the data into the menu table
                    menuTableModel.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4]});
                }
                br.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
                logger.error("IOException occured: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
            logger.error("FileNotFoundException occured: " + e.getMessage());
        }
    }


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
        menuTable = new javax.swing.JTable();
        menuLabel = new javax.swing.JLabel();
        menuInputPanel = new javax.swing.JPanel();
        foodIDLabel = new javax.swing.JLabel();
        foodIDTF = new javax.swing.JTextField();
        foodLabel = new javax.swing.JLabel();
        foodTF = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        statusDDL = new javax.swing.JComboBox<>();
        typeDDL = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

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
                .addGap(31, 31, 31)
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(617, Short.MAX_VALUE))
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(topPanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datetimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLabel))
                .addGap(22, 22, 22))
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(topPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));
        tablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food", "Price", "Type", "Status"
            }
        ));
        menuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(4).setResizable(false);
        }

        tablePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, 474, 380));

        menuLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(18, 18, 18));
        menuLabel.setText("MENU");
        tablePanel.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        menuInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuInputPanel.setPreferredSize(new java.awt.Dimension(380, 433));
        menuInputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodIDLabel.setForeground(new java.awt.Color(18, 18, 18));
        foodIDLabel.setText("Food ID:");
        menuInputPanel.add(foodIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        foodIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        foodIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodIDTFActionPerformed(evt);
            }
        });
        menuInputPanel.add(foodIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 345, 32));

        foodLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(18, 18, 18));
        foodLabel.setText("Food :");
        menuInputPanel.add(foodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, -1, -1));

        foodTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        foodTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodTFActionPerformed(evt);
            }
        });
        menuInputPanel.add(foodTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, 346, 32));

        priceLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(18, 18, 18));
        priceLabel.setText("Price :");
        menuInputPanel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, -1, -1));

        priceTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        menuInputPanel.add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 187, 346, 32));

        typeLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(18, 18, 18));
        typeLabel.setText("Type :");
        menuInputPanel.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 237, -1, -1));

        statusLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(18, 18, 18));
        statusLabel.setText("Status :");
        menuInputPanel.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 237, -1, -1));

        deleteButton.setBackground(new java.awt.Color(0, 48, 73));
        deleteButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        menuInputPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 319, 108, 100));

        addButton.setBackground(new java.awt.Color(0, 48, 73));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        menuInputPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, 108, 100));

        updateButton.setBackground(new java.awt.Color(0, 48, 73));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setMaximumSize(new java.awt.Dimension(76, 28));
        updateButton.setMinimumSize(new java.awt.Dimension(76, 28));
        updateButton.setPreferredSize(new java.awt.Dimension(76, 28));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        menuInputPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 319, 103, 100));

        statusDDL.setBackground(new java.awt.Color(255, 255, 255));
        statusDDL.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        statusDDL.setForeground(new java.awt.Color(18, 18, 18));
        statusDDL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "Available", "Out of Stock" }));
        menuInputPanel.add(statusDDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        typeDDL.setBackground(new java.awt.Color(255, 255, 255));
        typeDDL.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        typeDDL.setForeground(new java.awt.Color(18, 18, 18));
        typeDDL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "Food", "Drink" }));
        menuInputPanel.add(typeDDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

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

        refreshButton.setBackground(new java.awt.Color(0, 48, 73));
        refreshButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
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

    // Putting everything from the menu table to menu.txt
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        try {
            File file = new File(MENUFILE);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Getting the data in menu table by row and column
            for(int row = 0; row < menuTableModel.getRowCount(); row++) {
                for(int col = 0; col < menuTableModel.getColumnCount(); col++) {
                    String data = (String)menuTableModel.getValueAt(row, col);
                    // Appending | delimeter after every entry
                    bw.write(data + "|");
                }
                bw.newLine();
            }
            // REMEMBER TO CLOSE BufferedWriter FIRST !
            bw.close();
            fw.close();
        } catch (IOException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        // Clearing the input for the menu
        refreshMenuSelection();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        FileHandling fh = new FileHandling();
        File file = new File(MENUFILE);

        // Getting user input
        foodID = foodIDTF.getText().toUpperCase();
        try {
            // If the Food ID already exists, show error
            if (!"NA".equals(fh.locateItemInFile(foodID, file, 0))) {
                logger.error("Exception occured: User " + mgr.getUserID() + " entered an existing Food ID.");
                JOptionPane.showMessageDialog(null, "Error: Food ID already exist.");
            
            // If the Food ID doesn't exist, proceed
            } else {
                food = foodTF.getText().toUpperCase();
                
                try {
                    String strPrice = priceTF.getText();
                    price = Double.parseDouble(strPrice);
                    price = Math.round(price * 100.0) / 100.0;
                } catch (NumberFormatException e){
                    // Throw error if it can't be converted to double
                    logger.error("Exception occurred - " + e.toString());
                    JOptionPane.showMessageDialog(null, "Please insert numbers only.");
                }
                type = typeDDL.getSelectedItem().toString().toUpperCase();
                status = statusDDL.getSelectedItem().toString().toUpperCase();


                // If any of the 5 fields is left blank then show a message, if not, put it into menu.txt & menu
                if(foodIDTF.getText().equals("") || foodTF.getText().equals("") || priceTF.getText().equals("") || 
                    typeDDL.getSelectedItem().toString().equals("Select type") || statusDDL.getSelectedItem().toString().equals("Select type")) {
                    // If any of the 5 fields is left blank then show a message
                    logger.error("Exception occured: User " + mgr.getUserID() + " did not enter all data fields.");
                    JOptionPane.showMessageDialog(null, "Error: Please enter all data fields!");
 
                } else {
                    DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();

                    // Store inputted data into a String array
                    String[] data = {foodID, food, Double.toString(price), type, status};

                    // Add string array data to menu
                    menuTableModel.addRow(data);
                    logger.info("User " + mgr.getUserID() + " has added Food ID " + foodIDTF.getText() + "into the Menu.");
                    JOptionPane.showMessageDialog(null,"Data added successfully!");

                    // Add string data to menu.txt
                    try {
                        String fileData = foodID + "|" + food + "|" + price + "|" + type + "|" + status;
                        fh.appendToFile(fileData, file);
                    } catch (IOException e) {
                        logger.error("Exception occurred - " + e.toString());
                        JOptionPane.showMessageDialog(null, "File does not exist!");
                    }

                    // Clearing the input for the menu
                    refreshMenuSelection();
                }
            }
        } catch (HeadlessException | IOException e) {
            logger.error("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed

    // Delete selected rows
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        
        if (menuTable.getSelectedRowCount() >= 1) {
            menuTableModel.removeRow(menuTable.getSelectedRow());
            logger.error("User " + mgr.getUserID() + " deleted an item from the menu.");
            JOptionPane.showMessageDialog(null, "Item successfully deleted from menu!");
            
        } else if (menuTable.getRowCount() == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No row is selected for deleting!");
        }
    
        // Clearing the input for the menu
        refreshMenuSelection();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
   
    }//GEN-LAST:event_priceTFActionPerformed

    private void foodTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodTFActionPerformed

    }//GEN-LAST:event_foodTFActionPerformed

    private void foodIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodIDTFActionPerformed

    }//GEN-LAST:event_foodIDTFActionPerformed

    private void datetimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetimeTFActionPerformed

    }//GEN-LAST:event_datetimeTFActionPerformed

    // Refreshes the table by putting everything in menu.txt to menu table
    // - To avoid someone making changes by clicking on menu table and doesn't update
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadMenu();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void menuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseClicked
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        
        foodIDTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),0 ).toString());
        foodTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),1 ).toString());
        priceTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),2 ).toString());
        typeDDL.setSelectedItem("Select type");
        statusDDL.setSelectedItem("Select type");
    }//GEN-LAST:event_menuTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField datetimeTF;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel foodIDLabel;
    private javax.swing.JTextField foodIDTF;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JTextField foodTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuInputPanel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> statusDDL;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JComboBox<String> typeDDL;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    
}
