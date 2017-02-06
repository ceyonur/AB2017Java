/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class HelloWorld {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = new int[10];
        Random rgen = new Random();
        for(int i = 0; i < n.length;i++){
            n[i] = rgen.nextInt(101);
        }
        
        int min = n[0];
        int max = n[0];
        for(int i = 0; i < n.length; i++){
            if(n[i] < min){
                min = n[i];
            }
            if(n[i] > max){
                max = n[i];
            }
        }
        
        System.out.println(min + " "+max);

       
    }
    
    public static int[] factorial(int[] n){        
        n[1] = 5;
        return n;
    
}
 
}
