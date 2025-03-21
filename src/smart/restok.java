/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;

import javax.swing.JButton;
import popup.dataexpired;
import popup.datasupplier;
import popup.datareturn;
import popup.tambahbarang;
import popup.tambahsupplier;
import popup.returnbarang;
import popup.tambahkaryawan;

/**
 *
 * @author acer
 */
public class restok extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public restok() {
        initComponents();
         makeButtonTransparent(dashboard);
           makeButtonTransparent(transaksi);
            makeButtonTransparent(laporan);
             makeButtonTransparent(karyawan);
             makeButtonTransparent(suplier);
           makeButtonTransparent(inputbarang);
            makeButtonTransparent(inputreturn);
             makeButtonTransparent(datasupplier);
              makeButtonTransparent(dataexpired);
             makeButtonTransparent(datareturn);
    }
    
    private void makeButtonTransparent(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        karyawan = new javax.swing.JButton();
        suplier = new javax.swing.JButton();
        inputbarang = new javax.swing.JButton();
        inputreturn = new javax.swing.JButton();
        datasupplier = new javax.swing.JButton();
        dataexpired = new javax.swing.JButton();
        datareturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 50));

        transaksi.setBorder(null);
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, 40));

        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        getContentPane().add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, 50));

        karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanActionPerformed(evt);
            }
        });
        getContentPane().add(karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 40));

        suplier.setBorder(null);
        suplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suplierActionPerformed(evt);
            }
        });
        getContentPane().add(suplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 120, 30));

        inputbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbarangActionPerformed(evt);
            }
        });
        getContentPane().add(inputbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 120, 30));

        inputreturn.setBorder(null);
        inputreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputreturnActionPerformed(evt);
            }
        });
        getContentPane().add(inputreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 120, 30));

        datasupplier.setBorder(null);
        datasupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasupplierActionPerformed(evt);
            }
        });
        getContentPane().add(datasupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 210, 160, 30));

        dataexpired.setBorder(null);
        dataexpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataexpiredActionPerformed(evt);
            }
        });
        getContentPane().add(dataexpired, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 160, 30));

        datareturn.setBorder(null);
        datareturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datareturnActionPerformed(evt);
            }
        });
        getContentPane().add(datareturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restock (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
          new dashboard().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_dashboardActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
          new transaksi().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_transaksiActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        // TODO add your handling code here:
          new laporanpenjualan().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_laporanActionPerformed

    private void karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanActionPerformed
        // TODO add your handling code here:
          new karyawan().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_karyawanActionPerformed

    private void inputreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputreturnActionPerformed
       returnbarang popup = new returnbarang();
                popup.setVisible(true);
    }//GEN-LAST:event_inputreturnActionPerformed

    private void suplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suplierActionPerformed
        // TODO add your handling code here:
        tambahsupplier popup = new tambahsupplier();
                popup.setVisible(true);
    }//GEN-LAST:event_suplierActionPerformed

    private void inputbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbarangActionPerformed
        tambahbarang popup = new tambahbarang();
                popup.setVisible(true);  
    }//GEN-LAST:event_inputbarangActionPerformed

    private void datasupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasupplierActionPerformed
        // TODO add your handling code here:
         new datasupplier().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_datasupplierActionPerformed

    private void dataexpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataexpiredActionPerformed
        // TODO add your handling code here:
         new dataexpired().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_dataexpiredActionPerformed

    private void datareturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datareturnActionPerformed
        // TODO add your handling code here:
         new datareturn().setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_datareturnActionPerformed

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
            java.util.logging.Logger.getLogger(restok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dataexpired;
    private javax.swing.JButton datareturn;
    private javax.swing.JButton datasupplier;
    private javax.swing.JButton inputbarang;
    private javax.swing.JButton inputreturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton karyawan;
    private javax.swing.JButton laporan;
    private javax.swing.JButton suplier;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
