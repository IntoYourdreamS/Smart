/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

/**
 *
 * @author acer
 */
public class laporanpenjualan extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public laporanpenjualan() {
        initComponents();
        customizeTable();
         makeButtonTransparent(dashboard);
           makeButtonTransparent(transaksi);
            makeButtonTransparent(restok);
             makeButtonTransparent(karyawan);
             makeButtonTransparent(pembelian);
             makeButtonTransparent(returnn);
    }
    
    private void makeButtonTransparent(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
    
     private void customizeTable() {
          JTableHeader header = tbpenjualan.getTableHeader();
           header.setFont(new Font("Inter", Font.BOLD, 11));
           header.setForeground(Color.black);
            header.setOpaque(false);
            tbpenjualan.setFont(new Font("Arial", Font.PLAIN, 10));
            tbpenjualan.setRowHeight(30); 
            tbpenjualan.setShowGrid(true); 
            tbpenjualan.setIntercellSpacing(new java.awt.Dimension(0, 0));
            tbpenjualan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

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
        restok = new javax.swing.JButton();
        karyawan = new javax.swing.JButton();
        pembelian = new javax.swing.JButton();
        returnn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbpenjualan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBorder(null);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 50));

        transaksi.setBorder(null);
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 50));

        restok.setBorder(null);
        restok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restokActionPerformed(evt);
            }
        });
        getContentPane().add(restok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 40));

        karyawan.setBorder(null);
        karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanActionPerformed(evt);
            }
        });
        getContentPane().add(karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 140, 40));

        pembelian.setBorder(null);
        pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianActionPerformed(evt);
            }
        });
        getContentPane().add(pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, 30));

        returnn.setBorder(null);
        returnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnnActionPerformed(evt);
            }
        });
        getContentPane().add(returnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 30));

        tbpenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No nota", "Nama produk", "Jumlah", "Harga", "Total", "Kategori", "Nama karyawan", "Tanggal"
            }
        ));
        jScrollPane2.setViewportView(tbpenjualan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 1050, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporan penjualan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
          new transaksi().setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_transaksiActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
          new dashboard().setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_dashboardActionPerformed

    private void restokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restokActionPerformed
        // TODO add your handling code here:
          new restok().setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_restokActionPerformed

    private void karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanActionPerformed
        // TODO add your handling code here:
          new karyawan().setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_karyawanActionPerformed

    private void returnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnnActionPerformed
        // TODO add your handling code here:
         new laporanreturn().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_returnnActionPerformed

    private void pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianActionPerformed
        // TODO add your handling code here:
         new laporanpembelian().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_pembelianActionPerformed

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
            java.util.logging.Logger.getLogger(laporanpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporanpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporanpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporanpenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new laporanpenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton karyawan;
    private javax.swing.JButton pembelian;
    private javax.swing.JButton restok;
    private javax.swing.JButton returnn;
    private javax.swing.JTable tbpenjualan;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables

    private void makeButtonTransparent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
