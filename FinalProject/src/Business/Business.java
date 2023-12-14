/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Teacher.TeacherDirectory;
import Resources.ResourceDirectory;

/**
 *
 * @author Administrator
 */
public class Business {

    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private TeacherDirectory teacherDirectory;
    private ResourceDirectory resourceDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new OrganizationDirectory();
        enterpriseDirectory=new EnterpriseDirectory();
        teacherDirectory=new TeacherDirectory();
        resourceDirectory=new ResourceDirectory();
    }

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }
    
    
    
    
}
