/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicekci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author oyas
 */
public class Cicekci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Cicek> buket = new ArrayList<>();
        
        Gul a = new BeyazGul();
        

        buket.add(new BeyazGul());
        buket.add(new KirmiziGul());
        buket.add(new SariGul());

        System.out.println(buket);

        Integer tutar = fiyatHesapla(buket);

        System.out.println("Fiyat : " + tutar);

        Set<Cicek> sepet = new HashSet<>();

        sepet.add(new BeyazGul());
        sepet.add(new Lale());

        System.out.println(sepet);

        tutar = fiyatHesapla(sepet);

        System.out.println("Fiyat : " + tutar);
        
    }

    public static Integer fiyatHesapla(Collection<Cicek> koleksiyon) {

        Integer result = 0;

        for (Cicek c : koleksiyon) {

            result = result + c.getFiyat();
        }

        return result;
    }

}
