/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Random;

/**
 *
 * @author oyas
 */
public class StringCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Bu çok gizli, şifrelenecek!";
        Random rgen = new Random();
        int password = rgen.nextInt(50);
                
        String encrypted = encrypt(str,password);
        System.out.println(encrypted);
        
        String decrypted = decrypt(encrypted,password);
        System.out.println(decrypted);
        
    }
    
    public static String encrypt(String str, int p){
        String result = "";
        for(int i = 0; i < str.length();i++){
            result += (char) (str.charAt(i) + p);
        }
        return result;
    }
    
       public static String decrypt(String str, int p){
        String result = "";
        for(int i = 0; i < str.length();i++){
            result += (char) (str.charAt(i) - p);
        }
        return result;
    }
    
}
