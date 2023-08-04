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
class Dollar extends Money {

    private int amount;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
