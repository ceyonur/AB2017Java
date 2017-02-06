/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class FrequencyTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String str = sc.nextLine();
        HashMap<Character,Integer> frequencyMap = findFrequencies(str);
        printHashMap(frequencyMap);
        
    }

    public static HashMap<Character, Integer> findFrequencies(String str) {
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
            if (resultMap.containsKey(ch)) {
                resultMap.put(ch, resultMap.get(ch)+1);
            } else {
                resultMap.put(ch, 1);
            }
            }
        }
        
        return resultMap;
    }
    
    public static void printHashMap(HashMap map){
        for(Object o : map.keySet()){
            System.out.println(o + "=>" + map.get(o));
        }
    }

}
