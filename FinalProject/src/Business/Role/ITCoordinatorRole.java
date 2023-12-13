package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.InfrastructureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Resources.ITInfrastructureJPanel;
import javax.swing.JPanel;

public class ITCoordinatorRole extends Role {

    public ITCoordinatorRole() {
        this.type = RoleType.ITCoordinator; // Fixed the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.ITCoordinator;
        return new ITInfrastructureJPanel(userProcessContainer, account, (InfrastructureOrganization) organization, business);
    }
}
