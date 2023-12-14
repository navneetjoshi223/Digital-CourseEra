/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;




public class ManageOrganizationJPanel extends javax.swing.JPanel {

   
    /**
     * Creates new form ManageOrganizationJPanel
     */
      private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        cmbOrganizations.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                cmbOrganizations.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        cmbOrganizations = new javax.swing.JComboBox();
        lblSelectOrgType = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblOrganizationList = new javax.swing.JLabel();
        lblOrganizationAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        tblOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizations);
        if (tblOrganizations.getColumnModel().getColumnCount() > 0) {
            tblOrganizations.getColumnModel().getColumn(0).setResizable(false);
            tblOrganizations.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(172, 123, 480, 92);

        btnAdd.setBackground(new java.awt.Color(102, 255, 204));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(370, 300, 87, 30);

        cmbOrganizations.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbOrganizations);
        cmbOrganizations.setBounds(371, 258, 167, 23);

        lblSelectOrgType.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblSelectOrgType.setText("Select Organization Type:");
        add(lblSelectOrgType);
        lblSelectOrgType.setBounds(172, 260, 173, 18);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(42, 38, 80, 23);

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblTitle.setText("Manage Organizations");
        add(lblTitle);
        lblTitle.setBounds(300, 30, 202, 22);

        lblOrganizationList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrganizationList.setText("Organization List:");
        add(lblOrganizationList);
        lblOrganizationList.setBounds(170, 82, 200, 40);

        lblOrganizationAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrganizationAdd.setText("Add Organization:");
        add(lblOrganizationAdd);
        lblOrganizationAdd.setBounds(172, 233, 127, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/org2.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(560, 210, 720, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Type type = (Type) cmbOrganizations.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrganizations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrganizationAdd;
    private javax.swing.JLabel lblOrganizationList;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrganizations;
    // End of variables declaration//GEN-END:variables
}
