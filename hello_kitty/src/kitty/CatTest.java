/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author oyas
 */
public class CatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  AgeUnderZeroException {
        // TODO code application logic here
        try{
            Cat kedi1 = new Cat("tekir","beyaz",-2);
            Cat kedi2 = new Cat("boncuk","siyah",5);
            
        }catch(AgeUnderZeroException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        
        
        /*list.add(kedi2);
        list.add(kedi1);
        Collections.sort(list);
        System.out.println(list);

        /*System.out.println("kedi1: " + kedi1.getName());
        Cat kedi2 = new Cat("boncuk","siyah",5);
        System.out.println("kedi2: "+ kedi2.getName());
        kedi1.setName("duman");
        System.out.println("kedi1: "+kedi1.name);
        System.out.println("kedi1: "+ kedi1.getAge());
        kedi1.sayMeow();
        kedi2.sayMeow();
        System.out.println(kedi1.toString());
        System.out.println(kedi2.toString());
        System.out.println(Cat.NUMBER_OF_FEET);*/

    }
    
}
