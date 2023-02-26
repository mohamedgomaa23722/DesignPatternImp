package com.pattern;

import com.pattern.observer_pattern.WeatherStation;
import com.pattern.strategy_pattern.Cart;
import com.pattern.strategy_pattern.CreditCardStrategy;
import com.pattern.strategy_pattern.Item;
import com.pattern.strategy_pattern.PaypalStrategy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
         * Cart cart = new Cart();
         * 
         * Item t_shirt = new Item(0, 55);
         * Item gtaV = new Item(1, 100);
         * Item playStation = new Item(2, 15000);
         * Item pc = new Item(3, 5500);
         * Item apple = new Item(4, 2);
         * 
         * cart.addItem(apple);
         * cart.addItem(gtaV);
         * cart.addItem(pc);
         * cart.addItem(playStation);
         * cart.addItem(t_shirt);
         * cart.pay(new CreditCardStrategy("Gomaa", "5555 5555 5555 5555", "555",
         * "11/12"));
         * cart.pay(new PaypalStrategy("Gomaa@gmail.com", "5555"));
         */

        new WeatherStation();

    }
}
