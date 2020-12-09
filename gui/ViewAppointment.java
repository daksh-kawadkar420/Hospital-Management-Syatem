/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevani.gui;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sanjeevani.dao.PatientDao;
import sanjeevani.pojo.PatientPojo;
import sanjeevani.pojo.UserProfile;

/**
 *
 * @author vishal
 */
public class ViewAppointment extends javax.swing.JFrame {
    private ArrayList<PatientPojo> patientList;
    /**
     * Creates new form ViewAppointment
     */
    public ViewAppointment() {
        initComponents();
        setLocationRelativeTo(null);
        showDataInTable();
    }
    
    private void showDataInTable() {     
        
        try {
            
            patientList = PatientDao.getPatientAppointment(UserProfile.getUsername());
            if (patientList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sorry! No Patient Are Present", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                Object[] rows = new Object[10];
                DefaultTableModel model = (DefaultTableModel) jtPatientDetails.getModel();
                for (PatientPojo patient : patientList) {
                    rows[0] = patient.getP_id();
                    rows[1] = patient.getF_name();
                    rows[2] = patient.getS_name();
                    rows[3] = patient.getAge();
                    rows[4] = patient.getOpd();
                    rows[5] = patient.getGender();
                    rows[6] = patient.getP_date();
                    rows[7] = patient.getCity();
                    rows[8] = patient.getPhone_no();

                    model.addRow(rows);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error while connecting to DataBase", "Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
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

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblLogout2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPatientDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 50, 50), 2));

        jPanel6.setBackground(new java.awt.Color(27, 103, 140));

        jLabel3.setBackground(java.awt.Color.blue);
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("View Appointment");

        lblLogout2.setBackground(new java.awt.Color(171, 171, 171));
        lblLogout2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblLogout2.setForeground(java.awt.Color.white);
        lblLogout2.setText("Logout");
        lblLogout2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogout2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogout2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogout2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(lblLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jtPatientDetails.setBackground(java.awt.Color.white);
        jtPatientDetails.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jtPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "F_NM", "S_NM", "AGE", "OPD", "GENDER", "DATE", "CITY", "MOB_NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPatientDetails);

        btnBack.setBackground(java.awt.Color.black);
        btnBack.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnBack.setForeground(java.awt.Color.white);
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout2MouseClicked
        LoginFrame loginframe = new LoginFrame();
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogout2MouseClicked

    private void lblLogout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout2MouseExited
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogout2MouseExited

    private void lblLogout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout2MouseEntered
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogout2MouseEntered

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DoctorOptionsFrame doctorOptionsFrame = new DoctorOptionsFrame();
        doctorOptionsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPatientDetails;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblLogout2;
    // End of variables declaration//GEN-END:variables
}