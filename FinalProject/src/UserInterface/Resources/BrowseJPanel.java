/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Resources;

import Business.Business;
import Business.Organization.FinanceOrganization;
import Business.Organization.InfrastructureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceWorkRequest;
import Business.WorkQueue.InfrastructureWorkRequest;
import Business.WorkQueue.WorkRequest;
import Resources.Resource;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashwinnair
 */
public class BrowseJPanel extends javax.swing.JPanel {

    JPanel workArea;
    UserAccount userAccount;
    InfrastructureOrganization infrastructureOrganization;
    Business business;

    public BrowseJPanel(JPanel mainWorkArea, UserAccount userAccount, InfrastructureOrganization infrastructureOrganization, Business business) {
        initComponents();
        this.workArea = mainWorkArea;
        this.userAccount = userAccount;
        this.infrastructureOrganization = infrastructureOrganization;
        this.business = business;

        System.out.println("Inside HandleFinancesJPanel constructor");
        populateResourceTable();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();

        model.setRowCount(0);

        for (WorkRequest request : infrastructureOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getField1();
            row[2] = request.getField2();
            row[3] = request.getStatus();
            row[4] = request.getId();
//            row[3] = request;
//            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    public void populateResourceTable() {
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();

        model.setRowCount(0);

        for (Resource resource : business.getResourceDirectory().getResources()) {
            Object[] row = new Object[3];
            row[0] = resource;
            row[1] = resource.getPrice();
            row[2] = resource.getQuantity();

//            row[3] = request;
//            row[3] = request.getStatus();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Item", "Quantity", "Status", "Request ID"
            }
        ));
        jScrollPane1.setViewportView(tblWorkRequest);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resources");

        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Price", "Availability"
            }
        ));
        jScrollPane2.setViewportView(tblProductCatalog);

        jLabel2.setText("Browse Catalog");

        jLabel3.setText("Browse Requests");

        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Shop/Request Funds");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SHOP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow >= 0) {

            // Assuming tblWorkRequest.getValueAt(selectedRow, 0) returns InfrastructureWorkRequest
            InfrastructureWorkRequest request = (InfrastructureWorkRequest) tblWorkRequest.getValueAt(selectedRow, 0);

            // Assuming tblWorkRequest.getValueAt(selectedRow, 1) returns the name of the resource
            Resource res = business.getResourceDirectory().getResourceByName((String) tblWorkRequest.getValueAt(selectedRow, 1));

            // Assuming tblWorkRequest.getValueAt(selectedRow, 2) returns the quantity as Integer
            String quantityString = (String) tblWorkRequest.getValueAt(selectedRow, 2);

// Assuming the quantityString is a valid integer string, you can convert it to an int
            int requestedQuantity = Integer.parseInt(quantityString);

            if (res != null) {
                if (res.getQuantity() < requestedQuantity) {
                    JOptionPane.showMessageDialog(null, "Don't have enough quantity. Request Finance team");
                } else {
                    request.setStatus("Approved");
                    res.setQuantity(res.getQuantity() - requestedQuantity);
                    JOptionPane.showMessageDialog(null, "Item request approved.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    populateResourceTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item does not exist in catalog!");
                return;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!");
            return;
        }

        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow >= 0) {
            // Assuming tblWorkRequest.getValueAt(selectedRow, 1) returns the name of the resource
            String resourceName = (String) tblWorkRequest.getValueAt(selectedRow, 1);
            
            WorkRequest workRequest=infrastructureOrganization.getWorkQueue().getWorkRequestById((Integer) tblWorkRequest.getValueAt(selectedRow, 4));
            workRequest.setStatus("Pending Finance Approval");
            // Assuming tblWorkRequest.getValueAt(selectedRow, 2) returns the requested quantity as Integer
            String quantityString = (String) tblWorkRequest.getValueAt(selectedRow, 2);

// Assuming the quantityString is a valid integer string, you can convert it to an int
            int requestedQuantity = Integer.parseInt(quantityString);

            Resource res = business.getResourceDirectory().getResourceByName(resourceName);

            if (res != null) {
                FinanceWorkRequest request = new FinanceWorkRequest();

                // Assuming res.getItem(), res.getPrice(), and res.getQuantity() are the correct methods
                request.setField1(res.getItem());
                request.setField2(String.valueOf(res.getPrice()));
                request.setField3(String.valueOf(requestedQuantity - res.getQuantity()));
                request.setRequestID((Integer) tblWorkRequest.getValueAt(selectedRow, 4));

                request.setSender(userAccount);
                request.setStatus("Sent");  // Assuming you want to set the status to "Sent" initially

                Organization org = null;
                for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FinanceOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    tblWorkRequest.setValueAt("Pending Finance approval", selectedRow, 1);
                    JOptionPane.showMessageDialog(null, "Requested Finance for Approval");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item does not exist in Catalogue");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        boolean itemToPurchase = false;

        for (WorkRequest request : infrastructureOrganization.getWorkQueue().getWorkRequestList()) {
            if ("Finance Approved".equals(request.getStatus())) {
                Resource res = business.getResourceDirectory().getResourceByName(request.getField1());
                res.setQuantity(res.getQuantity() + request.getField5());
                request.setStatus("Waiting Approval");
                itemToPurchase = true;
            }
        }

        if (itemToPurchase) {
            JOptionPane.showMessageDialog(null, "Item purchased successfully");
        } else {
            JOptionPane.showMessageDialog(null, "No Item to purchase");
        }

        populateResourceTable();

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
