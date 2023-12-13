package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.TeacherRole.TeacherProfileJPanel;

public class TeacherRole extends Role {
    
    public TeacherRole() {
        this.type = RoleType.Teacher;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Teacher;
        return new TeacherProfileJPanel(userProcessContainer, account, (StaffOrganization) organization, business);
    }
}
