/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneyakalason;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oyas
 */
public class MyClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MyException {
        MyClass myClass = null;
        try {
            // TODO code application logic here
            myClass = new MyClass(-1);
        } catch (MyException ex) {
            System.out.println("Hata var!");
            ex.printStackTrace();
            myClass = new MyClass(0);
        }
        
        System.out.println(myClass.getMyVariable());
    }
    
}
