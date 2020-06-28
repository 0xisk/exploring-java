
package js_club.cActivities;


public class Gmes extends javax.swing.JFrame {


    public Gmes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        okay = new javax.swing.JButton();
        schedule = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText(" INDIVIDUAL SPORTS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 220, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Football");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Basketball");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 180, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Vollyeball");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 180, 70, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Handball");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 180, 70, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Squash");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(154, 277, 60, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Tennis");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(21, 282, 50, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Karate");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 280, 60, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Swmming");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(488, 280, 80, 17);

//        okay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
//        okay.setForeground(new java.awt.Color(204, 0, 0));
//        okay.setText("BACK");
//        okay.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                okayActionPerformed(evt);
//            }
//        });
//        getContentPane().add(okay);
//        okay.setBounds(370, 350, 100, 30);

        schedule.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        schedule.setForeground(new java.awt.Color(204, 0, 0));
        schedule.setText("NEXT");
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });
        getContentPane().add(schedule);
        schedule.setBounds(500, 350, 102, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("NOW SHOW THE SCHEDULE AND CHOOSE");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 320, 256, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("YOU CAN FOUND HERE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 100, 290, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("TEAM SPORTS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 130, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" ACTIVITIES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 0, 224, 44);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("maria_bg_1.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, -4, 610, 390);

        pack();
    }// </editor-fold>                        

    private void okayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayActionPerformed

    }//GEN-LAST:event_okayActionPerformed

    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleActionPerformed
        close();
        Schedule s =new Schedule();
         
        s.setSize(1150, 690);
        s.setLocationRelativeTo(null);
        s.setResizable(false);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_scheduleActionPerformed
    public void close() { 
    this.setVisible(false);
    this.dispose();
     }
    /**
//     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Gmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton okay;
    private javax.swing.JButton schedule;
    // End of variables declaration//GEN-END:variables
}
