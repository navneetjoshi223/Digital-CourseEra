/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FinanceManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */



public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceManager());
        return roles;
    }
     
}
