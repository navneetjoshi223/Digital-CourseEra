/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FinanceManagerRole;

import Business.Business;
import Business.Organization.AcademicAdminOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author macmuffin
 */
public class HandleFinancesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HandleFinancesJPanel
     */
    JPanel workArea;
    
    public HandleFinancesJPanel(JPanel workArea) {
        initComponents();
        this.workArea = workArea;
    }

    public HandleFinancesJPanel(JPanel mainWorkArea, JPanel mainWorkArea0, UserAccount userAccount, AcademicAdminOrganization aaorg, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        btnApproveBudget1 = new javax.swing.JButton();
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
        lblTotalBudget.setBounds(211, 117, 98, 17);

        txtTotalBudget.setEnabled(false);
        add(txtTotalBudget);
        txtTotalBudget.setBounds(327, 114, 200, 23);

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
                "Request", "Amount demanded", "Reason"
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
        jScrollPane1.setBounds(107, 219, 597, 259);

        lblFinancingRequests.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblFinancingRequests.setForeground(new java.awt.Color(102, 51, 255));
        lblFinancingRequests.setText("Incoming Financing requests:");
        add(lblFinancingRequests);
        lblFinancingRequests.setBounds(107, 184, 215, 17);

        btnApproveBudget.setBackground(new java.awt.Color(102, 51, 255));
        btnApproveBudget.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnApproveBudget.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveBudget.setText("Deny Budget");
        btnApproveBudget.setToolTipText("");
        add(btnApproveBudget);
        btnApproveBudget.setBounds(581, 505, 123, 40);

        btnApproveBudget1.setBackground(new java.awt.Color(102, 51, 255));
        btnApproveBudget1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnApproveBudget1.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveBudget1.setText("Approve Budget");
        btnApproveBudget1.setToolTipText("");
        add(btnApproveBudget1);
        btnApproveBudget1.setBounds(406, 505, 146, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fin.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-390, 0, 1850, 600);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveBudget;
    private javax.swing.JButton btnApproveBudget1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFinancingRequests;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalBudget;
    private javax.swing.JTable tblFinancingRequests;
    private javax.swing.JTextField txtTotalBudget;
    // End of variables declaration//GEN-END:variables
}