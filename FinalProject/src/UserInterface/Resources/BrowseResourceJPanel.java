/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package UserInterface.Resources;

import Business.Business;
import Business.Organization.InfrastructureOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InfrastructureWorkRequest;
import Business.WorkQueue.WorkRequest;
import Resources.Resource;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rushabh
 */
public class BrowseResourceJPanel extends javax.swing.JPanel {

    JPanel workArea;
    UserAccount userAccount;
    InfrastructureOrganization infrastructureOrganization;
    Business business;

    /**
     * Creates new form BrowseProducts
     */
    public BrowseResourceJPanel(JPanel mainWorkArea, UserAccount userAccount, InfrastructureOrganization infrastructureOrganization, Business business) {
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
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getField1();
            row[2] = request.getField2();
            row[3] = request.getStatus();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblProductCatalogue1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnApprove1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Have a wonderful shopping experience!");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductCatalogue.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblProductCatalogue.setText("Infrastructure Requests");

        tblWorkRequest.setBackground(new java.awt.Color(0, 153, 153));
        tblWorkRequest.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Item", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);
        if (tblWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(2).setResizable(false);
        }

        tblProductCatalog.setBackground(new java.awt.Color(0, 153, 153));
        tblProductCatalog.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductCatalog);
        if (tblProductCatalog.getColumnModel().getColumnCount() > 0) {
            tblProductCatalog.getColumnModel().getColumn(0).setResizable(false);
            tblProductCatalog.getColumnModel().getColumn(1).setResizable(false);
            tblProductCatalog.getColumnModel().getColumn(2).setResizable(false);
        }

        lblProductCatalogue1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblProductCatalogue1.setText("Resource Catalog");

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnApprove1.setText("Request funds");

        jButton1.setText("SHOP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove1)
                .addGap(27, 27, 27)
                .addComponent(btnApprove)
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductCatalogue)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProductCatalogue1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(9, 9, 9)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblProductCatalogue1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblProductCatalogue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApprove)
                            .addComponent(btnApprove1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow >= 0) {

            InfrastructureWorkRequest request = (InfrastructureWorkRequest) tblWorkRequest.getValueAt(selectedRow, 0);

            request.setStatus("Approved");

            JOptionPane.showMessageDialog(null, "Item request approved.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request row!.");
            return;
        }

        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApprove1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblProductCatalogue1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables

}
