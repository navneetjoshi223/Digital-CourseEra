/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import Business.Business;
import Business.Enterprise.CommunityCollegeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.PrivateCollegeEnterprise;
import Business.Enterprise.SchoolEnterprise;
import Business.Enterprise.StateCollegeEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ashwinnair
 */
public class EnterpriseSelectJPanel extends javax.swing.JPanel {

   private JPanel workArea;
    private UserAccount userAccount;
    private Organization organization;
    private Business business;
    private Enterprise enterprise;
    

    public EnterpriseSelectJPanel(JPanel workArea, UserAccount userAccount, Organization organization, Business business) {
initComponents();

        this.workArea = workArea;
        this.userAccount = userAccount;
        this.organization = organization;
        this.business = business;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));
        setLayout(null);

        jComboBox.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(204, 204, 255));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private College", "State College", "Community College", "School" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        add(jComboBox);
        jComboBox.setBounds(344, 186, 199, 29);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(380, 245, 107, 45);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Devanagari MT", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select the type of Enterprise to create");
        add(jLabel1);
        jLabel1.setBounds(0, 90, 844, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ent.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(20, 30, 850, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String selectedValue = (String) jComboBox.getSelectedItem();

    // Convert the selected string to EnterpriseType
    EnterpriseType selectedType = EnterpriseType.valueOf(selectedValue.replace(" ", ""));

        // Check if a type is selected
       if (selectedType != null) {
        // Instantiate a concrete Enterprise class based on the selected type
        switch (selectedType) {
            case PrivateCollege:
                enterprise = new PrivateCollegeEnterprise("Private College");
                break;
            case StateCollege:
                enterprise = new StateCollegeEnterprise("State College");
                break;
            case CommunityCollege:
                enterprise = new CommunityCollegeEnterprise("Community College");
                break;
            case School:
                enterprise = new SchoolEnterprise("School");
                break;
            default:
                // Handle the default case if needed
                break;
        }

        // Now you have a concrete Enterprise object based on the selected type
        // Do something with the 'enterprise' object
        System.out.println("Created enterprise: " + enterprise.getName());
    }
        
//        lblWelcome.setText("Welcome " + ((userAccount.getEmplxwxoyee() != null) ? userAccount.getEmployee().getName() : userAccount.getUsername()) + "!");
        
        
        //workArea.add("Admin", userAccount.getRole().createWorkArea(workArea, userAccount, organization, business, enterprise));
        AdminWorkAreaJPanel adminPanel = new AdminWorkAreaJPanel(workArea, business, enterprise);
        workArea.add("AdminWorkAreaJPanel", adminPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}