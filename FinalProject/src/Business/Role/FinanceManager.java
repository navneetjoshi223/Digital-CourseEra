package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FinanceManagerRole.HandleFinancesJPanel;

public class FinanceManager extends Role {

    public FinanceManager() {
        this.type = RoleType.Finance; // Fix the RoleType
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
      this.type = RoleType.AcademicDean;
        return new HandleFinancesJPanel(userProcessContainer, account, (FinanceOrganization) organization, business);
    }
}