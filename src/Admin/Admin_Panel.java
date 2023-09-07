package Admin;

import Connection.DBConnection;
import Connection.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Admin_Panel extends javax.swing.JFrame {

    static Connection conn;
    static ResultSet res;
    static PreparedStatement pst;
    
    public Admin_Panel() {
        initComponents();
        conn = DBConnection.connectDB();
        Cmbobox();
        addPlaceholderStyle(txtFirstName);
        addPlaceholderStyle(txtMiddleName);
        addPlaceholderStyle(txtLastName);
        addPlaceholderStyle(txtSuffix);
        addPlaceholderStyle(txtBirthDate);
        addPlaceholderStyle(txtSex);
        addPlaceholderStyle(txtMobileNumber);
        addPlaceholderStyle(txtCampus);
        addPlaceholderStyle(txtCourse);
        addPlaceholderStyle(txtStudentID);
        addPlaceholderStyle(txtEmail);
        
        Fetch();
        LoadProductNo();
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
    
    public void Cmbobox(){
        String sql = "SELECT * FROM users";
        try{
            pst = conn.prepareStatement(sql);
            res = pst.executeQuery();
            while(res.next()){
                cmbStudentID.addItem(res.getString("ID"));
            }
        }catch(Exception ex){
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Original = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jlbProfilePicture = new javax.swing.JLabel();
        cmbStudentID = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtSuffix = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtCampus = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        tblScroll = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Original.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Header.setOpaque(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/QCU.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/QCU.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUEZON CITY UNIVERSITY");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(9, 9, 9))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Original.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        Body.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Body.setOpaque(false);
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbProfilePicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbProfilePicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Body.add(jlbProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 44, 173, 173));

        cmbStudentID.setBackground(new java.awt.Color(255, 255, 255));
        cmbStudentID.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        cmbStudentID.setForeground(new java.awt.Color(0, 0, 0));
        cmbStudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbStudentID.setBorder(null);
        cmbStudentID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Body.add(cmbStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 230, 197, 38));

        btnReturn.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        Body.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 10, -1, -1));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.setOpaque(false);

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setText("First Name");
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });

        txtMiddleName.setBackground(new java.awt.Color(255, 255, 255));
        txtMiddleName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtMiddleName.setForeground(new java.awt.Color(0, 0, 0));
        txtMiddleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMiddleName.setText("Middle Name");
        txtMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMiddleName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMiddleNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMiddleNameFocusLost(evt);
            }
        });

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setText("Last Name");
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });

        txtSex.setBackground(new java.awt.Color(255, 255, 255));
        txtSex.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtSex.setForeground(new java.awt.Color(0, 0, 0));
        txtSex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSex.setText("Sex");
        txtSex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSexFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSexFocusLost(evt);
            }
        });

        txtBirthDate.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthDate.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtBirthDate.setForeground(new java.awt.Color(0, 0, 0));
        txtBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBirthDate.setText("YYYY-MM-DD");
        txtBirthDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBirthDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBirthDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBirthDateFocusLost(evt);
            }
        });

        txtSuffix.setBackground(new java.awt.Color(255, 255, 255));
        txtSuffix.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtSuffix.setForeground(new java.awt.Color(0, 0, 0));
        txtSuffix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuffix.setText("Suffix");
        txtSuffix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSuffix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSuffixFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSuffixFocusLost(evt);
            }
        });

        txtMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtMobileNumber.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMobileNumber.setText("Mobile #");
        txtMobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMobileNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMobileNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMobileNumberFocusLost(evt);
            }
        });

        txtCampus.setBackground(new java.awt.Color(255, 255, 255));
        txtCampus.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtCampus.setForeground(new java.awt.Color(0, 0, 0));
        txtCampus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCampus.setText("Campus");
        txtCampus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCampus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCampusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCampusFocusLost(evt);
            }
        });

        txtCourse.setBackground(new java.awt.Color(255, 255, 255));
        txtCourse.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCourse.setText("Course");
        txtCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCourseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCourseFocusLost(evt);
            }
        });

        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStudentID.setText("Student ID");
        txtStudentID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtStudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStudentIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStudentIDFocusLost(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Email");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        Body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblData.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "F. Name", "M. Name", "L. Name", "Suffix", "Birthday", "Sex", "Mobile #", "Campus", "Course", "Email", "Photo"
            }
        ));
        tblData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblData.setEnabled(false);
        tblData.setFillsViewportHeight(true);
        tblData.setMaximumSize(new java.awt.Dimension(2147483647, 70));
        tblData.setMinimumSize(new java.awt.Dimension(165, 70));
        tblData.setPreferredSize(new java.awt.Dimension(825, 70));
        tblData.setRowHeight(17);
        tblData.setShowGrid(true);
        tblData.getTableHeader().setResizingAllowed(false);
        tblData.getTableHeader().setReorderingAllowed(false);
        tblScroll.setViewportView(tblData);

        Body.add(tblScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 700, 150));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        Body.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        Body.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 230, -1, -1));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        Body.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 230, -1, -1));

        Original.add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 700, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Background (700x500).png"))); // NOI18N
        Original.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Original, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusGained
        // TODO add your handling code here:
        if(txtFirstName.getText().equals("First Name")){
            txtFirstName.setText(null);
            txtFirstName.requestFocus();
            removePlaceholderStyle(txtFirstName);
        }
    }//GEN-LAST:event_txtFirstNameFocusGained

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
        // TODO add your handling code here:
        if(txtFirstName.getText().length()==0){
            addPlaceholderStyle(txtFirstName);
            txtFirstName.setText("First Name");
        }
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtMiddleNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiddleNameFocusGained
        // TODO add your handling code here:
        if(txtMiddleName.getText().equals("Middle Name")){
            txtMiddleName.setText(null);
            txtMiddleName.requestFocus();
            removePlaceholderStyle(txtMiddleName);
        }
    }//GEN-LAST:event_txtMiddleNameFocusGained

    private void txtMiddleNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMiddleNameFocusLost
        // TODO add your handling code here:
        if(txtMiddleName.getText().length()==0){
            addPlaceholderStyle(txtMiddleName);
            txtMiddleName.setText("Middle Name");
        }
    }//GEN-LAST:event_txtMiddleNameFocusLost

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        // TODO add your handling code here:
        if(txtLastName.getText().equals("Last Name")){
            txtLastName.setText(null);
            txtLastName.requestFocus();
            removePlaceholderStyle(txtLastName);
        }
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        // TODO add your handling code here:
        if(txtLastName.getText().length()==0){
            addPlaceholderStyle(txtLastName);
            txtLastName.setText("Last Name");
        }
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtSuffixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSuffixFocusGained
        // TODO add your handling code here:
        if(txtSuffix.getText().equals("Suffix")){
            txtSuffix.setText(null);
            txtSuffix.requestFocus();
            removePlaceholderStyle(txtSuffix);
        }
    }//GEN-LAST:event_txtSuffixFocusGained

    private void txtSuffixFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSuffixFocusLost
        // TODO add your handling code here:
        if(txtSuffix.getText().length()==0){
            addPlaceholderStyle(txtSuffix);
            txtSuffix.setText("Suffix");
        }
    }//GEN-LAST:event_txtSuffixFocusLost

    private void txtBirthDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBirthDateFocusGained
        // TODO add your handling code here:
        if(txtBirthDate.getText().equals("YYYY-MM-DD")){
            txtBirthDate.setText(null);
            txtBirthDate.requestFocus();
            removePlaceholderStyle(txtBirthDate);
        }
    }//GEN-LAST:event_txtBirthDateFocusGained

    private void txtBirthDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBirthDateFocusLost
        // TODO add your handling code here:
        if(txtBirthDate.getText().length()==0){
            addPlaceholderStyle(txtBirthDate);
            txtBirthDate.setText("YYYY-MM-DD");
        }
    }//GEN-LAST:event_txtBirthDateFocusLost

    private void txtSexFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSexFocusGained
        // TODO add your handling code here:
        if(txtSex.getText().equals("Sex")){
            txtSex.setText(null);
            txtSex.requestFocus();
            removePlaceholderStyle(txtSex);
        }
    }//GEN-LAST:event_txtSexFocusGained

    private void txtSexFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSexFocusLost
        // TODO add your handling code here:
        if(txtSex.getText().length()==0){
            addPlaceholderStyle(txtSex);
            txtSex.setText("Sex");
        }
    }//GEN-LAST:event_txtSexFocusLost

    private void txtMobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileNumberFocusGained
        // TODO add your handling code here:
        if(txtMobileNumber.getText().equals("Mobile #")){
            txtMobileNumber.setText(null);
            txtMobileNumber.requestFocus();
            removePlaceholderStyle(txtMobileNumber);
        }
    }//GEN-LAST:event_txtMobileNumberFocusGained

    private void txtMobileNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMobileNumberFocusLost
        // TODO add your handling code here:
        if(txtMobileNumber.getText().length()==0){
            addPlaceholderStyle(txtMobileNumber);
            txtMobileNumber.setText("Mobile #");
        }
    }//GEN-LAST:event_txtMobileNumberFocusLost

    private void txtCampusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCampusFocusGained
        // TODO add your handling code here:
        if(txtCampus.getText().equals("Campus")){
            txtCampus.setText(null);
            txtCampus.requestFocus();
            removePlaceholderStyle(txtCampus);
        }
    }//GEN-LAST:event_txtCampusFocusGained

    private void txtCampusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCampusFocusLost
        // TODO add your handling code here:
        if(txtCampus.getText().length()==0){
            addPlaceholderStyle(txtCampus);
            txtCampus.setText("Campus");
        }
    }//GEN-LAST:event_txtCampusFocusLost

    private void txtCourseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCourseFocusGained
        // TODO add your handling code here:
        if(txtCourse.getText().equals("Course")){
            txtCourse.setText(null);
            txtCourse.requestFocus();
            removePlaceholderStyle(txtCourse);
        }
    }//GEN-LAST:event_txtCourseFocusGained

    private void txtCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCourseFocusLost
        // TODO add your handling code here:
        if(txtCourse.getText().length()==0){
            addPlaceholderStyle(txtCourse);
            txtCourse.setText("Course");
        }
    }//GEN-LAST:event_txtCourseFocusLost

    private void txtStudentIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIDFocusGained
        // TODO add your handling code here:
        if(txtStudentID.getText().equals("Student ID")){
            txtStudentID.setText(null);
            txtStudentID.requestFocus();
            removePlaceholderStyle(txtStudentID);
        }
    }//GEN-LAST:event_txtStudentIDFocusGained

    private void txtStudentIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIDFocusLost
        // TODO add your handling code here:
        if(txtStudentID.getText().length()==0){
            addPlaceholderStyle(txtStudentID);
            txtStudentID.setText("Student ID");
        }
    }//GEN-LAST:event_txtStudentIDFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if(txtEmail.getText().equals("Email")){
            txtEmail.setText(null);
            txtEmail.requestFocus();
            removePlaceholderStyle(txtEmail);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().length()==0){
            addPlaceholderStyle(txtEmail);
            txtEmail.setText("Email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        // TODO add your handling code here:
        dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
            String stid = cmbStudentID.getSelectedItem().toString();
                String sql ="SELECT * FROM users WHERE StudentID= ?" ;           
                    pst = conn.prepareStatement(sql);
                        pst.setString(1, stid);
                            res = pst.executeQuery();
             
            if(res.next()==true){
                Blob pic = res.getBlob("Photo");
                txtFirstName.setText(res.getString(2));
                txtMiddleName.setText(res.getString(3));
                txtLastName.setText(res.getString(4));
                txtSuffix.setText(res.getString(5));
                txtBirthDate.setText(res.getString(8));
                txtSex.setText(res.getString(9));
                txtMobileNumber.setText(res.getString(11));
                txtCampus.setText(res.getString(12));
                txtCourse.setText(res.getString(13));
                txtStudentID.setText(res.getString(7));
                txtEmail.setText(res.getString(10));
                
                InputStream si = pic.getBinaryStream(1, pic.length());
                BufferedImage imag = null;
                try{
                    imag = ImageIO.read(si);
                }catch(IOException ex){
                    Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
                    Image image = imag.getScaledInstance(jlbProfilePicture.getWidth(), jlbProfilePicture.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon icon = new ImageIcon(image);
                            jlbProfilePicture.setIcon(icon);
            }   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            String fname = txtFirstName.getText();
            String mname = txtMiddleName.getText();
            String lname = txtLastName.getText();
            String sf = txtSuffix.getText();
            String bday = txtBirthDate.getText();
            String sex = txtSex.getText();
            String mbnum = txtMobileNumber.getText();
            String camp = txtCampus.getText();
            String course = txtCourse.getText();
            String stuid = txtStudentID.getText();
            String email = txtEmail.getText();
            String stid = cmbStudentID.getSelectedItem().toString();
            
            try {
                pst = conn.prepareStatement("UPDATE users SET FirstName=?, MiddleName=?, LastName=?, Suffix=?, Birthday=?, Sex=?, Mobile_Number=?, Campus=?, Course=?, StudentID=?, Email=? WHERE StudentID=?");
                
                pst.setString(1, fname);
                pst.setString(2, mname);
                pst.setString(3, lname);
                pst.setString(4, sf);
                pst.setString(5, bday);
                pst.setString(6, sex);
                pst.setString(7, mbnum);
                pst.setString(8, camp);
                pst.setString(9, course);
                pst.setString(10, stuid);
                pst.setString(11, email);
                pst.setString(12, stid);
                
                int k = pst.executeUpdate();
                
            if(k==1){
                JOptionPane.showMessageDialog(this, "Updated");
                txtFirstName.setText("");
                txtMiddleName.setText("");
                txtLastName.setText("");
                txtSuffix.setText("");
                txtBirthDate.setText("");
                txtSex.setText("");
                txtMobileNumber.setText("");
                txtCampus.setText("");
                txtCourse.setText("");
                txtStudentID.setText("");
                txtEmail.setText("");
                txtFirstName.requestFocus();
                
                LoadProductNo();
                Fetch();
            }
         } catch(SQLException ex){
             Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM users WHERE StudentID=?";
        String pid = cmbStudentID.getSelectedItem().toString();
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, pid);
            
            int k = pst.executeUpdate();
            
            if(k==1){
                
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY DELETED");
                txtFirstName.setText("");
                txtMiddleName.setText("");
                txtLastName.setText("");
                txtSuffix.setText("");
                txtBirthDate.setText("");
                txtSex.setText("");
                txtMobileNumber.setText("");
                txtCampus.setText("");
                txtCourse.setText("");
                txtStudentID.setText("");
                txtEmail.setText("");
                txtFirstName.requestFocus();
                
                Fetch();
                LoadProductNo();
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Original;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private static javax.swing.JComboBox<String> cmbStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbProfilePicture;
    private javax.swing.JTable tblData;
    private javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtCampus;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtSuffix;
    // End of variables declaration//GEN-END:variables
private void Fetch() {
      
    try{
        int q;
   
        pst = conn.prepareStatement("SELECT * FROM users");
        res = pst.executeQuery();
      
        ResultSetMetaData rss = res.getMetaData();
        
        q = rss.getColumnCount();
        
        DefaultTableModel df = (DefaultTableModel)tblData.getModel();
        df.setRowCount(0);
        
        while(res.next()){
            Vector v2 = new Vector();
            for(int a=1; a<=q; a++){
                v2.add(res.getString("StudentID"));
                v2.add(res.getString("FirstName"));
                v2.add(res.getString("MiddleName"));
                v2.add(res.getString("LastName"));
                v2.add(res.getString("Suffix"));
                v2.add(res.getString("Birthday"));
                v2.add(res.getString("Sex"));
                v2.add(res.getString("Mobile_Number"));
                v2.add(res.getString("Campus"));
                v2.add(res.getString("Course"));
                v2.add(res.getString("Email"));
            }
            df.addRow(v2);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

private void LoadProductNo() {
    
    try{
        String sql = "SELECT StudentID FROM users";
        pst = conn.prepareStatement(sql);
        res = pst.executeQuery();
         
        cmbStudentID.removeAllItems();
            
            while(res.next()){
                cmbStudentID.addItem(res.getString(1));
            }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
}