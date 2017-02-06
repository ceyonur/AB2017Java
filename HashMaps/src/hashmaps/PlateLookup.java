/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class PlateLookup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> plateMap = generatePlateMap();

        System.out.println("Plaka kodunu giriniz, ya da 0 ile tüm illeri görünüz");
        int plateCode = sc.nextInt();
        if (plateCode != 0) {
            System.out.println(plateMap.get(plateCode));
        } else {
           for(Integer key : plateMap.keySet()){
               System.out.println(key + "=>" + plateMap.get(key));
           }
        }
        for(String value : plateMap.values()){
               System.out.println(value);
           }

    }

    public static Map<Integer, String> generatePlateMap() {
        Map<Integer, String> resultMap = new HashMap<>();
        //Hata alıyorsanız
        //Map<Integer,String> resultMap = new HashMap<Integer,String>();

        resultMap.put(68, "Aksaray");
        resultMap.put(61, "Trabzon");
        resultMap.put(34, "İstanbul");
        resultMap.put(6, "Ankara");
        resultMap.put(35, "İzmir");

        //Aksaray plaka kodu değişti
        resultMap.remove(68);
        resultMap.put(82, "Aksaray");
        

        return resultMap;
    }

}
