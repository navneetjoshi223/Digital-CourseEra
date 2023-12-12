package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdministrativeRole.AdminWorkAreaJPanel;

public class AdminRole extends Role {
 
    public AdminRole(){
        this.type = RoleType.Admin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
     return null;
    }

}
