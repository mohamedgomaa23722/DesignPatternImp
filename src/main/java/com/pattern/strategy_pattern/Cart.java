package com.pattern.strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * @return
     */
    public int calculateTotalAmount() {
        int totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getCost();
        }
        return totalAmount;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotalAmount());
    }

}
