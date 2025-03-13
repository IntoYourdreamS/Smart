/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;

import java.awt.Color;
import Config.koneksi;
import Config.Session;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author acer
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        Password.setOpaque(false);
        Password.setBackground(new Color(0, 0, 0, 0));
        FieldUsername.setOpaque(false);
        FieldUsername.setBackground(new Color(0, 0, 0, 0));

        hide_pasword1.setVisible(false);
        hide_pasword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });

    }
    Connection conn = koneksi.getConnection();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_pasword = new javax.swing.JLabel();
        hide_pasword1 = new javax.swing.JLabel();
        FieldUsername = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RFIDInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_pasword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eye-48 (1).png"))); // NOI18N
        show_pasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_paswordMouseClicked(evt);
            }
        });
        getContentPane().add(show_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 50, 50));

        hide_pasword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_pasword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eye-48 (2).png"))); // NOI18N
        hide_pasword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_pasword1MouseClicked(evt);
            }
        });
        getContentPane().add(hide_pasword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 50, 50));

        FieldUsername.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        FieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        FieldUsername.setBorder(null);
        FieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameActionPerformed(evt);
            }
        });
        FieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 290, 40));

        Password.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 290, 40));

        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 63 (1).png"))); // NOI18N
        Login.setAutoscrolls(true);
        Login.setBorder(null);
        Login.setBorderPainted(false);
        Login.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 47.png"))); // NOI18N
        Login.setSelected(true);
        Login.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 47.png"))); // NOI18N
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log In (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1370, 870));

        RFIDInput.setUI(null);
        getContentPane().add(RFIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String userInput = FieldUsername.getText();
        char[] passwordInputChar = Password.getPassword();
        String passwordInput = new String(passwordInputChar);

        // Variabel untuk koneksi database
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // Koneksi ke database (ganti URL, username, dan password sesuai konfigurasi Anda)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart", "root", "");

            // Query untuk memeriksa kombinasi login
            String sql = "SELECT * FROM karyawan WHERE nama_karyawan = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userInput);
            pstmt.setString(2, passwordInput); // Pastikan password tersimpan dalam bentuk terenkripsi di database

            rs = pstmt.executeQuery();

            if (rs.next()) {
                // Login berhasil
                Session.setKode(rs.getString("id_karyawan"));
                Session.setRole(rs.getString("role"));
                JOptionPane.showMessageDialog(this, "Login berhasil sebagai " + Session.getRole() + "!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                new dashboard().setVisible(true);
                this.setVisible(false);
            } else {
                // Login gagal
                JOptionPane.showMessageDialog(this, "Login gagal. Username, password, atau role salah.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Tutup koneksi database
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void FieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameActionPerformed
        // TODO add your handling code here:
        loginValidation();
    }//GEN-LAST:event_FieldUsernameActionPerformed

    private void show_paswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_paswordMouseClicked
        show_pasword.setVisible(false);  // Sembunyikan tombol show
        hide_pasword1.setVisible(true);  // Tampilkan tombol hide
        Password.setEchoChar((char) 0);

        show_pasword.getParent().revalidate();
        show_pasword.getParent().repaint();
    }//GEN-LAST:event_show_paswordMouseClicked

    private void hide_pasword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_pasword1MouseClicked
        show_pasword.setVisible(true);  // Tampilkan tombol show
        hide_pasword1.setVisible(false); // Sembunyikan tombol hide
        Password.setEchoChar('*'); // Kembalikan karakter password ke bentuk tersembunyi (bintang)

        hide_pasword1.getParent().revalidate();
        hide_pasword1.getParent().repaint();

    }//GEN-LAST:event_hide_pasword1MouseClicked
    
    private long lastTime = 0;
    private String buffer = "";
    private final int RFID_THRESHOLD = 30;
    
    private void FieldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldUsernameKeyTyped
        // TODO add your handling code here:
        long currentTime = System.currentTimeMillis();
        char c = evt.getKeyChar();

        // Cek apakah inputnya terlalu cepat (mungkin RFID)
        if (lastTime != 0 && (currentTime - lastTime) > RFID_THRESHOLD) {
            buffer = ""; // Reset buffer jika jedanya lama
        }

        buffer += c;
        lastTime = currentTime;

        if (c == '\n' || c
                == '\r') { // RFID biasanya mengakhiri input dengan Enter
            if (buffer.length() >= 9) { // Anggap RFID minimal 8 karakter
                RFIDInput.setText(buffer); // Pindahkan ke textField tersembunyi
                FieldUsername.setText(""); // Kosongkan kembali username
                ambilData(RFIDInput.getText().trim());
                System.out.println("Scan RFID Terdeteksi: " + buffer);

            } else {
                System.out.println("Input Manual: " + buffer);
            }
            buffer = ""; // Reset buffer setelah Enter ditekan
        }
    }//GEN-LAST:event_FieldUsernameKeyTyped

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        loginValidation();
    }//GEN-LAST:event_PasswordActionPerformed

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        show_pasword.setVisible(true);   // Tampilkan tombol show
        hide_pasword1.setVisible(false);
        Password.setEchoChar('*');

        hide_pasword1.getParent().revalidate();
        hide_pasword1.getParent().repaint();
    }//GEN-LAST:event_PasswordMouseClicked
    private void loginValidation() {
        char[] passChars = Password.getPassword();
        String password = new String(passChars);
        String username = FieldUsername.getText().trim();

        if (username.equals("admin") && password.equals("admin123")) {
            dashboard dashboardMenu = new dashboard();
            dashboardMenu.setVisible(true);

            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username atau Password Salah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        java.util.Arrays.fill(passChars, '0');
        Password.setText("");
    }
    
    private void ambilData(String rfid) {
        String query = "SELECT * FROM karyawan WHERE RFID = ? LIMIT 1";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, rfid);
            ResultSet hasil = ps.executeQuery();

            if (hasil.next()) {
                Session.setKode(hasil.getString("id_karyawan"));
                Session.setRole(hasil.getString("role"));
                do {
                    JOptionPane.showMessageDialog(this, "Login berhasil sebagai " + Session.getRole() + "!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    new dashboard().setVisible(true);
                    this.setVisible(false);
//                        System.out.println(Session.getRole());
//                    mainf.init();
                } while (hasil.next());
            } else {
                JOptionPane.showMessageDialog(this, "RFID Tidak Terdaftar ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField RFIDInput;
    private javax.swing.JLabel hide_pasword1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel show_pasword;
    // End of variables declaration//GEN-END:variables
}
