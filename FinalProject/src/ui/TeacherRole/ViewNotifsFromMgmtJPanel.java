/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.TeacherRole;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author macmuffin
 */
public class ViewNotifsFromMgmtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewNotifsFromMgmtJPanel
     */
    private JPanel workArea;
    
    public ViewNotifsFromMgmtJPanel(JPanel workArea) {
        initComponents();
        this.workArea = workArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSoftwaresList = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSendSoftwareRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 0));
        setLayout(null);

        tblSoftwaresList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Notification from", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSoftwaresList);
        if (tblSoftwaresList.getColumnModel().getColumnCount() > 0) {
            tblSoftwaresList.getColumnModel().getColumn(0).setResizable(false);
            tblSoftwaresList.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 200, 543, 241);

        lblTitle.setBackground(new java.awt.Color(255, 51, 51));
        lblTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 51));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notify.jpg"))); // NOI18N
        lblTitle.setText("View Notifications");
        add(lblTitle);
        lblTitle.setBounds(-110, 50, 1120, 790);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 153, 153));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 10, 80, 23);

        btnSendSoftwareRequest.setBackground(new java.awt.Color(204, 255, 153));
        btnSendSoftwareRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSendSoftwareRequest.setForeground(new java.awt.Color(102, 102, 102));
        btnSendSoftwareRequest.setText("Take Action");
        btnSendSoftwareRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendSoftwareRequestActionPerformed(evt);
            }
        });
        add(btnSendSoftwareRequest);
        btnSendSoftwareRequest.setBounds(518, 424, 111, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendSoftwareRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendSoftwareRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendSoftwareRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendSoftwareRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSoftwaresList;
    // End of variables declaration//GEN-END:variables
}