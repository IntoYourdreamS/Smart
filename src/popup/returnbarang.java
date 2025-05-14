/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package popup;

import Config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import smart.karyawan;
import smart.restok;
import popup.datareturn;

/**
 *
 * @author ASUS
 */
public class returnbarang extends javax.swing.JFrame {

    /**
     * Creates new form coba
     */
    public returnbarang() {
        initComponents();
         // makeButtonTransparent(kembali);
         //  makeButtonTransparent(tambah);
           id_supplier.setOpaque(false);
        id_supplier.setBackground(new Color(0, 0, 0, 0));
        id_barang.setOpaque(false);
        id_barang.setBackground(new Color(0, 0, 0, 0));
         nama_produk.setOpaque(false);
        nama_produk.setBackground(new Color(0, 0, 0, 0));
        id_pembelian.setOpaque(false);
        id_pembelian.setBackground(new Color(0, 0, 0, 0));
         alasan.setOpaque(false);
        alasan.setBackground(new Color(0, 0, 0, 0));
        harga_jual.setOpaque(false);
        harga_jual.setBackground(new Color(0, 0, 0, 0));
          

    }
    
     private void makeButtonTransparent(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
    
    
    
    class Coba extends JFrame {
    public Coba() {
        setTitle("Popup Frame - Coba");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }   
}
    
    private void simpanDataReturn() {
        // Ambil nilai dari form
        String idBarang = id_barang.getText().trim();
        String idPembelian = id_pembelian.getText().trim();
        String namaProduk = nama_produk.getText().trim();
        String hargaJual = harga_jual.getText().trim();
        String idSupplier = id_supplier.getText().trim();
        String alasanReturn = alasan.getText().trim();

        // Validasi input
        if (idBarang.isEmpty() || idPembelian.isEmpty() || namaProduk.isEmpty() || 
            hargaJual.isEmpty() || idSupplier.isEmpty() || alasanReturn.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Semua kolom harus diisi!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Konversi harga jual ke angka
            double harga = Double.parseDouble(hargaJual);
            
            // Query untuk insert data
            String query = "INSERT INTO retur_penjualan (id_barang, id_pembelian, nama_produk, "
                        + "harga_jual, id_supplier, alasan) VALUES (?, ?, ?, ?, ?, ?)";
            
            try (Connection konek = koneksi.getConnection();
                 PreparedStatement pst = konek.prepareStatement(query)) {
                
                // Set parameter query
                pst.setString(1, idBarang);
                pst.setString(2, idPembelian);
                pst.setString(3, namaProduk);
                pst.setDouble(4, harga);
                pst.setString(5, idSupplier);
                pst.setString(6, alasanReturn);
                
                // Eksekusi query
                int barisTerpengaruh = pst.executeUpdate();
                
                if (barisTerpengaruh > 0) {
                    JOptionPane.showMessageDialog(this, 
                            "Data return berhasil disimpan!", 
                            "Sukses", 
                            JOptionPane.INFORMATION_MESSAGE);
                    
                    // Bersihkan form
                    bersihkanForm();
                    
                    // Refresh data di form datareturn
                    refreshFormDataReturn();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Harga jual harus berupa angka!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                    "Error: " + e.getMessage(), 
                    "Database Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method untuk membersihkan form
    private void bersihkanForm() {
        id_barang.setText("");
        id_pembelian.setText("");
        nama_produk.setText("");
        harga_jual.setText("");
        id_supplier.setText("");
        alasan.setText("");
    }

    // Method untuk refresh data di form utama
    private void refreshFormDataReturn() {
    // Tutup form saat ini
    this.dispose();
    
    // Buka form datareturn baru
    datareturn formReturn = new datareturn();
    formReturn.loadDataReturnToTable(); // Refresh data
    formReturn.setVisible(true);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        nama_produk = new javax.swing.JTextField();
        id_pembelian = new javax.swing.JTextField();
        harga_jual = new javax.swing.JTextField();
        id_supplier = new javax.swing.JTextField();
        id_barang = new javax.swing.JTextField();
        alasan = new javax.swing.JTextField();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama_produk.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        nama_produk.setBorder(null);
        nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_produkActionPerformed(evt);
            }
        });
        getContentPane().add(nama_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 260, 40));

        id_pembelian.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        id_pembelian.setBorder(null);
        getContentPane().add(id_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 260, 40));

        harga_jual.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        harga_jual.setBorder(null);
        getContentPane().add(harga_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 260, 40));

        id_supplier.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        id_supplier.setBorder(null);
        id_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 260, 30));

        id_barang.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        id_barang.setBorder(null);
        getContentPane().add(id_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 260, 30));

        alasan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        alasan.setBorder(null);
        getContentPane().add(alasan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 300, 30));

        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 420, 170, 40));

        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 170, 40));

        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 170, 40));

        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 20, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return barang v2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_supplierActionPerformed

    private void nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_produkActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        simpanDataReturn();
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        new restok().setVisible(true);  // Buka form datareturn
    this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(returnbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alasan;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga_jual;
    private javax.swing.JTextField id_barang;
    private javax.swing.JTextField id_pembelian;
    private javax.swing.JTextField id_supplier;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama_produk;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
