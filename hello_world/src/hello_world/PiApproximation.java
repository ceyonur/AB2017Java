/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class PiApproximation {
      public static void main(String[] args) {
        // TODO code application logic here
       Random rgen = new Random();
       Scanner sc = new Scanner(System.in);
       
       final int DART_NUMBER = 10000;
       
       double x = 0;
       double y = 0;
       
       int inside = 0;
       
       for(int i = 1; i <= DART_NUMBER;i++){
           x = rgen.nextDouble()*2-1;
           y = rgen.nextDouble()*2-1;
           if(isInside(x,y)){
               inside++;
           }           
       }
       double pi = 4*inside/DART_NUMBER;
       System.out.println(pi);

    }
      
      public static boolean isInside(double param1, double param2){
          return getSquare(param1) + getSquare(param2) < 1;
      }
      
      public static double getSquare(double x){
          return x * x;
      }
    
}
