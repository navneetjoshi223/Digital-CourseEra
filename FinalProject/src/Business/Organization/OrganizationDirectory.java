/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CurricumDev.getValue())){
            organization = new CurriculumDevelopmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AcademicAdmin.getValue())){
            organization = new AcademicAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.HumanResourse.getValue())){
            organization = new HumanResourceOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FacultyStuff.getValue())){
            organization = new StaffOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Infrastructure.getValue())){
            organization = new InfrastructureOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}