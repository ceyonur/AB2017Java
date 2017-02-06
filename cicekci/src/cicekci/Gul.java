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
public abstract class Gul implements Cicek{

    @Override
    public String toString() {
        return getRenk() + " Gül";
    }

    @Override
    public Integer getFiyat() {
        return 5;
    }

    
}
