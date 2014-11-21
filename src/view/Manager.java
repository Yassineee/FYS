package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EdoTyran
 */
public class Manager extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form Employee
     */
    public Manager() {
        super("Lost Baggage");
        setSize(1300,650);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Name = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ManagerHome = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        naamText = new javax.swing.JLabel();
        accountTypeNaam = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IDText = new javax.swing.JLabel();
        nameBar = new javax.swing.JTextField();
        accountType = new javax.swing.JTextField();
        idBar = new javax.swing.JTextField();
        Backgroundlabel = new javax.swing.JLabel();
        ManagerLogfiles = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ManagerSearch = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ManagerStatus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ManagerGraphs = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ManagerHelp = new javax.swing.JPanel();
        helpTitle6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        searchButton = new javax.swing.JLabel();
        StatusButton = new javax.swing.JLabel();
        LogfilesButton = new javax.swing.JLabel();
        Graphbutton = new javax.swing.JLabel();
        helpButton1 = new javax.swing.JLabel();
        logoutKnop = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lost Baggage");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Logged in as:");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 40));

        ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID.setText("Employee ID:");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 130, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.setLayout(new java.awt.BorderLayout());

        ManagerHome.setBackground(new java.awt.Color(153, 51, 51));
        ManagerHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        ManagerHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeText.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        welcomeText.setText("Welcome Manager,");
        ManagerHome.add(welcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        naamText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        naamText.setText("Name: ");
        ManagerHome.add(naamText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, 20));

        accountTypeNaam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountTypeNaam.setText("Account type:");
        ManagerHome.add(accountTypeNaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 30));
        ManagerHome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 200, 80));

        IDText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDText.setText("ID:");
        ManagerHome.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, 20));

        nameBar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        nameBar.setText("Example: John");
        nameBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBarActionPerformed(evt);
            }
        });
        ManagerHome.add(nameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, -1));

        accountType.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        accountType.setText("Example: Manager");
        ManagerHome.add(accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 100, -1));

        idBar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        idBar.setText("Example: 3");
        ManagerHome.add(idBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 100, -1));

        Backgroundlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        Backgroundlabel.setToolTipText("");
        Backgroundlabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerHome.add(Backgroundlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerLogfiles.setBackground(new java.awt.Color(153, 51, 51));
        ManagerLogfiles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.lightGray));
        ManagerLogfiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Baggage status" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        ManagerLogfiles.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 540, 220));

        jCheckBox6.setText("All");
        ManagerLogfiles.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jCheckBox7.setText("Time");
        ManagerLogfiles.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));

        jCheckBox8.setText("Users");
        ManagerLogfiles.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jTextField6.setText("Search");
        ManagerLogfiles.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 540, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seoLogo.png"))); // NOI18N
        ManagerLogfiles.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corendon-airlines.jpg"))); // NOI18N
        jLabel15.setText("jLabel11");
        ManagerLogfiles.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 300, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerLogfiles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerHome.add(ManagerLogfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ManagerSearch.setBackground(new java.awt.Color(0, 0, 0));
        ManagerSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        ManagerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setText("Search");
        ManagerSearch.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 540, -1));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "search results" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        ManagerSearch.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 540, 220));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seoLogo.png"))); // NOI18N
        ManagerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corendon-airlines.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        ManagerSearch.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 300, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerSearch.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerHome.add(ManagerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ManagerStatus.setBackground(new java.awt.Color(153, 51, 51));
        ManagerStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.lightGray));
        ManagerStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Baggage status" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        ManagerStatus.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 540, 220));

        jCheckBox1.setText("Lost baggage");
        ManagerStatus.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jCheckBox2.setText("Found baggage");
        ManagerStatus.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));

        jCheckBox3.setText("Handled Baggage");
        ManagerStatus.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jCheckBox4.setText("Overview");
        ManagerStatus.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, -1));

        jTextField5.setText("Search");
        ManagerStatus.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 540, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seoLogo.png"))); // NOI18N
        ManagerStatus.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corendon-airlines.jpg"))); // NOI18N
        jLabel13.setText("jLabel11");
        ManagerStatus.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 300, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerStatus.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerHome.add(ManagerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ManagerGraphs.setBackground(new java.awt.Color(153, 51, 51));
        ManagerGraphs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.lightGray));
        ManagerGraphs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corendon-airlines.jpg"))); // NOI18N
        jLabel16.setText("jLabel11");
        ManagerGraphs.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 300, 70));

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Grafiek here" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        ManagerGraphs.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 540, 220));

        jCheckBox9.setText("Day");
        ManagerGraphs.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jCheckBox10.setText("Month");
        ManagerGraphs.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));

        jCheckBox11.setText("Year");
        ManagerGraphs.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerGraphs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerHome.add(ManagerGraphs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ManagerHelp.setBackground(new java.awt.Color(153, 51, 51));
        ManagerHelp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.lightGray));
        ManagerHelp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpTitle6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        helpTitle6.setText("Welkom Manager,");
        ManagerHelp.add(helpTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/00000001.JPG"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManagerHelp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        ManagerHome.add(ManagerHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(ManagerHome, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 910, 460));

        menu.setBackground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setOpaque(true);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
        });

        StatusButton.setBackground(new java.awt.Color(255, 255, 255));
        StatusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusButton.setText("Status");
        StatusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatusButton.setOpaque(true);
        StatusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StatusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StatusButtonMouseExited(evt);
            }
        });

        LogfilesButton.setBackground(new java.awt.Color(255, 255, 255));
        LogfilesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogfilesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogfilesButton.setText("Log files");
        LogfilesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogfilesButton.setOpaque(true);
        LogfilesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogfilesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogfilesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogfilesButtonMouseExited(evt);
            }
        });

        Graphbutton.setBackground(new java.awt.Color(255, 255, 255));
        Graphbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Graphbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Graphbutton.setText("Graphs");
        Graphbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Graphbutton.setOpaque(true);
        Graphbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraphbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GraphbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GraphbuttonMouseExited(evt);
            }
        });

        helpButton1.setBackground(new java.awt.Color(255, 255, 255));
        helpButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpButton1.setText("Help");
        helpButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpButton1.setOpaque(true);
        helpButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpButton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addComponent(StatusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogfilesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Graphbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helpButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(StatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(LogfilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Graphbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 180, 178, 320));

        logoutKnop.setBackground(new java.awt.Color(147, 51, 51));
        logoutKnop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutKnop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutKnop.setText("LOGOUT");
        logoutKnop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutKnop.setOpaque(true);
        logoutKnop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutKnopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutKnopMouseExited(evt);
            }
        });
        getContentPane().add(logoutKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 89, 90, 33));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ELProperty.create("${background}"), Background, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeButton.setBackground(Color.white);
    }//GEN-LAST:event_homeButtonMouseExited

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        searchButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_searchButtonMouseEntered

    private void StatusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusButtonMouseEntered
        StatusButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_StatusButtonMouseEntered

    private void LogfilesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogfilesButtonMouseEntered
        LogfilesButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_LogfilesButtonMouseEntered

    private void GraphbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphbuttonMouseEntered
        Graphbutton.setBackground(Color.lightGray);
    }//GEN-LAST:event_GraphbuttonMouseEntered

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        searchButton.setBackground(Color.white);
    }//GEN-LAST:event_searchButtonMouseExited

    private void StatusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusButtonMouseExited
        StatusButton.setBackground(Color.white);
    }//GEN-LAST:event_StatusButtonMouseExited

    private void LogfilesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogfilesButtonMouseExited
        LogfilesButton.setBackground(Color.white);
    }//GEN-LAST:event_LogfilesButtonMouseExited

    private void GraphbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphbuttonMouseExited
        Graphbutton.setBackground(Color.white);
    }//GEN-LAST:event_GraphbuttonMouseExited

    private void helpButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButton1MouseEntered
        helpButton1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_helpButton1MouseEntered

    private void helpButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButton1MouseExited
        helpButton1.setBackground(Color.white);
    }//GEN-LAST:event_helpButton1MouseExited

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
         jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerHome);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerSearch);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void StatusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusButtonMouseClicked
      jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerStatus);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_StatusButtonMouseClicked

    private void LogfilesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogfilesButtonMouseClicked
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerLogfiles);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_LogfilesButtonMouseClicked

    private void GraphbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphbuttonMouseClicked
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerGraphs);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_GraphbuttonMouseClicked

    private void helpButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButton1MouseClicked
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.add(ManagerHelp);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_helpButton1MouseClicked

    private void nameBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBarActionPerformed

    private void logoutKnopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutKnopMouseEntered
        logoutKnop.setBackground(new java.awt.Color(224,90,90));
    }//GEN-LAST:event_logoutKnopMouseEntered

    private void logoutKnopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutKnopMouseExited
        logoutKnop.setBackground(new java.awt.Color(153,51,51));
    }//GEN-LAST:event_logoutKnopMouseExited

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Backgroundlabel;
    private javax.swing.JLabel Graphbutton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDText;
    private javax.swing.JLabel LogfilesButton;
    private javax.swing.JPanel ManagerGraphs;
    private javax.swing.JPanel ManagerHelp;
    private javax.swing.JPanel ManagerHome;
    private javax.swing.JPanel ManagerLogfiles;
    private javax.swing.JPanel ManagerSearch;
    private javax.swing.JPanel ManagerStatus;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel StatusButton;
    private javax.swing.JTextField accountType;
    private javax.swing.JLabel accountTypeNaam;
    private javax.swing.JLabel helpButton1;
    private javax.swing.JLabel helpTitle6;
    private javax.swing.JLabel homeButton;
    private javax.swing.JTextField idBar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel logoutKnop;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel naamText;
    private javax.swing.JTextField nameBar;
    private javax.swing.JLabel searchButton;
    private javax.swing.JLabel welcomeText;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
}
