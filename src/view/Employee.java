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
public class Employee extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        Logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        employeeAddBaggage = new javax.swing.JPanel();
        addBaggageTitle = new javax.swing.JLabel();
        employeeSearch = new javax.swing.JPanel();
        SearchTitle = new javax.swing.JLabel();
        employeeHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        employeeSubmitRequest = new javax.swing.JPanel();
        submitRequestTitle = new javax.swing.JLabel();
        employeeHelp = new javax.swing.JPanel();
        helpTitle = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        searchButton = new javax.swing.JLabel();
        addBaggageButton = new javax.swing.JLabel();
        submitBaggageButton = new javax.swing.JLabel();
        helpButton = new javax.swing.JLabel();
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

        Logout.setBackground(new java.awt.Color(151, 51, 51));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setText("Logout");
        Logout.setToolTipText("blablabla");
        Logout.setBorder(null);
        Logout.setBorderPainted(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 90, 70, 30));

        jPanel1.setBackground(new java.awt.Color(153, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeAddBaggage.setBackground(new java.awt.Color(153, 51, 51));
        employeeAddBaggage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBaggageTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBaggageTitle.setText("Add Baggage");
        employeeAddBaggage.add(addBaggageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jPanel1.add(employeeAddBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        employeeSearch.setBackground(new java.awt.Color(153, 51, 51));
        employeeSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchTitle.setText("Search");
        employeeSearch.add(SearchTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jPanel1.add(employeeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        employeeHome.setBackground(new java.awt.Color(153, 51, 51));
        employeeHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Home");
        employeeHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jPanel1.add(employeeHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 440));

        employeeSubmitRequest.setBackground(new java.awt.Color(153, 51, 51));
        employeeSubmitRequest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitRequestTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submitRequestTitle.setText("Submit Request");
        employeeSubmitRequest.add(submitRequestTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jPanel1.add(employeeSubmitRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        employeeHelp.setBackground(new java.awt.Color(153, 51, 51));
        employeeHelp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        helpTitle.setText("Help");
        employeeHelp.add(helpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jPanel1.add(employeeHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 990, 500));

        menu.setBackground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setOpaque(true);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
        });

        addBaggageButton.setBackground(new java.awt.Color(255, 255, 255));
        addBaggageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBaggageButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBaggageButton.setText("Add baggage");
        addBaggageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBaggageButton.setOpaque(true);
        addBaggageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBaggageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBaggageButtonMouseExited(evt);
            }
        });

        submitBaggageButton.setBackground(new java.awt.Color(255, 255, 255));
        submitBaggageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitBaggageButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitBaggageButton.setText("Submit baggage");
        submitBaggageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBaggageButton.setOpaque(true);
        submitBaggageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitBaggageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitBaggageButtonMouseExited(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpButton.setText("Help");
        helpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpButton.setOpaque(true);
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addComponent(addBaggageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(submitBaggageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(addBaggageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(submitBaggageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 144, Short.MAX_VALUE))
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 180, 178, 410));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ELProperty.create("${background}"), Background, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeButton.setBackground(Color.white);
    }//GEN-LAST:event_homeButtonMouseExited

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        searchButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_searchButtonMouseEntered

    private void addBaggageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBaggageButtonMouseEntered
        addBaggageButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_addBaggageButtonMouseEntered

    private void submitBaggageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBaggageButtonMouseEntered
        submitBaggageButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_submitBaggageButtonMouseEntered

    private void helpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseEntered
        helpButton.setBackground(Color.lightGray);
    }//GEN-LAST:event_helpButtonMouseEntered

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        searchButton.setBackground(Color.white);
    }//GEN-LAST:event_searchButtonMouseExited

    private void addBaggageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBaggageButtonMouseExited
        addBaggageButton.setBackground(Color.white);
    }//GEN-LAST:event_addBaggageButtonMouseExited

    private void submitBaggageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBaggageButtonMouseExited
        submitBaggageButton.setBackground(Color.white);
    }//GEN-LAST:event_submitBaggageButtonMouseExited

    private void helpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseExited
        helpButton.setBackground(Color.white);
    }//GEN-LAST:event_helpButtonMouseExited

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel ID;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel SearchTitle;
    private javax.swing.JLabel addBaggageButton;
    private javax.swing.JLabel addBaggageTitle;
    private javax.swing.JPanel employeeAddBaggage;
    private javax.swing.JPanel employeeHelp;
    private javax.swing.JPanel employeeHome;
    private javax.swing.JPanel employeeSearch;
    private javax.swing.JPanel employeeSubmitRequest;
    private javax.swing.JLabel helpButton;
    private javax.swing.JLabel helpTitle;
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel searchButton;
    private javax.swing.JLabel submitBaggageButton;
    private javax.swing.JLabel submitRequestTitle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
}
