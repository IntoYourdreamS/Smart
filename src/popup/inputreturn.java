/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package popup;

import Config.koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class inputreturn extends javax.swing.JFrame {

    /**
     * Creates new form inputreturn
     */
    public inputreturn() {
        initComponents();
        id_supplier.setOpaque(false);
        id_supplier.setBackground(new Color(0, 0, 0, 0));
        id_pembelian.setOpaque(false);
        id_pembelian.setBackground(new Color(0, 0, 0, 0));
        id_produk.setOpaque(false);
        id_produk.setBackground(new Color(0, 0, 0, 0));
        jumlah.setOpaque(false);
        jumlah.setBackground(new Color(0, 0, 0, 0));
        jumlah.setOpaque(false);
        jumlah.setBackground(new Color(0, 0, 0, 0));
        alasantext.setOpaque(false);
        alasantext.setBackground(new Color(0, 0, 0, 0));

        // Make buttons transparent
        makeButtonTransparent(tambah);
        makeButtonTransparent(ubah);
        makeButtonTransparent(btnkembali);
        
        tanggal_return.setDate(new java.util.Date());
        id_pembelian.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            fillFieldsFromPembelian();
        }
    });
    }
    
    private void fillFieldsFromPembelian() {
    String idPembelian = id_pembelian.getText().trim();
    if (idPembelian.isEmpty()) {
        return;
    }

    try {
        Connection conn = koneksi.getConnection();
        String query = "SELECT p.id_supplier, dp.id_produk FROM pembelian p " +
                       "JOIN detail_pembelian dp ON p.id_pembelian = dp.id_pembelian " +
                       "WHERE p.id_pembelian = ? LIMIT 1";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, idPembelian);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            id_supplier.setText(rs.getString("id_supplier"));
            id_produk.setText(rs.getString("id_produk"));
        } else {
            JOptionPane.showMessageDialog(this, "Data pembelian tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void clearFields() {
        id_pembelian.setText("");
        tanggal_return.setDate(null);
        alasantext.setText("");
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

        jumlah = new javax.swing.JTextField();
        id_pembelian = new javax.swing.JTextField();
        id_produk = new javax.swing.JTextField();
        id_supplier = new javax.swing.JTextField();
        alasantext = new javax.swing.JTextField();
        btnkembali = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        tanggal_return = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 310, 30));

        id_pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pembelianActionPerformed(evt);
            }
        });
        getContentPane().add(id_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 300, 30));

        id_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_produkActionPerformed(evt);
            }
        });
        getContentPane().add(id_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 310, 30));

        id_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 232, 310, 30));

        alasantext.setBorder(null);
        alasantext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alasantextActionPerformed(evt);
            }
        });
        getContentPane().add(alasantext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 310, 30));

        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 23, 40, 40));

        ubah.setContentAreaFilled(false);
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 190, 40));

        tambah.setContentAreaFilled(false);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 180, 40));
        getContentPane().add(tanggal_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 282, 310, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return_barang_paling_terbaru.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_supplierActionPerformed

    private void alasantextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alasantextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alasantextActionPerformed

    private void id_pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pembelianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pembelianActionPerformed

    private void id_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_produkActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
         try {
                String id_penjualan = id_pembelian.getText();
                String tanggal_retur = ((JTextField) tanggal_return.getDateEditor().getUiComponent()).getText();
                String alasanText = alasantext.getText();

                if (id_penjualan.isEmpty() || tanggal_retur.isEmpty() || alasanText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
                    return;
                }

                String query = "INSERT INTO retur_penjualan (id_retur_penjualan, id_penjualan, tanggal_retur, alasan) VALUES (?, ?, ?, ?)";
                Connection conn = koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);

                // Generate ID return barang
                String id_retur_penjualan = generateIdReturPenjualan();
                ps.setString(1, id_retur_penjualan);
                ps.setString(2, id_penjualan);
                ps.setString(3, tanggal_retur);
                ps.setString(4, alasanText);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data return barang berhasil ditambahkan!");
                clearFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

        private String generateIdReturPenjualan() {
            String prefix = "RT";
            int number = 1;
            try {
                String query = "SELECT MAX(id_retur_penjualan) FROM retur_penjualan";
                Connection conn = koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String lastId = rs.getString(1);
                    if (lastId != null) {
                        number = Integer.parseInt(lastId.substring(2)) + 1;
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return prefix + String.format("%03d", number);
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        try {
            String id_retur_penjualan = id_pembelian.getText();
            String tanggal_retur = ((JTextField) tanggal_return.getDateEditor().getUiComponent()).getText();
            String alasanText = alasantext.getText();

            if (id_retur_penjualan.isEmpty() || tanggal_retur.isEmpty() || alasanText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
                return;
            }

            String query = "UPDATE retur_penjualan SET tanggal_retur = ?, alasan = ? WHERE id_retur_penjualan = ?";
            Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, tanggal_retur);
            ps.setString(2, alasanText);
            ps.setString(3, id_retur_penjualan);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data return barang berhasil diubah!");
            clearFields();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(inputreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputreturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alasantext;
    private javax.swing.JButton btnkembali;
    private javax.swing.JTextField id_pembelian;
    private javax.swing.JTextField id_produk;
    private javax.swing.JTextField id_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton tambah;
    private com.toedter.calendar.JDateChooser tanggal_return;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
