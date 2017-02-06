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
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Random rgen = new Random();
        char ch = (char) (rgen.nextInt('Z' - 'A' + 1) + 'A');
        //System.out.println(ch);

        int result = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            char ch2 = (char) (rgen.nextInt(125 - 33 + 1) + 33);
            //if (ch2 == 'A') {
            if(Character.isDigit(ch2)){
                sum += Character.getNumericValue(ch2);
                System.out.println(ch2);
                result++;
            }
        }
        System.out.println("Sum of integer chars: " + sum);
        System.out.println("count: " +result);*/
        
    String str = "Merhaba 356 dünya5";       
        
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            try{
            if(Character.isDigit(ch)){
                int k = i+1;
                char ch2 = str.charAt(k);
                String result = "";
                result += ch;
                
                while(Character.isDigit(ch2)){
                    result += ch2;
                    k++;
                    ch2 = str.charAt(k);
                }
                
                System.out.println(result);
                
                i = k;
            }
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("Sonuna sayı koymayıver.");
                //e.printStackTrace();
            }
            }
        
        /*
        System.out.println(str);
        String str2 = str.toLowerCase();
        System.out.println(str2);
        System.out.println(str);*/
        
        /*int[] erey = new int[5];
        System.out.println(erey[4]);
        erey[4] = 2;
        System.out.println(erey[4]);*/
        

    }
        

}
