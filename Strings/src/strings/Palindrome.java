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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "ey edip adanada pide ye";
        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
    }
    
    public static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            result += ch;
        }
        return result;
    }
    
    public static boolean isPalindrome(String str){
        return reverseString(str).equalsIgnoreCase(str);
    }
    
}
