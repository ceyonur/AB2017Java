/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaroyunu;

/**
 *
 * @author oyas
 */
public abstract class Zar {
   private int yuzSayisi;
   private int onYuz;
   
   public abstract void atma();
   
   public int getYuzSayisi(){
       return yuzSayisi;
   }
   
   public void setYuzSayisi(int yuzSayisi){
       this.yuzSayisi = yuzSayisi;
   }
   
   public int getOnYuz(){
       return onYuz;
   }
    
   public void setOnyuz(int onYuz){
       this.onYuz = onYuz;
   }
   
   public boolean equals(Zar x){
       return this.onYuz == x.onYuz;
   }
}
