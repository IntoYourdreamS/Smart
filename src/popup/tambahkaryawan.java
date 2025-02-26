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
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import smart.*;

/**
 *
 * @author acer
 */
public class tambahkaryawan extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public tambahkaryawan() {
        initComponents();
        makeButtonTransparent(kembali);
        makeButtonTransparent(tambah);
       // customizeTable();
         nokaryawan.setOpaque(false);
        nokaryawan.setBackground(new Color(0, 0, 0, 0));
         nama.setOpaque(false);
        nama.setBackground(new Color(0, 0, 0, 0));
        nohp.setOpaque(false);
        nohp.setBackground(new Color(0, 0, 0, 0));
        password.setOpaque(false);
        password.setBackground(new Color(0, 0, 0, 0));
         RFID.setOpaque(false);
        RFID.setBackground(new Color(0, 0, 0, 0));
        
        
    }
    
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nokaryawan = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        kembali = new javax.swing.JButton();
        RFID = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nokaryawan.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        nokaryawan.setForeground(new java.awt.Color(116, 77, 6));
        nokaryawan.setBorder(null);
        nokaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nokaryawan.setEnabled(false);
        nokaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokaryawanActionPerformed(evt);
            }
        });
        getContentPane().add(nokaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 240, 40));

        nama.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        nama.setBorder(null);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 230, 40));

        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        password.setBorder(null);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 372, 240, 40));

        nohp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        nohp.setBorder(null);
        getContentPane().add(nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 230, 40));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "owner", "kasir" }));
        getContentPane().add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 410, 40));

        kembali.setBorder(null);
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 190, 30));

        RFID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        RFID.setBorder(null);
        RFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFIDActionPerformed(evt);
            }
        });
        getContentPane().add(RFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 240, 40));

        tambah.setBorder(null);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tambah karyawan (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private String generateCode() {
    String kodeMenu = "KR001"; // Default kode pertama jika belum ada data

    try (Connection conn = koneksi.getConnection()) { // Pastikan Koneksi.getConnection() mengembalikan koneksi valid
        if (conn != null) {
            String query = "SELECT id_karyawan FROM karyawan ORDER BY id_karyawan DESC LIMIT 1";

            try (Statement statem = conn.createStatement();
                 ResultSet resultSet = statem.executeQuery(query)) {

                if (resultSet.next()) {
                    String lastKode = resultSet.getString("id_karyawan"); // Ambil kode terakhir
                    int kodeNum = Integer.parseInt(lastKode.substring(2)) + 1; // Ambil angka setelah "KR"
                    kodeMenu = String.format("KR%03d", kodeNum); // Format KRxxx dengan leading zero
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return kodeMenu;
}

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
  // TODO add your handling code here:
        new karyawan().setVisible(true);
        this.setVisible(false);                                     
    }//GEN-LAST:event_kembaliActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
           // Ambil data dari text fields
        String namaKaryawan = nama.getText(); // Misal nama adalah JTexField untuk nama karyawan
        
        String noTelp = nohp.getText(); // Misal notelp adalah JTexField untuk no telepon
        String Password = password.getText();
        String selectedRole = role.getSelectedItem().toString();
        String Rfid = RFID.getText();
        String id_karyawan = generateCode();
        // Periksa apakah semua field sudah diisi
        if (namaKaryawan.isEmpty() ||noTelp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Konfirmasi penambahan
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menambah data?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

        // Query untuk menambahkan data ke tabel karyawan
        String query = "INSERT INTO karyawan (id_karyawan, nama_karyawan, no_telp, password, role,RFID, tanggal_masuk) VALUES (?, ?, ?, ?, ?,?, NOW())";

        // Menambahkan data ke database
        try (Connection conn = koneksi.getConnection(); PreparedStatement stat = conn.prepareStatement(query)) {
            // Set nilai parameter
            stat.setString(1, id_karyawan);
            stat.setString(2, namaKaryawan);
           
            stat.setString(3, noTelp);
            stat.setString(4, Password);
           
            stat.setString(5, selectedRole);
             stat.setString(6, Rfid);

            // Eksekusi query
            int rowsAffected = stat.executeUpdate();

            // Periksa apakah data berhasil ditambahkan
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                  karyawan karyawan = new karyawan(); // Buat objek halaman karyawan
            karyawan.setVisible(true); 
                // Panggil loadTableData() untuk memperbarui tampilan tabel
               // loadTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            // Menangani kesalahan
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Menampilkan detail kesalahan di konsol (untuk debug)
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void nokaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nokaryawanActionPerformed

    private void RFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RFIDActionPerformed

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
            java.util.logging.Logger.getLogger(tambahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahkaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RFID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nohp;
    private javax.swing.JTextField nokaryawan;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables

    private void makeButtonTransparent(JButton kembali) {
       kembali.setOpaque(false);
        kembali.setContentAreaFilled(false);
        kembali.setBorderPainted(false);
        kembali.setBorder(new EmptyBorder(0, 0, 0, 0));
    } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

    private void customizeTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
