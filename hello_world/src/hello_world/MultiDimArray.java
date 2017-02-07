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
public class MultiDimArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[][] multiDimArray = new int[5][6];
        //int[] insideArray = multiDimArray[0];
        for(int i = 0; i < multiDimArray.length; i++){            
            for(int j = 0; j < multiDimArray[i].length;j++){
                multiDimArray[i][j] = i+j;
                System.out.print(multiDimArray[i][j] + "  ");
            }
            System.out.println();
        }*/
        
        int n = 10;
        int[][] multiplicationMatrix = generateMultiplicationMatrix(n);
        printMultiplicationMatrix(multiplicationMatrix);
        
        
    }
    
    public static int[][] generateMultiplicationMatrix(int n){
        int[][] resultArray = new int[n][n];
        
        for(int i = 0; i < resultArray.length;i++){
            for(int j = 0; j < resultArray[i].length;j++){
                resultArray[i][j] = (i+1)*(j+1);
            }
        }
        
        return resultArray;
       
    }
    
    public static void printMultiplicationMatrix(int[][] matrix){  
        
         for(int i = 0; i < matrix.length; i++){            
            for(int j = 0; j < matrix[i].length;j++){                
                System.out.print(matrix[i][j]);
                System.out.print('\t');
                
            }
            System.out.print('\n');
        }
       
    }
    
}
