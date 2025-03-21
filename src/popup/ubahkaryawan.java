/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package popup;

import Config.koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import smart.karyawan;
import smart.restok;

/**
 *
 * @author ASUS
 */
public class ubahkaryawan extends javax.swing.JFrame {

    /**
     * Creates new form coba
     */
    public ubahkaryawan() {
        initComponents();
          makeButtonTransparent(kembali);
            makeButtonTransparent(tambah);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambah = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        id_karyawan = new javax.swing.JTextField();
        nama_karyawan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        no_telp = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        RFID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 190, 30));

        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 200, 30));

        id_karyawan.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        id_karyawan.setForeground(new java.awt.Color(116, 77, 6));
        id_karyawan.setBorder(null);
        id_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id_karyawan.setEnabled(false);
        id_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_karyawanActionPerformed(evt);
            }
        });
        getContentPane().add(id_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 360, 40));

        nama_karyawan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        nama_karyawan.setBorder(null);
        getContentPane().add(nama_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 390, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tambah karyawan (3).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        no_telp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        no_telp.setBorder(null);
        getContentPane().add(no_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 390, 40));

        password.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 400, 40));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "owner", "kasir", " " }));
        getContentPane().add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 410, 40));

        RFID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        RFID.setBorder(null);
        getContentPane().add(RFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 400, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubah karyawan (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String namaKaryawan = nama_karyawan.getText(); // Misal nama adalah JTexField untuk nama karyawan
        String alamatKaryawan = no_telp.getText(); // Misal alamat adalah JTexField untuk alamat
        String noTelp = no_telp.getText(); // Misal notelp adalah JTexField untuk no telepon
        String Password = password.getText();
        String selectedRole = role.getSelectedItem().toString();
        String Rfid = RFID.getText();
//        String kode = generateCode();

// Ambil ID karyawan yang dipilih dari tabel
        int selectedRow = karyawan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Konfirmasi ubah
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin mengubah data?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

//        String idKaryawan = tb_karyawan.getValueAt(selectedRow, 0).toString(); // Asumsi ID ada di kolom 0

// Periksa apakah semua field sudah diisi
        if (namaKaryawan.isEmpty() || alamatKaryawan.isEmpty() || noTelp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Query untuk mengupdate data karyawan
        String query = "UPDATE karyawan SET nama_karyawan=?, alamat=?, no_telp=?, role=? WHERE id_karyawan=?";

// Update data ke database
        try (Connection conn = koneksi.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {

            // Set nilai parameter
            pst.setString(1, namaKaryawan);
            pst.setString(2, alamatKaryawan);
            pst.setString(3, noTelp);
            pst.setString(4, selectedRole);
//            pst.setString(5, inputid);

            // Eksekusi query
            int rowsAffected = pst.executeUpdate();

            // Periksa apakah data berhasil diupdate
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                // Panggil loadTableData() untuk memperbarui tampilan tabel
//                loadTableData();
//                // Reset form
//                inputID.setText("");
//                nama1.setText("");
//                alamat.setText("");
//                notelp.setText("");
                password.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah data.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            // Menangani kesalahan
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
          new karyawan().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_kembaliActionPerformed

    private void id_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_karyawanActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(ubahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubahkaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubahkaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RFID;
    private javax.swing.JTextField id_karyawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama_karyawan;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
