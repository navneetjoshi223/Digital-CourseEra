/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TeacherRole;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */


public class StaffOrganization extends Organization{

    public StaffOrganization() {
        super(Organization.Type.FacultyStuff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TeacherRole());
        return roles;
    }
     
}
