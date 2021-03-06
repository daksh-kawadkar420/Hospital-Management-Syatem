package sanjeevani.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import sanjeevani.dao.DoctorDao;
import sanjeevani.pojo.CloseFrame;
import sanjeevani.pojo.DoctorPojo;

public class AddDoctorFrame extends javax.swing.JFrame {

    private HashMap<String, String> doctor;
    private String isActive,empId, userId, pass, rePass, userName, userType, specialist, qualifications, doctorId;

    public AddDoctorFrame() {
        initComponents();
        txtPassword.setEchoChar('#');
        txtRePassword.setEchoChar('#');
        setLocationRelativeTo(null);
        loadDoctorDetails();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox<>();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        txtQualifications = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        chkIsActive = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Doctor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(145, 176, 187));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 41, 41), 2));

        jPanel2.setBackground(new java.awt.Color(27, 103, 140));

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Register Doctor");

        lblLogout.setBackground(new java.awt.Color(171, 171, 171));
        lblLogout.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblLogout.setForeground(java.awt.Color.white);
        lblLogout.setText("Logout");
        lblLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(16, 140, 89));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor  Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Employee Id");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText(" User-Id");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Re-Type Password");

        jcEmpId.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jcEmpId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcEmpIdItemStateChanged(evt);
            }
        });
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });

        txtEmployeeName.setEditable(false);
        txtEmployeeName.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Qualifications");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Doctor -Id");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Specialist");

        txtDoctorId.setEditable(false);
        txtDoctorId.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });

        txtSpecialist.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialistActionPerformed(evt);
            }
        });

        txtQualifications.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtQualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Employee Name");

        txtUserId.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        txtRePassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        chkIsActive.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        chkIsActive.setForeground(java.awt.Color.white);
        chkIsActive.setText("Is Active");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(chkIsActive)))))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkIsActive))
                .addGap(15, 15, 15))
        );

        btnBack.setBackground(new java.awt.Color(24, 128, 67));
        btnBack.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnBack.setForeground(java.awt.Color.white);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(24, 128, 67));
        btnRegister.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnRegister.setForeground(java.awt.Color.white);
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadDoctorDetails() {
        try {
            doctor = DoctorDao.getNonRegisteredDoctor();
            txtDoctorId.setText(DoctorDao.getNewDoctorId());
            if (doctor.isEmpty()) {
                jcEmpId.removeAllItems();
                JOptionPane.showMessageDialog(null, "No UnRegistered Doctor!", "Error", JOptionPane.ERROR_MESSAGE);
                btnRegister.setEnabled(false);
                return;
            }
            btnRegister.setEnabled(true);
            Set<String> keys = doctor.keySet();
            Iterator<String> itr = keys.iterator();
            jcEmpId.removeAllItems();
            while (itr.hasNext()) {
                jcEmpId.addItem(itr.next());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in DataBase!", "Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginframe = new LoginFrame();
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageDoctorFrame manageDoctorFrame = new ManageDoctorFrame();
        manageDoctorFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        if (!validateInput()) {
            JOptionPane.showMessageDialog(null, "Please Fill All The Fields!", "Input Required!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!passValidate()) {
            JOptionPane.showMessageDialog(null, "Password atleast of 4 digits!!", "Password Required!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean isactive=chkIsActive.isEnabled();
        System.out.println("isActive:"+isactive);
        if(isactive){
            isActive="Y";
        }
        else{
            isActive="N";
        }
        empId = jcEmpId.getSelectedItem().toString();
        userName = txtEmployeeName.getText();
        userId = txtUserId.getText();
        doctorId = txtDoctorId.getText();
        specialist = txtSpecialist.getText();
        qualifications = txtQualifications.getText();
        userType = "Doctor";
        char[] pwd = txtPassword.getPassword();
        pass = String.valueOf(pwd);
        char[] repwd = txtRePassword.getPassword();
        rePass = String.valueOf(repwd);
        if (!passwordMatch(pass, rePass)) {
            JOptionPane.showMessageDialog(null, "Password not Matched", "Invalid Password!", JOptionPane.ERROR_MESSAGE);
            clearPass();
            return;
        }
        try {
            DoctorPojo doctor = new DoctorPojo(userId, pass, userType, empId, userName, doctorId, specialist, qualifications,isActive);
            boolean status = DoctorDao.addDoctor(doctor);
            if (status) {
                JOptionPane.showMessageDialog(null, "Doctor Registered To Database Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                loadDoctorDetails();
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Registered Doctor!", "Registering Doctor Denied!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error While Registering Doctor!", "Exception", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void txtSpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialistActionPerformed

    private void txtQualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CloseFrame.closeFrame();
    }//GEN-LAST:event_formWindowClosing

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    public boolean validateInput() {
        return !(txtUserId.getText().isEmpty() || txtUserId.getText().isEmpty() || txtQualifications.getText().isEmpty() || txtSpecialist.getText().isEmpty());
    }

    public boolean passValidate() {
        char[] pwd = txtPassword.getPassword();
        char[] repwd = txtRePassword.getPassword();
        return !(pwd.length < 4 || repwd.length < 4);
    }

    public boolean passwordMatch(String a, String b) {
        return a.equals(b);
    }

    public void clearPass() {
        txtRePassword.setText("");
        txtPassword.setText("");

    }

    public void clearAll() {
        txtEmployeeName.setText("");
        txtRePassword.setText("");
        txtPassword.setText("");
        txtUserId.setText("");
        txtDoctorId.setText("");
        txtSpecialist.setText("");
        txtQualifications.setText("");

    }
    private void jcEmpIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcEmpIdItemStateChanged
        if (jcEmpId.getItemCount() == 0) {
            return;
        }

        txtEmployeeName.setText(doctor.get(jcEmpId.getSelectedItem().toString()));

    }//GEN-LAST:event_jcEmpIdItemStateChanged

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEmpIdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtQualifications;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtSpecialist;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
