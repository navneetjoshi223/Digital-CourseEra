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
import Business.Organization.AcademicAdminOrganization;
import Business.Organization.AdminOrganization;
import Business.Organization.CurriculumDevelopmentOrganization;
import Business.Organization.FinanceOrganization;
import Business.Organization.HumanResourceOrganization;
import Business.Organization.InfrastructureOrganization;
import Business.Organization.StaffOrganization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Resources.Resource;

/**
 *
 * @author ashwinnair
 */
public class ConfigureBusiness {

    public static Business configure() {

        Business business = Business.getInstance();

        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);

        AcademicAdminOrganization academicAdminOrganization = new AcademicAdminOrganization();
        CurriculumDevelopmentOrganization curriculumDevelopmentOrganization = new CurriculumDevelopmentOrganization();
        FinanceOrganization financeOrganization = new FinanceOrganization();
        HumanResourceOrganization humanResourceOrganization = new HumanResourceOrganization();
        InfrastructureOrganization infrastructureOrganization = new InfrastructureOrganization();
        StaffOrganization staffOrganization = new StaffOrganization();

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

        // Add the organizations to the Business instance
        business.getOrganizationDirectory().getOrganizationList().add(academicAdminOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(curriculumDevelopmentOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(financeOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(humanResourceOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(infrastructureOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(staffOrganization);

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
        
        
        
Resource resource1 = business.getResourceDirectory().addNewResource();
resource1.setItem("Projector");
resource1.setPrice(1000);
resource1.setQuantity(30);

Resource resource2 = business.getResourceDirectory().addNewResource();
resource2.setItem("Whiteboard");
resource2.setPrice(200);
resource2.setQuantity(50);

Resource resource3 = business.getResourceDirectory().addNewResource();
resource3.setItem("Laptop");
resource3.setPrice(1200);
resource3.setQuantity(25);

Resource resource4 = business.getResourceDirectory().addNewResource();
resource4.setItem("Chairs");
resource4.setPrice(50);
resource4.setQuantity(100);

Resource resource5 = business.getResourceDirectory().addNewResource();
resource5.setItem("Tables");
resource5.setPrice(100);
resource5.setQuantity(50);

Resource resource6 = business.getResourceDirectory().addNewResource();
resource6.setItem("Marker Board");
resource6.setPrice(150);
resource6.setQuantity(40);

Resource resource7 = business.getResourceDirectory().addNewResource();
resource7.setItem("Desktop Computer");
resource7.setPrice(1500);
resource7.setQuantity(20);

Resource resource8 = business.getResourceDirectory().addNewResource();
resource8.setItem("Printer");
resource8.setPrice(300);
resource8.setQuantity(10);

Resource resource9 = business.getResourceDirectory().addNewResource();
resource9.setItem("Speakers");
resource9.setPrice(200);
resource9.setQuantity(15);

Resource resource10 = business.getResourceDirectory().addNewResource();
resource10.setItem("Microphone");
resource10.setPrice(150);
resource10.setQuantity(20);
   
        return business;
    }
}
