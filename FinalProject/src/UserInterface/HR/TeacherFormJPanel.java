/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HR;

import Business.Teacher.Teacher;
import Business.Teacher.TeacherDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author anshikakhandelwal
 */
public class TeacherFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherFormJPanel
     */
    
    TeacherDirectory teach;
    private Teacher teacher;
     JPanel mainWorkArea;
   

    TeacherFormJPanel(JPanel mainWorkArea,TeacherDirectory teach) {
       initComponents(); 
         this.teach =  teach;
         this.mainWorkArea= mainWorkArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtSubmit = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtqualify = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 102, 102));
        setLayout(null);

        jLabel1.setText("Name:");
        add(jLabel1);
        jLabel1.setBounds(210, 70, 38, 17);

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        add(txtname);
        txtname.setBounds(280, 60, 142, 23);

        txtSubmit.setBackground(new java.awt.Color(0, 255, 204));
        txtSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtSubmit.setText("Submit");
        txtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubmitActionPerformed(evt);
            }
        });
        add(txtSubmit);
        txtSubmit.setBounds(250, 240, 160, 29);

        btnUpload.setBackground(new java.awt.Color(0, 102, 102));
        btnUpload.setText("Uplaod Resume");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload);
        btnUpload.setBounds(270, 210, 124, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/form.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-100, 200, 1250, 580);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 10, 78, 23);

        jLabel3.setText("Qualifications");
        add(jLabel3);
        jLabel3.setBounds(180, 110, 100, 17);

        jLabel4.setText("Subject");
        add(jLabel4);
        jLabel4.setBounds(190, 160, 80, 17);

        txtqualify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqualifyActionPerformed(evt);
            }
        });
        add(txtqualify);
        txtqualify.setBounds(280, 110, 140, 23);

        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });
        add(txtsub);
        txtsub.setBounds(274, 160, 150, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
          // TODO add your handling code here:
        final JFileChooser fileChooser = new JFileChooser();
    // Set a filter for only PDF files
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
    
    // Open the file chooser dialog
    int returnValue = fileChooser.showOpenDialog(null);
    
    // If a file was selected (i.e., the user didn't cancel)
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        // Call a method to handle the file upload logic
        uploadFile(selectedFile);
    }
    }
    private void uploadFile(File file) {
    // Define the directory where you want to save the uploaded files
    // Make sure this directory exists on your system
    File destDir = new File("path/to/destination/directory");
    if (!destDir.exists()) {
        destDir.mkdirs(); // If the directory doesn't exist, create it.
    }

    // Create a File object for the destination
    File destFile = new File(destDir, file.getName());

    // Use Java NIO Files class to copy the file
    try {
        Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        JOptionPane.showMessageDialog(null, "File uploaded successfully!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error uploading file: " + ex.getMessage());
    }

    }//GEN-LAST:event_btnUploadActionPerformed

    private void txtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubmitActionPerformed
        // TODO add your handling code here:
         String name = txtname.getText();
        String qualifications = txtqualify.getText();
        String subjects = txtsub.getText();
        
        Teacher ts = teach.addNewTeacher();
        ts.setName(name);
        ts.setQualifications(qualifications);
        ts.setSubject(subjects);

        
              
        
        JOptionPane.showMessageDialog(this, "Your Information is successfully Saved.");
       
    }//GEN-LAST:event_txtSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         mainWorkArea.remove(this);
        CardLayout layout=(CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void txtqualifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqualifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqualifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton txtSubmit;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtqualify;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
