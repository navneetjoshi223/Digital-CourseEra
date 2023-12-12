/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Administrator
 */
public class Business {

    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseDirectory enterpriseDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
        enterpriseDirectory=new EnterpriseDirectory();
        
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
}
