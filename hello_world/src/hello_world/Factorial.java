/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class Factorial {
    
      public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       System.out.println("Bir sayı giriniz: ");
       int param = sc.nextInt();
       
       System.out.println(param + "'ın faktoriyeli: " + factorialRecursive(param));
    }
      
      //Iterative factorial
      public static int factorial(int param){
          int result = 1;
          for(int i = param; 1 <= i; i-- ){
              result *= i; // result = result * i;
          }
          return result;
      }      
      
      //Recursive factorial
      public static int factorialRecursive(int param){
          if(param == 1)
              return 1;
          else{
              return param*factorialRecursive(param-1);
          }
      }
}
