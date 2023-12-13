package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.AcademicAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AcademicAdministration.AcademicAdminmistratorJPanel;

public class AcademicDean extends Role {

    public AcademicDean() {
        this.type = RoleType.AcademicDean; // Fix the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business businesss) {
        this.type = RoleType.AcademicDean;
        return new AcademicAdminmistratorJPanel(userProcessContainer, account, (AcademicAdminOrganization) organization,businesss);
    }
}