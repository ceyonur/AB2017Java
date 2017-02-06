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
public class AgeFinder {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //İsim alacak
         //System.out.println("İsminizi giriniz: ");
         //String isim = sc.next();
         /* comment1
         comment2         
         /*
         //Soyisim alacak
         System.out.println("Soyisminizi giriniz: ");
         String soyisim = sc.next();         
         //Doğum yılı alacak
         System.out.println("Doğumyılınızı giriniz: ");
         int dogumYılı = sc.nextInt();         
         //--boy 
         System.out.println("Boyunuzu giriniz: ");
         double boy = sc.nextDouble();         
         //--kilo
         System.out.println("Kilonuzu giriniz: ");
         int kilo = sc.nextInt();         
         //Yaş hesaplama
         int yas = 2017 - dogumYılı;         
         //İsim dönecek
         System.out.println("İsminiz: " + isim);         
         //Soyisim dönecek
         System.out.println("Soyisminiz: " + soyisim);         
         //Yaş dönecek
         System.out.println("Yaşınız: " + yas);
         */
         //--beden-kütle-endeksi
         System.out.println("Boyunuzu giriniz: ");
         double boy = sc.nextDouble();         
         //--kilo
         System.out.println("Kilonuzu giriniz: ");
         int kilo = sc.nextInt();      
         
         
         bmiCalculatorPrinter(boy,kilo);         
         
     }
     
     public static void bmiCalculatorPrinter(double boy, double kilo){
         double result = (kilo/(boy*boy));
         System.out.println("Beden kütle endeksi: " + result);         
     }  
    
}
