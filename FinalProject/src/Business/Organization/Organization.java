/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.Employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1; 

    
    public enum Type{
         Admin("Admin") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        },
        CurriculumDev("Curriculum Development") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, AcademicAdmin("Academic Administration"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, HumanResource("Human Resource"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }
        , FacultyStuff("Faculty Stuff"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        }, Infrastructure("Resource and Infrastructure"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        },Finance("Finance"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        };
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
//    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

