package Student;

import Connection.DBConnection;
import Connection.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class Student_Panel extends javax.swing.JFrame {

    PreparedStatement pst = null;
    ResultSet rst = null; 
    Connection conn = null;
    Statement rs = null;
            
    public Student_Panel() {
        initComponents();
        conn = DBConnection.connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Original = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbProfilePicture = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBirthDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        txtSuffix = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jlbReturn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCampus = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Original.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
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

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Profile Picture:");

        jlbProfilePicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jlbProfilePicture.setMaximumSize(new java.awt.Dimension(232, 232));
        jlbProfilePicture.setMinimumSize(new java.awt.Dimension(232, 232));
        jlbProfilePicture.setPreferredSize(new java.awt.Dimension(232, 232));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jlbProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jlbProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 302));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 150, -1));

        txtRegEmail.setEditable(false);
        txtRegEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtRegEmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtRegEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtRegEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtRegEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtRegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 280, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Birth Date:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, -1));

        txtBirthDate.setEditable(false);
        txtBirthDate.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthDate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtBirthDate.setForeground(new java.awt.Color(0, 0, 0));
        txtBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBirthDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBirthDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 140, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sex:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 150, -1));

        txtSex.setEditable(false);
        txtSex.setBackground(new java.awt.Color(255, 255, 255));
        txtSex.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtSex.setForeground(new java.awt.Color(0, 0, 0));
        txtSex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSex.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 140, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Middle Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, 30));

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 140, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Suffix:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 150, -1));

        txtMiddleName.setEditable(false);
        txtMiddleName.setBackground(new java.awt.Color(255, 255, 255));
        txtMiddleName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtMiddleName.setForeground(new java.awt.Color(0, 0, 0));
        txtMiddleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMiddleName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 30));

        txtSuffix.setEditable(false);
        txtSuffix.setBackground(new java.awt.Color(255, 255, 255));
        txtSuffix.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtSuffix.setForeground(new java.awt.Color(0, 0, 0));
        txtSuffix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuffix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSuffix.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtSuffix, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 140, 30));

        txtStudentID.setEditable(false);
        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStudentID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtStudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 140, 30));

        txtMobileNumber.setEditable(false);
        txtMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtMobileNumber.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMobileNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 140, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Campus:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 150, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Student ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 150, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Mobile No:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Registered Email:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 330, -1, -1));

        txtCourse.setEditable(false);
        txtCourse.setBackground(new java.awt.Color(255, 255, 255));
        txtCourse.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 140, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Last Name:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 150, -1));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 140, 30));

        jlbReturn.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jlbReturn.setForeground(new java.awt.Color(255, 255, 255));
        jlbReturn.setText("Return");
        jlbReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbReturnMouseClicked(evt);
            }
        });
        jPanel1.add(jlbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 13, 80, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Course:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 150, 30));

        txtCampus.setEditable(false);
        txtCampus.setBackground(new java.awt.Color(255, 255, 255));
        txtCampus.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtCampus.setForeground(new java.awt.Color(0, 0, 0));
        txtCampus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCampus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCampus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, 30));

        Original.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 610, 453));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Background (610x710).png"))); // NOI18N
        Original.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlbReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbReturnMouseClicked
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to leave?", "Leaving So Soon?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Thank you for visiting your credentials.", "Have a nice day!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Login lg = new Login();
            lg.setTitle("Group 1 | Login Page");
            lg.setVisible(true);
        }else if(confirmation == JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_jlbReturnMouseClicked

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
            java.util.logging.Logger.getLogger(Student_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Panel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Original;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel jlbProfilePicture;
    private javax.swing.JLabel jlbReturn;
    public static javax.swing.JTextField txtBirthDate;
    public static javax.swing.JTextField txtCampus;
    public static javax.swing.JTextField txtCourse;
    public static javax.swing.JTextField txtFirstName;
    public static javax.swing.JTextField txtLastName;
    public static javax.swing.JTextField txtMiddleName;
    public static javax.swing.JTextField txtMobileNumber;
    public static javax.swing.JTextField txtRegEmail;
    public static javax.swing.JTextField txtSex;
    public static javax.swing.JTextField txtStudentID;
    public static javax.swing.JTextField txtSuffix;
    // End of variables declaration//GEN-END:variables
}