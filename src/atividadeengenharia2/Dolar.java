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
class Dollar extends Money{
   private int amount;
   
   Dollar(int amount) {
      this.amount= amount;
   }
   
   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }
   
}	
