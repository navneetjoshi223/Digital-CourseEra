/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FinanceManagerRole;

import Business.Business;
import Business.Organization.AcademicAdminOrganization;
import Business.Organization.FinanceOrganization;
import Business.Organization.InfrastructureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macmuffin
 */
public class HandleFinancesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HandleFinancesJPanel
     */
    JPanel workArea;
    UserAccount userAccount;
    FinanceOrganization financeOrganization;
    Business business;

    public HandleFinancesJPanel(JPanel mainWorkArea, UserAccount userAccount, FinanceOrganization financeOrganization, Business business) {
        initComponents();

        this.workArea = mainWorkArea;
        this.userAccount = userAccount;
        this.financeOrganization = financeOrganization;
        this.business = business;

        System.out.println("Inside HandleFinancesJPanel constructor");
        populateTable();
        txtTotalBudget.setText(String.valueOf(business.getBudget()));
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFinancingRequests.getModel();
        DefaultTableModel model1 = (DefaultTableModel) tblFinancingRequests1.getModel();

        model.setRowCount(0);
        model1.setRowCount(0);

        for (WorkRequest request : financeOrganization.getWorkQueue().getWorkRequestList()) {
            if (request.getField4() != null) {
                Object[] row = new Object[3];
                row[0] = request;
                row[1] = request.getField1();
                row[2] = request.getField4();
//            row[3] = request;
//            row[3] = request.getStatus();

                model.addRow(row);
            } else {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getField1();
                row[2] = request.getField2();
                row[3] = request.getField3();

                row[4] = request.getStatus();
                row[5] = request.getRequestID();

                model1.addRow(row);
            }
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

        lblTitle = new javax.swing.JLabel();
        lblTotalBudget = new javax.swing.JLabel();
        txtTotalBudget = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFinancingRequests = new javax.swing.JTable();
        lblFinancingRequests = new javax.swing.JLabel();
        btnApproveBudget = new javax.swing.JButton();
        txtSalary = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFinancingRequests1 = new javax.swing.JTable();
        lblFinancingRequests1 = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 255));
        lblTitle.setText("Manage Finances");
        add(lblTitle);
        lblTitle.setBounds(330, 34, 159, 21);

        lblTotalBudget.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblTotalBudget.setForeground(new java.awt.Color(102, 51, 255));
        lblTotalBudget.setText("Total Budget:");
        add(lblTotalBudget);
        lblTotalBudget.setBounds(320, 90, 98, 17);

        txtTotalBudget.setEnabled(false);
        add(txtTotalBudget);
        txtTotalBudget.setBounds(80, 80, 210, 30);

        tblFinancingRequests.setBackground(new java.awt.Color(117, 205, 255));
        tblFinancingRequests.setForeground(new java.awt.Color(0, 102, 204));
        tblFinancingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Teacher Name", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFinancingRequests);
        if (tblFinancingRequests.getColumnModel().getColumnCount() > 0) {
            tblFinancingRequests.getColumnModel().getColumn(0).setResizable(false);
            tblFinancingRequests.getColumnModel().getColumn(1).setResizable(false);
            tblFinancingRequests.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 160, 600, 150);

        lblFinancingRequests.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblFinancingRequests.setForeground(new java.awt.Color(102, 51, 255));
        lblFinancingRequests.setText("Incoming Inventory requests:");
        add(lblFinancingRequests);
        lblFinancingRequests.setBounds(90, 380, 227, 20);

        btnApproveBudget.setBackground(new java.awt.Color(102, 51, 255));
        btnApproveBudget.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnApproveBudget.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveBudget.setText("Approve Budget");
        btnApproveBudget.setToolTipText("");
        btnApproveBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveBudgetActionPerformed(evt);
            }
        });
        add(btnApproveBudget);
        btnApproveBudget.setBounds(560, 320, 150, 30);

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        add(txtSalary);
        txtSalary.setBounds(330, 320, 200, 30);

        btnApprove.setBackground(new java.awt.Color(102, 51, 255));
        btnApprove.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove);
        btnApprove.setBounds(590, 550, 100, 30);

        tblFinancingRequests1.setBackground(new java.awt.Color(117, 205, 255));
        tblFinancingRequests1.setForeground(new java.awt.Color(0, 102, 204));
        tblFinancingRequests1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Item", "Price", "Quantity", "Status", "Request ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFinancingRequests1);
        if (tblFinancingRequests1.getColumnModel().getColumnCount() > 0) {
            tblFinancingRequests1.getColumnModel().getColumn(0).setResizable(false);
            tblFinancingRequests1.getColumnModel().getColumn(1).setResizable(false);
            tblFinancingRequests1.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(90, 400, 600, 150);

        lblFinancingRequests1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblFinancingRequests1.setForeground(new java.awt.Color(102, 51, 255));
        lblFinancingRequests1.setText("Incoming Recuitment requests:");
        add(lblFinancingRequests1);
        lblFinancingRequests1.setBounds(80, 140, 227, 17);

        btnRefresh1.setBackground(new java.awt.Color(102, 51, 255));
        btnRefresh1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        add(btnRefresh1);
        btnRefresh1.setBounds(610, 130, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(-50, -10, 1770, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveBudgetActionPerformed
        int selectedRow = tblFinancingRequests.getSelectedRow();

        if (selectedRow >= 0) {
            // Assuming row[4] is the teacher's name
            String amount = txtSalary.getText();

            // Check if the salary has been added
            if ("-".equals(tblFinancingRequests.getValueAt(selectedRow, 2))) {
                FinanceWorkRequest request = (FinanceWorkRequest) tblFinancingRequests.getValueAt(selectedRow, 0);

                // Update the salary or perform necessary actions with the amount
                request.setField4(amount);

                // Set the result to "Approved" as per your logic
//            request.setResult("Approved");
                JOptionPane.showMessageDialog(null, "Salary added and request approved.", "Information", JOptionPane.INFORMATION_MESSAGE);

                business.setBudget(business.getBudget() - Integer.parseInt(amount));
                txtTotalBudget.setText(String.valueOf(business.getBudget()));
            } else {
                JOptionPane.showMessageDialog(null, "Salary already added!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!.");
            return;
        }

        populateTable();
    }//GEN-LAST:event_btnApproveBudgetActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = tblFinancingRequests1.getSelectedRow();

        if (selectedRow >= 0) {

            // Check if the salary has been added
            if (tblFinancingRequests1.getValueAt(selectedRow, 4) != "Approved") {
                FinanceWorkRequest request = (FinanceWorkRequest) tblFinancingRequests1.getValueAt(selectedRow, 0);

                // Update the salary or perform necessary actions with the amount
                request.setStatus("Approved");

                Organization org = null;
                for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof InfrastructureOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    WorkRequest req = org.getWorkQueue().getWorkRequestById((Integer) tblFinancingRequests1.getValueAt(selectedRow, 5));
                    req.setStatus("Finance Approved");
                    req.setField5(Integer.parseInt((String) tblFinancingRequests1.getValueAt(selectedRow, 3)));
//            useraccount.getWorkQueue().getWorkRequestList().add(request);
                }

                // Set the result to "Approved" as per your logic
//            request.setResult("Approved");



                int column2Value = Integer.parseInt((String) tblFinancingRequests1.getValueAt(selectedRow, 2));
                int column3Value = Integer.parseInt((String) tblFinancingRequests1.getValueAt(selectedRow, 3));

                int newBudget = business.getBudget() - (column2Value * column3Value);
                business.setBudget(newBudget);
                txtTotalBudget.setText(String.valueOf(newBudget));
                JOptionPane.showMessageDialog(null, "Approved the inventory request", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Already Approved", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!.");
            return;
        }

        populateTable();

    }//GEN-LAST:event_btnApproveActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefresh1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApproveBudget;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFinancingRequests;
    private javax.swing.JLabel lblFinancingRequests1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalBudget;
    private javax.swing.JTable tblFinancingRequests;
    private javax.swing.JTable tblFinancingRequests1;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTotalBudget;
    // End of variables declaration//GEN-END:variables
}
