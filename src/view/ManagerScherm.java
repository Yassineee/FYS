package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yassinee
 */
public class ManagerScherm extends javax.swing.JFrame {

    /**
     * Creates new form Managerhome
     */
    public ManagerScherm() {
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

        Name = new javax.swing.JLabel();
        Status = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JPanel();
        GraphsLabel = new javax.swing.JPanel();
        LogfilesLabel = new javax.swing.JPanel();
        HelpLabel = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        helpButtom = new javax.swing.JToggleButton();
        homeButtom = new javax.swing.JToggleButton();
        searchbuttom = new javax.swing.JToggleButton();
        addBaggageButtom = new javax.swing.JToggleButton();
        submitRequestButtom = new javax.swing.JToggleButton();
        helpButtom1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Logged in as:");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 50));

        Status.setBackground(new java.awt.Color(153, 51, 51));
        Status.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        HomeLabel.setBackground(new java.awt.Color(153, 51, 51));
        HomeLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Welkom");
        jLabel2.setToolTipText("");
        HomeLabel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 290, 80));

        getContentPane().add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        SearchLabel.setBackground(new java.awt.Color(153, 51, 51));
        SearchLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(SearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        GraphsLabel.setBackground(new java.awt.Color(153, 51, 51));
        GraphsLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(GraphsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        LogfilesLabel.setBackground(new java.awt.Color(153, 51, 51));
        LogfilesLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(LogfilesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        HelpLabel.setBackground(new java.awt.Color(153, 51, 51));
        HelpLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(HelpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 890, 440));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpButtom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        helpButtom.setText("Log");
        helpButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtomActionPerformed(evt);
            }
        });
        menu.add(helpButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 40));

        homeButtom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        homeButtom.setText("Home");
        homeButtom.setToolTipText("Hiermee kom je op de home-pagina");
        homeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtomActionPerformed(evt);
            }
        });
        menu.add(homeButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 40));

        searchbuttom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchbuttom.setText("Search");
        searchbuttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttomActionPerformed(evt);
            }
        });
        menu.add(searchbuttom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 40));

        addBaggageButtom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addBaggageButtom.setText("Graphs");
        addBaggageButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBaggageButtomActionPerformed(evt);
            }
        });
        menu.add(addBaggageButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 40));

        submitRequestButtom.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        submitRequestButtom.setText("Status");
        submitRequestButtom.setToolTipText("DIT IS EEN HOME KNOPP!!!!!!!!!!!!!!!!!!!!!!!!!!");
        submitRequestButtom.setAlignmentX(1.0F);
        submitRequestButtom.setAlignmentY(0.0F);
        submitRequestButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestButtomActionPerformed(evt);
            }
        });
        menu.add(submitRequestButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 40));

        helpButtom1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        helpButtom1.setText("Help");
        helpButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtom1ActionPerformed(evt);
            }
        });
        menu.add(helpButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 40));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1300, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtom1ActionPerformed

    private void helpButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtomActionPerformed

    private void submitRequestButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitRequestButtomActionPerformed

    private void addBaggageButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBaggageButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBaggageButtomActionPerformed

    private void searchbuttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbuttomActionPerformed

    private void homeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtomActionPerformed

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
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerScherm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphsLabel;
    private javax.swing.JPanel HelpLabel;
    private javax.swing.JPanel HomeLabel;
    private javax.swing.JPanel LogfilesLabel;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel SearchLabel;
    private javax.swing.JPanel Status;
    private javax.swing.JToggleButton addBaggageButtom;
    private javax.swing.JToggleButton helpButtom;
    private javax.swing.JToggleButton helpButtom1;
    private javax.swing.JToggleButton homeButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel menu;
    private javax.swing.JToggleButton searchbuttom;
    private javax.swing.JToggleButton submitRequestButtom;
    // End of variables declaration//GEN-END:variables
}
