package Manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yassinee
 */
public class Managerhome extends javax.swing.JFrame {

    /**
     * Creates new form Managerhome
     */
    public Managerhome() {
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
        Home = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        AddBaggage = new javax.swing.JLabel();
        AddBaggage1 = new javax.swing.JLabel();
        AddBaggage2 = new javax.swing.JLabel();
        AddBaggage3 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Logged in as:");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 50));

        Home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Home.setText("Home");
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 30));

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.setText("Search");
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 90, 40));

        AddBaggage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage.setText("Help");
        getContentPane().add(AddBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        AddBaggage1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage1.setText("Graphs");
        getContentPane().add(AddBaggage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        AddBaggage2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage2.setText("Status");
        getContentPane().add(AddBaggage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        AddBaggage3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage3.setText("Log files");
        getContentPane().add(AddBaggage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID.setText("Employee ID:");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 130, 50));

        homePanel.setBackground(new java.awt.Color(152, 51, 51));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Welkom Manager,");
        homePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 400, 90));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        homePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        getContentPane().add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 910, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1300, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
            
    }//GEN-LAST:event_SearchKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Manager.ManagerGraphs.getFrames();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Managerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managerhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBaggage;
    private javax.swing.JLabel AddBaggage1;
    private javax.swing.JLabel AddBaggage2;
    private javax.swing.JLabel AddBaggage3;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Search;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
