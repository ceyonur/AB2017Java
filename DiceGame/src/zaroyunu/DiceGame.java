/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaroyunu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        String cont = "Y";
        Scanner sc = new Scanner(System.in);
        
        Zar bizimZar = new SekizYuzluZar();
        
        while(cont.equalsIgnoreCase("Y")){
        //Player 1
        if(bizimZar instanceof AltiYuzluZar){
        ((AltiYuzluZar)bizimZar).hile();
        }
        else{
            bizimZar.atma();
        }
        int player1 = bizimZar.getOnYuz();
        
        //Player 2
        bizimZar.atma();
        int player2 = bizimZar.getOnYuz();
        
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
        String a = "asdasd";
    }
    
}
    
}
