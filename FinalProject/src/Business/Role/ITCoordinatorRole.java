package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public class ITCoordinatorRole extends Role {

    public ITCoordinatorRole() {
        this.type = RoleType.ITCoordinator; // Fixed the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business, Enterprise enterprise) {
        // Implement the method logic based on IT Coordinator role
        // Example: return new ITCoordinatorWorkAreaJPanel(userProcessContainer, account, organization, business);
        return null; // Replace null with your implementation
    }
}
