/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Teacher;

import java.util.ArrayList;

/**
 *
 * @author anshikakhandelwal
 */
public class TeacherDirectory {
  private ArrayList<Teacher>teach;
   public TeacherDirectory(){
        
        this.teach = new  ArrayList<Teacher>();
        
        
        
    }

    public ArrayList<Teacher> getTeach() {
        return teach;
    }

    public void setTeach(ArrayList<Teacher> teach) {
        this.teach = teach;
    }
    
     public Teacher addNewTeacher(){
        Teacher newTeacher = new Teacher();
        teach.add(newTeacher);
        return newTeacher;
    }
  
    

}
