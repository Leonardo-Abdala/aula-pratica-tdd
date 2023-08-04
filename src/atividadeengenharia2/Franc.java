/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeengenharia2;

/**
 *
 * @author Leonardo Abdala
 */
class Franc extends Money {   
   private int amount;					
   Franc(int amount) {      
      this.amount= amount;
    }					
    Money times(int multiplier)  {
      return new Franc(amount * multiplier);
    }   
    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
     }					
}
