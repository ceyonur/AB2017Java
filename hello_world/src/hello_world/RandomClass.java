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
public class RandomClass {
      public static void main(String[] args) {
        // TODO code application logic here
        Random rgen = new Random();
        String cont = "Y";
        Scanner sc = new Scanner(System.in);
        
        while(cont.equalsIgnoreCase("Y")){
            
        int player1 = rgen.nextInt(6)+1;
        int player2 = rgen.nextInt(6)+1;
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        if(player1 > player2){
            System.out.println("player1 wins with" + player1);
        }
        else if(player1 < player2){
            System.out.println("player2 wins with" + player2);
        }
        else{
            System.out.println("Tie");
        }
        System.out.println("Do you want to continue? (Y)");
        cont = sc.next();
        }

    }
    
}
