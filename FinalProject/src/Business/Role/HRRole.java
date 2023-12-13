package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.HumanResourceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HR.HRJPanel;
import javax.swing.JPanel;

public class HRRole extends Role {

    public HRRole() {
        this.type = RoleType.HRRep; // Fix the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
         this.type = RoleType.HRRep;
        return new HRJPanel(userProcessContainer, account, (HumanResourceOrganization) organization, business);
    }
}