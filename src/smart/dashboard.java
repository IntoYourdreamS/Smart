/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;

/**
 *
 * @author acer
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public dashboard() {
        initComponents();
        jButton1.setOpaque(false); 
        jButton1.setContentAreaFilled(false); 
        jButton1.setBorderPainted(false);
        bttnlaporan.setOpaque(false); 
        bttnlaporan.setContentAreaFilled(false); 
        bttnlaporan.setBorderPainted(false);
        bttntransaksi.setOpaque(false); 
        bttntransaksi.setContentAreaFilled(false); 
        bttntransaksi.setBorderPainted(false);
        bttnkaryawan.setOpaque(false); 
        bttnkaryawan.setContentAreaFilled(false); 
        bttnkaryawan.setBorderPainted(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bttnkaryawan = new javax.swing.JButton();
        bttntransaksi = new javax.swing.JButton();
        bttnlaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(85, 85, 85));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 40));

        bttnkaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnkaryawanActionPerformed(evt);
            }
        });
        getContentPane().add(bttnkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 40));

        bttntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttntransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(bttntransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 40));

        bttnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnlaporanActionPerformed(evt);
            }
        });
        getContentPane().add(bttnlaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dashboard kasir (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1372, 768));

        jButton2.setBackground(new java.awt.Color(85, 85, 85));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 40));

        jButton3.setBackground(new java.awt.Color(85, 85, 85));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Menutup frame lama sebelum membuka frame baru
this.dispose(); 

// Membuka frame baru
restok restockMenu = new restok(); 
restockMenu.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bttnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnlaporanActionPerformed
        // TODO add your handling code here:
        this.dispose(); 

// Membuka frame baru
laporan restockMenu = new laporan(); 
restockMenu.setVisible(true);
    }//GEN-LAST:event_bttnlaporanActionPerformed

    private void bttntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttntransaksiActionPerformed
        // TODO add your handling code here:
        this.dispose(); 

// Membuka frame baru
transaksi restockMenu = new transaksi(); 
restockMenu.setVisible(true);
    }//GEN-LAST:event_bttntransaksiActionPerformed

    private void bttnkaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnkaryawanActionPerformed
        // TODO add your handling code here:
        this.dispose(); 

// Membuka frame baru
karyawan restockMenu = new karyawan(); 
restockMenu.setVisible(true);
    }//GEN-LAST:event_bttnkaryawanActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnkaryawan;
    private javax.swing.JButton bttnlaporan;
    private javax.swing.JButton bttntransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
