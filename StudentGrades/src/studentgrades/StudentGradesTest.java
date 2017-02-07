/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author oyas
 */
public class StudentGradesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> list = new ArrayList<>();
        
        System.out.println(list);
        
        Student student1 = new EngineeringStudent("ali", 1, 50);
        Student student2 = new VisualArtStudent("veli", 2, 30);
        Student student3 = new EngineeringStudent("ayşe", 3, 90);
        Student student4 = new VisualArtStudent("merve", 4, 70);
        
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
         
        System.out.println("Unsorted: " + list);
        
        Collections.sort(list);        
        Collections.reverse(list);
        
        System.out.println("Sorted: " + list);
        
        
    }
    
}
