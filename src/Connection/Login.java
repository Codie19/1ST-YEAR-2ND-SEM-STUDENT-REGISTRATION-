package Connection;

import Student.Student_Panel;
import Admin.Admin_Panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame{

    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static Statement st = null;
    
    public Login() {
        initComponents();
        conn = DBConnection.connectDB();
        
        addPlaceholderStyle(txtEmail);
        addPlaceholderStyle(txtPassword);
    }

    public void addPlaceholderStyle(JTextField textfield){
        Font inv = textfield.getFont();
        inv = inv.deriveFont(Font.ITALIC);
        textfield.setFont(inv);
        textfield.setForeground(Color.GRAY);
    }
    
    public void removePlaceholderStyle(JTextField textfield){
        Font inv = textfield.getFont();
        inv = inv.deriveFont(Font.ROMAN_BASELINE|Font.BOLD);
        textfield.setFont(inv);
        textfield.setForeground(Color.BLACK);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Original = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnShutdown = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        btnSignup = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 1 | Login Page");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(610, 547));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        Original.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        Header.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUEZON CITY UNIVERSITY");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/QCU.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Original.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        MainPanel.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lock.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Like.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Timer.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SECURE");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FAST");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HANDY");

        btnShutdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Shutdown.png"))); // NOI18N
        btnShutdown.setBorder(null);
        btnShutdown.setBorderPainted(false);
        btnShutdown.setContentAreaFilled(false);
        btnShutdown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShutdownActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255, 125));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student Login / Signup");
        jLabel4.setPreferredSize(new java.awt.Dimension(344, 42));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Email"); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtEmail.setName(""); // NOI18N
        txtEmail.setOpaque(true);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtPassword.setEchoChar('\u0000');
        txtPassword.setOpaque(true);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel5.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Password.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel11.setOpaque(true);

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnSignup.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignup.setText("Signup");
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });

        Time.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, 0)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                        .addComponent(txtEmail))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnSignup)
                .addGap(41, 41, 41)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(btnShutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        Original.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 610, 470));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/QCU Background - Night.png"))); // NOI18N
        Original.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 547));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShutdownActionPerformed
        // TODO add your handling code here:
        int shutdown = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the program?", "Leaving already?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(shutdown == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(this, "Goodbye. Have a nice day!", "Shutting down...", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                }else if(shutdown == JOptionPane.NO_OPTION){
                }
    }//GEN-LAST:event_btnShutdownActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if(txtEmail.getText().equals("Email")){
            txtEmail.setText(null);
            txtEmail.requestFocus();
            removePlaceholderStyle(txtEmail);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if(txtPassword.getText().equals("Password")){
            txtPassword.setText(null);
            txtPassword.requestFocus();
            txtPassword.setEchoChar('\u25cf');
            removePlaceholderStyle(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().length()==0){
            addPlaceholderStyle(txtEmail);
            txtEmail.setText("Email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if(txtPassword.getText().length()==0){
            addPlaceholderStyle(txtPassword);
            txtPassword.setText("Password");
            txtPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String pass = String.valueOf(txtPassword.getPassword());
        
        if(email.equals("Email") || pass.equals("Password")){
            JOptionPane.showMessageDialog(this, "Do not leave any fields blank! Please try again...", "Error!", JOptionPane.ERROR_MESSAGE);
        }else if(email.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(this, "Do not leave any fields blank! Please try again...", "Error!", JOptionPane.ERROR_MESSAGE);
        }else if(email.equals("Admin") || pass.equals("1994")){
                        JOptionPane.showMessageDialog(this, "Welcome back Admin!", "Good Day!", JOptionPane.INFORMATION_MESSAGE);
                        Admin_Panel ap = new Admin_Panel();
                        ap.setTitle("Group 1 | Admin Panel");
                        ap.setVisible(true);
                        dispose();
        }else if(!txtEmail.getText().endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(this, "This is not a valid Email Address", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{
            StudentLogin(email,pass);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
        dispose();
        Registration rg = new Registration();
        rg.setTitle("Group 1 | Registration Page");
        rg.setVisible(true);
    }//GEN-LAST:event_btnSignupMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        JPasswordField pw = (JPasswordField) evt.getSource();
        if(pw.echoCharIsSet()){
            pw.setEchoChar((char)0);
        }else{
            pw.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Original;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JButton btnShutdown;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField txtEmail;
    private static javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

public Connection StudentLogin (String email, String pass){
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            try{
                PreparedStatement ps = (PreparedStatement)
                        dbconn.prepareStatement("SELECT * FROM users WHERE Email= ? AND Password= ?");
                ps.setString(1, email);
                ps.setString(2, pass);
                ResultSet res = ps.executeQuery();
                    if(res.next()){
                        JOptionPane.showMessageDialog(this, "Welcome back Student!", "Good Day!", JOptionPane.INFORMATION_MESSAGE);
                        Student_Panel sp = new Student_Panel();
                        sp.setTitle("Group 1 | Student Panel");
                        sp.setVisible(true);
                        Load();
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, "Email and Password cannot be recognized. Please try again...", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
            }catch(SQLException ex){
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return dbconn;
            }
            }else{
                System.out.println("Cannot connect to DB");
                return null;
            }
        return null;
    }

public static void Load(){
    try{
        String sql = "SELECT * FROM users WHERE Email= '"+txtEmail.getText()+"' AND Password= '"+txtPassword.getText()+"'";
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        
        while(rs.next()){
               String fn = rs.getString(2);
               String mn = rs.getString(3);
               String ln = rs.getString(4);
               String sf = rs.getString(5);
               String bday = rs.getString(8);
               String sex = rs.getString(9);
               String stid = rs.getString(6);
               String mobn = rs.getString(11);
               String course = rs.getString(13);
               String email = rs.getString(10);
               String camp = rs.getString(12);
               Blob photo = rs.getBlob(14);
               
               Student_Panel.txtFirstName.setText(fn);
               Student_Panel.txtMiddleName.setText(mn);
               Student_Panel.txtLastName.setText(ln);
               Student_Panel.txtSuffix.setText(sf);
               Student_Panel.txtBirthDate.setText(bday);
               Student_Panel.txtSex.setText(sex);
               Student_Panel.txtStudentID.setText(stid);
               Student_Panel.txtMobileNumber.setText(mobn);
               Student_Panel.txtCourse.setText(course);
               Student_Panel.txtRegEmail.setText(email);
               Student_Panel.txtCampus.setText(camp);
               InputStream is = photo.getBinaryStream(1, photo.length());
               BufferedImage imag = ImageIO.read(is);
               Image image = imag.getScaledInstance(Student_Panel.jlbProfilePicture.getWidth(), Student_Panel.jlbProfilePicture.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon icon = new ImageIcon(image);
               Student_Panel.jlbProfilePicture.setIcon(icon);
               
        }
    }catch(Exception ex){
    }
}
}