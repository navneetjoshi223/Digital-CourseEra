/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HRRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */


public class HumanResourceOrganization extends Organization{

    public HumanResourceOrganization() {
        super(Organization.Type.HumanResourse.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRRole());
        return roles;
    }
     
}
