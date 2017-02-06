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
public class GuessingGame {
      public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Guessing Game!");
        Random rgen = new Random();
        Scanner sc = new Scanner(System.in);
        int lottery = rgen.nextInt(50)+1;
        int guess = -1;
        while(guess != lottery){
            System.out.print("Guess the number between 1-50: ");
            guess = sc.nextInt();
            if(guess > lottery){
                System.out.println("Your guess is too high");
            }
            else if(guess < lottery){
                System.out.println("Your guess is too low");
            }
        }
        System.out.println("Congratulations! You win");

    }
    
}
