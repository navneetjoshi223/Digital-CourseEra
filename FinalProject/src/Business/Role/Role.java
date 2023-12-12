/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author ashwinnair
 */
public abstract class Role {

   
    
    public enum RoleType{
        Admin("Admin"),
        SubjectSpecialist("Subject Specialist"),
        AcademicDean("Academic Dean"),
        HRRep("HR Representatinve"),
        ITCoordinator("ITCoordinator"),
        Finance("Finance"),
        Teacher("Teacher");

        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business,Enterprise enterprise);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
    
}
