package popup;

import Config.koneksi;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import smart.karyawan;
import smart.restok;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

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
        makeButtonTransparent(kembali);
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

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class Coba extends JFrame {

        public Coba() {
            setTitle("Popup Frame - Coba");
            setSize(200, 150);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        id_pembelian = new javax.swing.JTextField();
        id_produk = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        id_supplier = new javax.swing.JTextField();
        alasantext = new javax.swing.JTextField();
        tanggal_return = new com.toedter.calendar.JDateChooser();
        kembali = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(id_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 300, 30));

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 310, 30));

        id_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 232, 310, 30));

        alasantext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alasantextActionPerformed(evt);
            }
        });
        getContentPane().add(alasantext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 310, 30));
        getContentPane().add(tanggal_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 282, 300, 30));

        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 20, 40, 40));

        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 200, 40));

        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return_barang_paling_terbaru.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        }

        private void clearFields() {
            id_pembelian.setText("");
            tanggal_return.setDate(null);
            alasantext.setText("");
        }

        private void ubahActionPerformed(java.awt.event.ActionEvent evt) {
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
        }

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

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here;
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void id_pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pembelianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pembelianActionPerformed

    private void id_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_produkActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void id_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_supplierActionPerformed

    private void alasantextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alasantextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alasantextActionPerformed

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
    private javax.swing.JTextField alasantext;
    private javax.swing.JTextField id_pembelian;
    private javax.swing.JTextField id_produk;
    private javax.swing.JTextField id_supplier;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton kembali;
    private javax.swing.JButton tambah;
    private com.toedter.calendar.JDateChooser tanggal_return;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
