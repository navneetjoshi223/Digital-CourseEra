/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SubjectSpecialist;
import java.util.ArrayList;

/**
 *
 * @author anshikakhandelwal
 */


public class CurriculumDevelopmentOrganization extends Organization{

    public CurriculumDevelopmentOrganization() {
        super(Organization.Type.CurriculumDev.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SubjectSpecialist());
        return roles;
    }
     
}
