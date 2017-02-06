/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaroyunu;

import java.util.Random;

/**
 *
 * @author oyas
 */
public class AltiYuzluZar extends Zar implements Hileli{
    private Random rgen = new Random();

    public AltiYuzluZar(){
        setOnyuz(1);
        setYuzSayisi(6);
    }
    

    @Override
    public void atma() {
        //int randomNumber = rgen.nextInt(getYuzSayisi()) + 1;
        //setOnyuz(randomNumber);
        setOnyuz(rgen.nextInt(getYuzSayisi()) + 1);
    }

    @Override
    public void hile() {
        setOnyuz(getYuzSayisi());
    }
    
}
