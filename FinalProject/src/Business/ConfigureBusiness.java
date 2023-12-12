/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.CommunityCollegeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PrivateCollegeEnterprise;
import Business.Enterprise.SchoolEnterprise;
import Business.Enterprise.StateCollegeEnterprise;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ashwinnair
 */
public class ConfigureBusiness {
      public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
//        
        Employee employee = new Employee();
        employee.setName("Master Admin");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        
        
        
        
        
         // Create and add CommunityCollege enterprise
        Enterprise communityCollege = new CommunityCollegeEnterprise("Community College");
        
        business.getEnterpriseDirectory().addEnterprise(communityCollege);
        
          // Create and add PrivateCollege enterprise
        Enterprise privateCollege = new PrivateCollegeEnterprise("Private College");
        business.getEnterpriseDirectory().addEnterprise(privateCollege);

        // Create and add School enterprise
        Enterprise school = new SchoolEnterprise("School");
        business.getEnterpriseDirectory().addEnterprise(school);

        // Create and add StateCollege enterprise
        Enterprise stateCollege = new StateCollegeEnterprise("State College");
        business.getEnterpriseDirectory().addEnterprise(stateCollege);
        
        return business;
    }
}
