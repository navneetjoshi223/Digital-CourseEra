/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.Business;
import Business.Organization.AcademicAdminOrganization;
import Business.Organization.CurriculumDevelopmentOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.Teacher.TeacherDirectory;
import Business.UserAccount.UserAccount;
import UserInterface.HR.HRJPanel;
import UserInterface.Resources.ITInfrastructureJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.AcademicAdministration.AcademicAdminmistratorJPanel;
import ui.AcademicAdministration.CurriculumDevelopmentJPanel;
import ui.FinanceManagerRole.HandleFinancesJPanel;
import ui.TeacherRole.TeacherProfileJPanel;
import ui.TeacherRole.TeacherRequestSoftwareJPanel;

/**
 *
 * @author archil
 */
public class LoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Business business;
    CurriculumDevelopmentOrganization cdorg;
    AcademicAdminOrganization aaorg;
    TeacherDirectory teach;
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen(JPanel mainWorkArea, Business business) {
        initComponents();
        
        this.mainWorkArea = mainWorkArea;
        this.business = business;
        this.cdorg = new CurriculumDevelopmentOrganization();
        this.aaorg = new AcademicAdminOrganization();
        this.teach = new TeacherDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("Username:");

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(153, 204, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword, lblUserName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdField, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = pwdField.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        UserAccount userAccount = null;
        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()){
            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
            if (userAccount != null) {
                String userRole = userAccount.getRole().toString();
                if(userRole.equals(RoleType.Admin.toString())) {
                    System.out.println("admin login");
                    JPanel mainScreen = new MainScreen(mainWorkArea, userAccount, organization, business);
                    mainWorkArea.add("MainScreen", mainScreen);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.SubjectSpecialist.toString())) {
                    System.out.println("subject specialist login");
                    CurriculumDevelopmentJPanel cdjp = new CurriculumDevelopmentJPanel(mainWorkArea, userAccount,  organization,  business);
                    mainWorkArea.add("CurriculumDevelopmentJPanel", cdjp);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.AcademicDean.toString())) {
                    AcademicAdminmistratorJPanel aajp = new AcademicAdminmistratorJPanel(mainWorkArea, userAccount, aaorg  ,  business);
                    mainWorkArea.add("AcademicAdminmistratorJPanel", aajp);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.HRRep.toString())) {
                    HRJPanel hrjp = new HRJPanel(mainWorkArea,teach);
                    mainWorkArea.add("HRJPanel", hrjp);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.ITCoordinator.toString())) {
                    ITInfrastructureJPanel iijp = new ITInfrastructureJPanel(mainWorkArea,userAccount,organization,business);
                    mainWorkArea.add("ITInfrastructureJPanel", iijp);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.Finance.toString())) {
//                    HandleFinancesJPanel hfjp = new HandleFinancesJPanel(mainWorkArea,);
//                    mainWorkArea.add("HandleFinancesJPanel", hfjp);
//                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//                    layout.next(mainWorkArea);
                    
                } else if(userRole.equals(RoleType.Teacher.toString())) {
                    TeacherProfileJPanel tpjp = new TeacherProfileJPanel(mainWorkArea, userAccount, organization , business);
                    mainWorkArea.add("TeacherProfileJPanel", tpjp);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);
                } 
                
                
                flag = true;
                break;
            }
        }

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            return;
        }

//        btnLogin.setEnabled(false);
//        logoutJButton.setEnabled(true);
//        userNameJTextField.setEnabled(false);
//        passwordField.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    
}
