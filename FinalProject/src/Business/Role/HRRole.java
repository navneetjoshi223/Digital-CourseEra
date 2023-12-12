package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public class HRRole extends Role {

    public HRRole() {
        this.type = RoleType.HRRep; // Fix the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
        // Implement the method logic based on HR role
        // Example: return new HRWorkAreaJPanel(userProcessContainer, account, organization, business);
        return null; // Replace null with your implementation
    }
}