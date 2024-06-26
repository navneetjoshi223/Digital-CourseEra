/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HR;

import Business.Business;
import Business.Organization.HumanResourceOrganization;
import Business.Teacher.Teacher;
import Business.Teacher.TeacherDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import Expense.Expense;
import java.awt.CardLayout;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.TeacherRole.TeacherProfileJPanel;

/**
 *
 * @author anshikakhandelwal
 */
public class HRJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HR
     */
    JPanel mainWorkArea;

    UserAccount useraccount;
    HumanResourceOrganization humanResourceOrganization;
    Business business;

    TeacherDirectory teach;
    private Teacher teacher;

    public HRJPanel(JPanel mainWorkArea, UserAccount account, HumanResourceOrganization humanResourceOrganization, Business business) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.teach = business.getTeacherDirectory();
        this.humanResourceOrganization = humanResourceOrganization;
        this.useraccount = account;
        this.business = business;
//        populateTable();
        populateRequestTable();

    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tblTeacher.getModel();

        model.setRowCount(0);
        for (WorkRequest request : useraccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request.getField1();
            row[1] = request.getField2();
            row[2] = request.getField3();
            row[3] = request.getField4();

            boolean teacherExists = teach.searchTeacherByName(request.getField1());

            // Set the value in the table based on the result
            if (teacherExists) {
                row[4] = "Recruited";
            } else if (row[3].equals("-")) {
                row[4] = "Waiting for HR";
            } else {
                row[4] = "Waiting for Recruitment";
            }
            model.addRow(row);
        }
    }

//    private void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) tblTeacher.getModel();
//        model.setRowCount(0);
//
//        for (Teacher ts : teach.getTeach()) {
//
//            Object[] row = new Object[3];
//            row[0] = ts;
//            row[1] = ts.getQualifications();
//            row[2] = ts.getSubject();
//
//            model.addRow(row);
//
//        }
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeacher = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTeacher = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 255));
        setLayout(null);

        tblTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Name", "Teacher Qualifications", "Subject", "Salary", "Recruitment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeacher);
        if (tblTeacher.getColumnModel().getColumnCount() > 0) {
            tblTeacher.getColumnModel().getColumn(0).setResizable(false);
            tblTeacher.getColumnModel().getColumn(1).setResizable(false);
            tblTeacher.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 170, 570, 210);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recruitment Panel");
        add(jLabel1);
        jLabel1.setBounds(252, 24, 323, 23);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("Recruit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(560, 400, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gif.gif"))); // NOI18N
        jLabel2.setText("Request HR for Salary");
        add(jLabel2);
        jLabel2.setBounds(80, 340, 520, 500);

        btnTeacher.setBackground(new java.awt.Color(0, 204, 204));
        btnTeacher.setForeground(new java.awt.Color(0, 51, 204));
        btnTeacher.setText("Add Teacher");
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });
        add(btnTeacher);
        btnTeacher.setBounds(80, 130, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(570, 130, 78, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblTeacher.getSelectedRow();

        if (selectedRow >= 0) {
            // Assuming row[4] is the teacher's name
            String teacherName = String.valueOf(tblTeacher.getValueAt(selectedRow, 0));

            // Check if the teacher has been recruited
            boolean teacherExists = teach.searchTeacherByName(teacherName);

            if (teacherExists) {
                JOptionPane.showMessageDialog(null, "Teacher already recruited.", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (!"-".equals(tblTeacher.getValueAt(selectedRow, 3))) {
                    Teacher newTeacher = teach.addNewTeacher();

                    newTeacher.setName(String.valueOf(tblTeacher.getValueAt(selectedRow, 0)));
                    newTeacher.setQualifications(String.valueOf(tblTeacher.getValueAt(selectedRow, 1)));
                    newTeacher.setSubject(String.valueOf(tblTeacher.getValueAt(selectedRow, 2)));
                    newTeacher.setSalary(String.valueOf(tblTeacher.getValueAt(selectedRow, 3)));
                    
                    
                    Expense expense=business.getExpenseDirectory().addNewExpense();
                    expense.setExpenseName(teacherName);
                    expense.setAmount((Integer) tblTeacher.getValueAt(selectedRow, 3));
                    expense.setType("teacher");
                    
                    JOptionPane.showMessageDialog(null, "Teacher Recruited Successfully.Request Admin to create credentials", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please wait for the HR to add the salary.", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!.");
            return;
        }

        populateRequestTable();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        // TODO add your handling code here:
        TeacherFormJPanel tj = new TeacherFormJPanel(mainWorkArea, teach, business, useraccount);
        mainWorkArea.add("TeacherFormJPanel", tj);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);


    }//GEN-LAST:event_btnTeacherActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        populateRequestTable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTeacher;
    // End of variables declaration//GEN-END:variables
}
