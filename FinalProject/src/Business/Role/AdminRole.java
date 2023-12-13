package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdministrativeRole.AdminWorkAreaJPanel;
import ui.AdministrativeRole.EnterpriseSelectJPanel;

public class AdminRole extends Role {
 
    public AdminRole(){
        this.type = RoleType.Admin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
      this.type = RoleType.Admin;
        return new EnterpriseSelectJPanel(userProcessContainer, account, (AdminOrganization) organization,business);
    }

}
