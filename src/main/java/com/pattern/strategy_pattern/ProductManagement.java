package com.pattern.strategy_pattern;

import com.pattern.strategy_pattern.model.Cart;
import com.pattern.strategy_pattern.model.Item;
import com.pattern.strategy_pattern.model.User;

public class ProductManagement {

    public ProductManagement() {
        User PaypalUser = new User("mohamed", "010568053092", "mm@gmail.com", new PaypalStrategy("paypal", "5487"),
                new Cart());
        User CreditCardUser = new User("mohamed", "010568053092", "mm@gmail.com",
                new CreditCardStrategy("cc", "5487", 555, "12/23"),
                new Cart());

        Item t_shirt = new Item(0, 55);
        Item gtaV = new Item(1, 100);
        Item playStation = new Item(2, 15000);
        Item pc = new Item(3, 5500);
        Item apple = new Item(4, 2);

        // add some item to cc user cart
        CreditCardUser.getCart().addItem(apple);
        CreditCardUser.getCart().addItem(gtaV);
        CreditCardUser.getCart().addItem(pc);
        // add some item to paypal user cart
        PaypalUser.getCart().addItem(playStation);
        PaypalUser.getCart().addItem(t_shirt);
        // Pay now
        CreditCardUser.pay();
        PaypalUser.pay();
    }

}
