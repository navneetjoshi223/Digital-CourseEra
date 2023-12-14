/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Teacher.TeacherDirectory;
import Expense.ExpenseDirectory;
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
    private Integer budget;
    private ExpenseDirectory expenseDirectory;

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

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
        expenseDirectory=new ExpenseDirectory();
    }

    public ExpenseDirectory getExpenseDirectory() {
        return expenseDirectory;
    }

    public void setExpenseDirectory(ExpenseDirectory expenseDirectory) {
        this.expenseDirectory = expenseDirectory;
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
