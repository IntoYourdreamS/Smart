/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smart;

import java.awt.Color;
import javax.swing.JOptionPane;




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
    }

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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_pasword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show.png"))); // NOI18N
        show_pasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_paswordMouseClicked(evt);
            }
        });
        getContentPane().add(show_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 50, 50));

        hide_pasword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_pasword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidden-12115 4.png"))); // NOI18N
        getContentPane().add(hide_pasword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 50, 50));

        FieldUsername.setBorder(null);
        FieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 200, 30));

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
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 200, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 47.png"))); // NOI18N
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 47.png"))); // NOI18N
        jButton1.setSelected(true);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 47.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1370, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      dashboard restockMenu = new dashboard(); 
        restockMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameActionPerformed
        // TODO add your handling code here:
     loginValidation();
    }//GEN-LAST:event_FieldUsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        loginValidation();
    }//GEN-LAST:event_PasswordActionPerformed

    private void show_paswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_paswordMouseClicked
         show_pasword.setVisible(false);  // Sembunyikan tombol show
    hide_pasword1.setVisible(true);  // Tampilkan tombol hide
    Password.setEchoChar((char) 0);
    
    show_pasword.getParent().revalidate();
    show_pasword.getParent().repaint();
    }//GEN-LAST:event_show_paswordMouseClicked

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
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel hide_pasword1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel show_pasword;
    // End of variables declaration//GEN-END:variables
}
