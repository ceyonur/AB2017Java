/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneyakalason;

/**
 *
 * @author oyas
 */
public class DeneYakalaSon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] erey = new int[5];
        //System.out.println(5/0);
        try{
        System.out.println(5/0);
        System.out.println(erey[5]);
        System.out.println("Try Devam mı?");
        }
        catch(ArrayIndexOutOfBoundsException e){            
            System.out.println("Hata var gardaş.");
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("Yuh 0'a da bölünmez ki.");
            e.printStackTrace();
        }
         System.out.println("Koda Devam mı?");
      
    }
    
    
}
