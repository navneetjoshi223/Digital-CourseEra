
package Business.Organization;

import Business.Role.AcademicDean;
import Business.Role.FinanceManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */



public class AcademicAdminOrganization extends Organization{

    public AcademicAdminOrganization() {
        super(Organization.Type.AcademicAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AcademicDean());
        return roles;
    }
     
}
