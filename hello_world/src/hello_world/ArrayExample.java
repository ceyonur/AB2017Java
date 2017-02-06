/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

/**
 *
 * @author oyas
 */
public class ArrayExample {
      public static void main(String[] args) {
        // TODO code application logic here
        // int[] erey = new int[10];
       int[] erey = {1,2,3,4,5,6,7,8,9};
       int result = 0;
       for(int i = 0; i < erey.length;i++){
           result += erey[i];
       }
       printArray(erey);
       reverseArray(erey);
       printArray(erey);       
    }
      
      
      public static void reverseArray(int[] a){
          int temp = 0;
          for(int i = 0; i < a.length/2;i++){
              temp = a[i];
              a[i] = a[a.length-i-1]; 
              a[a.length-i-1] = temp;
          }
      }
      
      public static void printArray(int[] a){
          for(int i = 0; i < a.length; i++){
              System.out.print(a[i] + " ");
          }
           System.out.println();
      }
    
}
