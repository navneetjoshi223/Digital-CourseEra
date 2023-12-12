/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class CommunityCollegeEnterprise extends Enterprise{
 public CommunityCollegeEnterprise(String name){
        super(name,Enterprise.EnterpriseType.CommunityCollege);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
       