package Connection;

import java.awt.Color;
import java.awt.Font;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Registration extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet res = null;
    
    public Registration() {
        initComponents();
        conn = DBConnection.connectDB();
        
        addPlaceholderStyle(txtBday);
    }
    
    private void addPlaceholderStyle(JTextField textfield){
        Font bd = textfield.getFont();
        bd = bd.deriveFont(Font.ITALIC);
        textfield.setFont(bd);
        textfield.setForeground(Color.GRAY);
    }
    
    private void removePlaceholderStyle(JTextField textfield){
        Font bd = textfield.getFont();
        bd = bd.deriveFont(Font.ROMAN_BASELINE | Font.BOLD);
        textfield.setFont(bd);
        textfield.setForeground(Color.BLACK);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOldNew = new javax.swing.ButtonGroup();
        Original = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        btnSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        txtSuffix = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConfirmEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        rbOldStudent = new javax.swing.JRadioButton();
        rbNewStudent = new javax.swing.JRadioButton();
        txtStudentID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbCampus = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox<>();
        txtBday = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        btnAddImage = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(610, 547));

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

        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignIn.setBackground(new java.awt.Color(255, 255, 255));
        btnSignIn.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 0, 0));
        btnSignIn.setText("Sign In");
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        MainPanel.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 539, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, 35));

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MainPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 50, 129, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Middle Name:");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 9, -1, 35));

        txtMiddleName.setBackground(new java.awt.Color(255, 255, 255));
        txtMiddleName.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtMiddleName.setForeground(new java.awt.Color(0, 0, 0));
        txtMiddleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMiddleName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MainPanel.add(txtMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 50, 153, 30));

        txtSuffix.setBackground(new java.awt.Color(255, 255, 255));
        txtSuffix.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtSuffix.setForeground(new java.awt.Color(0, 0, 0));
        txtSuffix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuffix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSuffix.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MainPanel.add(txtSuffix, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 50, 72, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Suffix:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 9, -1, 35));

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MainPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 50, 124, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 9, -1, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birthday:");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 98, 129, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sex:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 98, 150, 35));

        cmbSex.setBackground(new java.awt.Color(255, 255, 255));
        cmbSex.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        cmbSex.setForeground(new java.awt.Color(0, 0, 0));
        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        cmbSex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cmbSex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(cmbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 139, 153, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");
        MainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 187, 129, 35));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MainPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 228, 270, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Confirm Email:");
        MainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 189, -1, -1));

        txtConfirmEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmEmail.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtConfirmEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtConfirmEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtConfirmEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MainPanel.add(txtConfirmEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 228, 270, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile Number:");
        MainPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 277, -1, 35));

        txtMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtMobileNumber.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MainPanel.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 318, 178, -1));

        btnOldNew.add(rbOldStudent);
        rbOldStudent.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        rbOldStudent.setForeground(new java.awt.Color(255, 255, 255));
        rbOldStudent.setText("Old Student");
        rbOldStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOldStudentActionPerformed(evt);
            }
        });
        MainPanel.add(rbOldStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 367, -1, -1));

        btnOldNew.add(rbNewStudent);
        rbNewStudent.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        rbNewStudent.setForeground(new java.awt.Color(255, 255, 255));
        rbNewStudent.setText("New Student");
        rbNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNewStudentActionPerformed(evt);
            }
        });
        MainPanel.add(rbNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 404, -1, 31));

        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtStudentID.setEnabled(false);
        MainPanel.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 367, 130, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student ID:");
        MainPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 367, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Campus:");
        MainPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 404, -1, 31));

        cmbCampus.setBackground(new java.awt.Color(255, 255, 255));
        cmbCampus.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        cmbCampus.setForeground(new java.awt.Color(0, 0, 0));
        cmbCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Batasan", "San Bartolome", "San Francisco" }));
        cmbCampus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cmbCampus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(cmbCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 404, -1, 31));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Confirm Password:");
        MainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 453, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password:");
        MainPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 453, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Already have an account?");
        MainPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 539, -1, 47));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Log In");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        MainPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 539, -1, 47));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPassword.setEchoChar('\u25cf');
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        MainPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 489, 270, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtConfirmPassword.setEchoChar('\u25cf');
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        MainPanel.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 489, 270, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Course:");
        MainPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 279, -1, -1));

        cmbCourse.setBackground(new java.awt.Color(255, 255, 255));
        cmbCourse.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        cmbCourse.setForeground(new java.awt.Color(0, 0, 0));
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "BECED", "BSA", "BSMA", "BSIE", "BSEE", "BSENTREP", "BSIT" }));
        cmbCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cmbCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 318, 270, 31));

        txtBday.setBackground(new java.awt.Color(255, 255, 255));
        txtBday.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        txtBday.setForeground(new java.awt.Color(0, 0, 0));
        txtBday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBday.setText("YYYY-MM-DD");
        txtBday.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBday.setOpaque(true);
        txtBday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBdayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBdayFocusLost(evt);
            }
        });
        MainPanel.add(txtBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 139, 129, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Image:");
        MainPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 98, -1, 35));

        txtPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoto.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        txtPhoto.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPhoto.setEnabled(false);
        MainPanel.add(txtPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 139, 232, 30));

        btnAddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Folder.png"))); // NOI18N
        btnAddImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddImageMouseClicked(evt);
            }
        });
        MainPanel.add(btnAddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 30, 30));

        Original.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 610, 603));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Background (610x710).png"))); // NOI18N
        Original.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        
        String fn = txtFirstName.getText();
        String mn = txtMiddleName.getText();
        String ln = txtLastName.getText();
        String sf = txtSuffix.getText();
        String bday = txtBday.getText();
        String sex = cmbSex.getSelectedItem().toString();
        String email = txtEmail.getText();
        String cemail = txtConfirmEmail.getText();
        String mobn = txtMobileNumber.getText();
        String stid = txtStudentID.getText();
        String camp = cmbCampus.getSelectedItem().toString();
        String pass = txtPassword.getText();
        String cpass = txtConfirmPassword.getText();
        String course = cmbCourse.getSelectedItem().toString();
        String profile = txtPhoto.getText();
        
        if(fn.isEmpty() || ln.isEmpty() || sex.equals("Select") || bday.isEmpty() || email.isEmpty() || cemail.isEmpty() || mobn.isEmpty() || camp.equals("Select") || pass.isEmpty() || cpass.isEmpty() || course.equals("Select") || btnOldNew.isSelected(null)){
            JOptionPane.showMessageDialog(this, "Please. Do not leave any important details blank.", "Error!", JOptionPane.ERROR_MESSAGE);
        }else if(txtStudentID.isEnabled()&&stid.isEmpty()){
            JOptionPane.showMessageDialog(this, "You forgot to type your Student ID", "Error!", JOptionPane.ERROR_MESSAGE);
        }else if(profile.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please kindly upload your image before proceeding.", "Oops.", JOptionPane.ERROR_MESSAGE);
        }else if(!txtEmail.getText().endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(this, "This is not a valid Email Address", "Error!", JOptionPane.ERROR_MESSAGE);
        }else if(!txtConfirmEmail.getText().endsWith(txtEmail.getText())){
            JOptionPane.showMessageDialog(this, "Email did not match", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{
            StudentRegistration(fn,mn,ln,sf,bday,sex,email,mobn,stid,camp,pass,course);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        Login lg = new Login();
        lg.setTitle("Group 1 | Login Page");
        lg.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        JPasswordField pw = (JPasswordField) evt.getSource();
        if(pw.echoCharIsSet()){
            pw.setEchoChar((char)0);
        }else{
            pw.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
        JPasswordField pw = (JPasswordField) evt.getSource();
        if(pw.echoCharIsSet()){
            pw.setEchoChar((char)0);
        }else{
            pw.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtBdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBdayFocusGained
        // TODO add your handling code here:
        if(txtBday.getText().equals("YYYY-MM-DD")){
            txtBday.setText(null);
            txtBday.requestFocus();
            removePlaceholderStyle(txtBday);
        }
    }//GEN-LAST:event_txtBdayFocusGained

    private void txtBdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBdayFocusLost
        // TODO add your handling code here:
        if(txtBday.getText().length()==0){
            addPlaceholderStyle(txtBday);
            txtBday.setText("YYYY-MM-DD");
        }
    }//GEN-LAST:event_txtBdayFocusLost

    private void rbOldStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOldStudentActionPerformed
        // TODO add your handling code here:
        txtStudentID.setEnabled(true);
        if(txtStudentID.isEnabled()){
            JOptionPane.showMessageDialog(this, "Please type here your Student ID.", "Old Student?", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_rbOldStudentActionPerformed

    private void rbNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNewStudentActionPerformed
        // TODO add your handling code here:
        txtStudentID.setEnabled(false);
        txtStudentID.setText("");
    }//GEN-LAST:event_rbNewStudentActionPerformed

    private void btnAddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddImageMouseClicked
        // TODO add your handling code here:
        JFileChooser prof = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.img", "jpg", "jpeg", "png", "gif");
        prof.addChoosableFileFilter(filter);
        prof.showOpenDialog(null);
        File pic = prof.getSelectedFile();
        filename = pic.getAbsolutePath();
        txtPhoto.setText(filename);

        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf, 0, readNum);
            }
                photo = bos.toByteArray();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnAddImageMouseClicked

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Original;
    private javax.swing.JLabel btnAddImage;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup btnOldNew;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JComboBox<String> cmbCampus;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbNewStudent;
    private javax.swing.JRadioButton rbOldStudent;
    private javax.swing.JTextField txtBday;
    private javax.swing.JTextField txtConfirmEmail;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtSuffix;
    // End of variables declaration//GEN-END:variables
    public void StudentRegistration (String fn, String mn, String ln, String sf, String bday, String sex, String email, String mobn, String stid, String camp, String pass, String course){
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            try {
			PreparedStatement ps = (PreparedStatement)
				dbconn.prepareStatement("INSERT INTO users (FirstName,MiddleName,LastName,Suffix,Birthday,Sex,Email,Mobile_Number,StudentID,Campus,Password,Course,Photo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
                        ps.setString(1, fn);
			ps.setString(2, mn);
			ps.setString(3, ln);
			ps.setString(4, sf);
			ps.setString(5, bday);
			ps.setString(6, sex);
                        ps.setString(7, email);
                        ps.setString(8, mobn);
                        ps.setString(9, stid);
                        ps.setString(10, camp);
                        ps.setString(11, pass);
                        ps.setString(12, course);
                        ps.setBytes(13, photo);
                        
                            int res = ps.executeUpdate();
                            
                                JOptionPane.showMessageDialog(this,"Registration Complete! Returning to Login Page...","Success!",JOptionPane.INFORMATION_MESSAGE);
                        
                                String birthday = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
                                
                        txtFirstName.setText("");
                        txtMiddleName.setText("");
                        txtLastName.setText("");
                        txtSuffix.setText("");
                        cmbSex.setSelectedItem("");
                        txtBday.setText(birthday);
                        txtEmail.setText("");
                        txtMobileNumber.setText("");
                        txtStudentID.setText("");
                        cmbCampus.setSelectedItem("");
                        txtPassword.setText("");
                        cmbCourse.setSelectedItem("");
                        
                        
                        dispose();
                        Login lgp = new Login();
                        lgp.setTitle("Group 1 | Login Page");
                        lgp.setVisible(true);
                        
                        
            }catch(SQLException ex){
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }}else{
                System.out.println("Connection is not available at the moment.");
        }
    }
byte[] photo = null;
String filename = null;
}