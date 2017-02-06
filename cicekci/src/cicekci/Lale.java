/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicekci;

/**
 *
 * @author oyas
 */
public class Lale implements Cicek{

    @Override
    public String toString() {
        return getRenk() + " Lale";
    }
 
    @Override
    public String getRenk() {
        return "Kırmızı";
    }

    @Override
    public Integer getFiyat() {
        return 2;
    }
    
}
