
package hello_world;

import java.util.Scanner;

public class whiledongu {
     public static void main(String[] args) {
         
         int sayı, toplam=0;
         int i=1, j=1;
         Scanner k= new Scanner(System.in);
   
    /*  while (i<6) {
           System.out.println(i+".sayı girdiniz; ");
           int s= k.nextInt();
           toplam+=s;
           i++;             
         }
      
         System.out.println("toplam= "+ toplam);
         
        */ 
    
   /* do{
        System.out.println(i+".sayı girdiniz; ");
        int s= k.nextInt();
        i++;
    }  while(i<6);   */
   
   
       for(i=1; i<=10; i++){  
           System.out.println(i + "i döngüsü");   
          for( j=1; j<=i; j++){      
             
              System.out.println(j+ "j döngüsü");
            
           }
           
       }
   
    
    
         
     }
}
