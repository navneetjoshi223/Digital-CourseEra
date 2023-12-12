/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ITCoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */



public class InfrastructureOrganization extends Organization{

    public InfrastructureOrganization() {
        super(Organization.Type.Infrastructure.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ITCoordinatorRole());
        return roles;
    }
     
}
