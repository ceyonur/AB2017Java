/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author oyas
 */
public class String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Merhaba";
        String str2 = "Dünya";
        String str3 = str1.concat(" ").concat(str2);
        String str4 = "Merhaba Dünya";
        //String str3 = str1+" "+str2;
        System.out.println(str3);
        
        if(str4.equals(str3)){
            System.out.println("Eşitler");
        }
        else{
            System.out.println("Eşit değiller");
        }    
    
    
}
    
}
