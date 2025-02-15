package login_main_view;

import admin_model.User;

import java.awt.Color;
import javax.swing.JPanel;
import main.Main;
import subjectView.*;
import admin_utils.UserManager;
import admin_utils.UserDAO;
import java.util.List;
import student_view.StudentTable;

public class Home extends javax.swing.JFrame {

    private PanelLoginAndRegister loginAndRegister;
    private Color mainGreen = new Color(32, 126, 85);
    private Color lightGreen = new Color(53, 148, 96);

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelAdmin.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        bg = new javax.swing.JPanel();
        slidepane = new javax.swing.JPanel();
        logOutBox = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminBox = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        AdminIcon = new javax.swing.JLabel();
        manageStudentBox = new javax.swing.JPanel();
        StudentManageIcon = new javax.swing.JLabel();
        manageStudentLabel = new javax.swing.JLabel();
        manageSubjectBox = new javax.swing.JPanel();
        SubManageIcon = new javax.swing.JLabel();
        manageSubjectLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        toPutPanel = new javax.swing.JPanel();
        PanelDeafault = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelAdmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailChange = new javax.swing.JLabel();
        passwordChange = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        saveInformation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        bg.setBackground(new java.awt.Color(245, 238, 200));

        slidepane.setBackground(new java.awt.Color(22, 116, 67));
        slidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBox.setBackground(new java.awt.Color(32, 126, 85));
        logOutBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutBoxMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log Out");

