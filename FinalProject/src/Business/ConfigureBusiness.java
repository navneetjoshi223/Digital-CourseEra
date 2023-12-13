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

        return business;
    }
}
