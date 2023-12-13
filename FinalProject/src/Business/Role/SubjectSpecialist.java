/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.CurriculumDevelopmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AcademicAdministration.CurriculumDevelopmentJPanel;

/**
 *
 * @author navneetjoshi
 */
public class SubjectSpecialist extends Role {
    
    public SubjectSpecialist() {
        this.type = RoleType.SubjectSpecialist; // Fix the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.SubjectSpecialist;
        return new CurriculumDevelopmentJPanel(userProcessContainer, account, (CurriculumDevelopmentOrganization) organization,business);
    }
    
}