        javax.swing.GroupLayout logOutBoxLayout = new javax.swing.GroupLayout(logOutBox);
        logOutBox.setLayout(logOutBoxLayout);
        logOutBoxLayout.setHorizontalGroup(
            logOutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBoxLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        logOutBoxLayout.setVerticalGroup(
            logOutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBoxLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        slidepane.add(logOutBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 330, 50));

        adminBox.setBackground(new java.awt.Color(32, 126, 85));
        adminBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminBoxMousePressed(evt);
            }
        });

        adminLabel.setBackground(new java.awt.Color(32, 126, 85));
        adminLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("Administration");
        adminLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLabel.setOpaque(true);
        adminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminLabelMouseExited(evt);
            }
        });

        AdminIcon.setBackground(new java.awt.Color(32, 126, 85));
        AdminIcon.setForeground(new java.awt.Color(255, 255, 255));
        AdminIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        AdminIcon.setOpaque(true);

        javax.swing.GroupLayout adminBoxLayout = new javax.swing.GroupLayout(adminBox);
        adminBox.setLayout(adminBoxLayout);
        adminBoxLayout.setHorizontalGroup(
            adminBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminBoxLayout.createSequentialGroup()
                .addComponent(AdminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        adminBoxLayout.setVerticalGroup(
            adminBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(adminLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        slidepane.add(adminBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 50));

        manageStudentBox.setBackground(new java.awt.Color(32, 126, 85));
        manageStudentBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageStudentBoxMousePressed(evt);
            }
        });

        StudentManageIcon.setBackground(new java.awt.Color(32, 126, 85));
        StudentManageIcon.setForeground(new java.awt.Color(255, 255, 255));
        StudentManageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentManageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        StudentManageIcon.setOpaque(true);

        manageStudentLabel.setBackground(new java.awt.Color(32, 126, 85));
        manageStudentLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageStudentLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageStudentLabel.setText("Management Student");
        manageStudentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageStudentLabel.setOpaque(true);
        manageStudentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageStudentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageStudentLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout manageStudentBoxLayout = new javax.swing.GroupLayout(manageStudentBox);
        manageStudentBox.setLayout(manageStudentBoxLayout);
        manageStudentBoxLayout.setHorizontalGroup(
            manageStudentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStudentBoxLayout.createSequentialGroup()
                .addComponent(StudentManageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageStudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageStudentBoxLayout.setVerticalGroup(
            manageStudentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStudentBoxLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(manageStudentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageStudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StudentManageIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        slidepane.add(manageStudentBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 330, 50));

        manageSubjectBox.setBackground(new java.awt.Color(32, 126, 85));
        manageSubjectBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageSubjectBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSubjectBoxMousePressed(evt);
            }
        });

        SubManageIcon.setBackground(new java.awt.Color(32, 126, 85));
        SubManageIcon.setForeground(new java.awt.Color(255, 255, 255));
        SubManageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubManageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        SubManageIcon.setOpaque(true);

        manageSubjectLabel.setBackground(new java.awt.Color(32, 126, 85));
        manageSubjectLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageSubjectLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageSubjectLabel.setText("Management Subjects");
        manageSubjectLabel.setOpaque(true);
        manageSubjectLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageSubjectLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageSubjectLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout manageSubjectBoxLayout = new javax.swing.GroupLayout(manageSubjectBox);
        manageSubjectBox.setLayout(manageSubjectBoxLayout);
        manageSubjectBoxLayout.setHorizontalGroup(
            manageSubjectBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSubjectBoxLayout.createSequentialGroup()
                .addComponent(SubManageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageSubjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageSubjectBoxLayout.setVerticalGroup(
            manageSubjectBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSubjectBoxLayout.createSequentialGroup()
                .addGroup(manageSubjectBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageSubjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubManageIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        slidepane.add(manageSubjectBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 330, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CSE_203");
        slidepane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 260, 70));
        slidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        slidepane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 210, 10));

        jPanel1.setBackground(new java.awt.Color(35, 166, 120));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 238, 200));
        jLabel3.setText("Do");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 238, 200));
        jLabel6.setText("Think");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(245, 238, 200));
        jLabel13.setText("Create");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(245, 238, 200));
        jLabel16.setText("Organize");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_puzzle_90px.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_idea_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(197, 197, 197))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(162, 162, 162))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jSeparator5)))
                .addGap(370, 370, 370))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator6)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        toPutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDeafault.setBackground(new java.awt.Color(245, 238, 200));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(119, 107, 93));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("WELCOME!");

        javax.swing.GroupLayout PanelDeafaultLayout = new javax.swing.GroupLayout(PanelDeafault);
        PanelDeafault.setLayout(PanelDeafaultLayout);
        PanelDeafaultLayout.setHorizontalGroup(
            PanelDeafaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeafaultLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
        );
        PanelDeafaultLayout.setVerticalGroup(
            PanelDeafaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        toPutPanel.add(PanelDeafault, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 330));

        PanelAdmin.setBackground(new java.awt.Color(245, 238, 200));
        PanelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(119, 107, 93));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Username:");
        PanelAdmin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        userNameLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(119, 107, 93));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("User Name");
        PanelAdmin.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 370, -1));

        emailLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(119, 107, 93));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email Address");
        PanelAdmin.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 320, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(119, 107, 93));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Email Address:");
        PanelAdmin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, -1));

        passwordLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(119, 107, 93));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("*************");
        PanelAdmin.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 380, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(119, 107, 93));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Password:");
        PanelAdmin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(138, 218, 178));
        jLabel14.setText("Account Info:");
        PanelAdmin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(138, 218, 178));
        jLabel15.setText("Login Methods:");
        PanelAdmin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 60));

        emailChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blackSettingButton.png"))); // NOI18N
        emailChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailChangeMousePressed(evt);
            }
        });
        PanelAdmin.add(emailChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 30, 30));

        passwordChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blackSettingButton.png"))); // NOI18N
        passwordChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordChangeMousePressed(evt);
            }
        });
        PanelAdmin.add(passwordChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 30, 30));

        refreshButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        PanelAdmin.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        saveInformation.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        saveInformation.setText("Save");
        saveInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInformationActionPerformed(evt);
            }
        });
        PanelAdmin.add(saveInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 100, -1));

        toPutPanel.add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 838, 330));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(slidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toPutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toPutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(slidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(bg, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBoxMousePressed

        setColor(adminBox);
        resetColor(manageStudentBox);
        resetColor(manageSubjectBox);
        resetColor(logOutBox);

        PanelAdmin.setVisible(true);
        PanelDeafault.setVisible(false);

        userNameLabel.setText(UserManager.getListOfUser().get(0).getUserName());
        emailLabel.setText(UserManager.getListOfUser().get(0).getEmail());
    }//GEN-LAST:event_adminBoxMousePressed

    private void manageStudentBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentBoxMousePressed
        resetColor(adminBox);
        setColor(manageStudentBox);
        resetColor(manageSubjectBox);
        resetColor(logOutBox);
        new student_view.StudentTable().setVisible(true);
        PanelAdmin.setVisible(false);
        PanelDeafault.setVisible(true);

    }//GEN-LAST:event_manageStudentBoxMousePressed

    private void manageSubjectBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSubjectBoxMousePressed
        resetColor(adminBox);
        resetColor(manageStudentBox);
        setColor(manageSubjectBox);
        resetColor(logOutBox);
        new subjectMainFrame().setVisible(true);
        PanelAdmin.setVisible(false);
        PanelDeafault.setVisible(true);
    }//GEN-LAST:event_manageSubjectBoxMousePressed

    private void logOutBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBoxMousePressed
        resetColor(adminBox);
        resetColor(manageStudentBox);
        resetColor(manageSubjectBox);
        setColor(logOutBox);
        Main main = new Main();
        main.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_logOutBoxMousePressed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        emailLabel.setText(UserManager.getListOfUser().get(0).getEmail());
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void emailChangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailChangeMousePressed
        new JFrameEmail().setVisible(true);
    }//GEN-LAST:event_emailChangeMousePressed

    private void passwordChangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordChangeMousePressed
        new JFramePassword().setVisible(true);
    }//GEN-LAST:event_passwordChangeMousePressed

    private void saveInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInformationActionPerformed
        List<User> listUser = UserDAO.loadUserFromFile();
        for (User each : listUser) {
            if (each.getUserName().equals(UserManager.getListOfUser().get(0).getUserName())) {
                listUser.remove(each);
                listUser.add(UserManager.getListOfUser().get(0));
                break;
            }
        }
        UserDAO.saveUserToFileWhenSaveInformation(listUser);
    }//GEN-LAST:event_saveInformationActionPerformed

    private void adminLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseEntered
        this.adminLabel.setBackground(lightGreen);
        this.AdminIcon.setBackground(lightGreen);
    }//GEN-LAST:event_adminLabelMouseEntered

    private void adminLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseExited
        this.adminLabel.setBackground(mainGreen);
        this.AdminIcon.setBackground(mainGreen);
    }//GEN-LAST:event_adminLabelMouseExited

    private void manageStudentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentLabelMouseEntered
        this.StudentManageIcon.setBackground(lightGreen);
        this.manageStudentLabel.setBackground(lightGreen);
    }//GEN-LAST:event_manageStudentLabelMouseEntered

    private void manageStudentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageStudentLabelMouseExited
        this.StudentManageIcon.setBackground(mainGreen);
        this.manageStudentLabel.setBackground(mainGreen);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageStudentLabelMouseExited

    private void manageSubjectLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSubjectLabelMouseEntered
        this.manageSubjectLabel.setBackground(lightGreen);
        this.SubManageIcon.setBackground(lightGreen);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSubjectLabelMouseEntered

    private void manageSubjectLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSubjectLabelMouseExited
        this.manageSubjectLabel.setBackground(mainGreen);
        this.SubManageIcon.setBackground(mainGreen);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSubjectLabelMouseExited

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
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(53, 148, 96));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(32, 126, 85));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminIcon;
    private javax.swing.JPanel PanelAdmin;
    private javax.swing.JPanel PanelDeafault;
    private javax.swing.JLabel StudentManageIcon;
    private javax.swing.JLabel SubManageIcon;
    private javax.swing.JPanel adminBox;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel emailChange;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel logOutBox;
    private javax.swing.JPanel manageStudentBox;
    private javax.swing.JLabel manageStudentLabel;
    private javax.swing.JPanel manageSubjectBox;
    private javax.swing.JLabel manageSubjectLabel;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveInformation;
    private javax.swing.JPanel slidepane;
    private javax.swing.JPanel toPutPanel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
