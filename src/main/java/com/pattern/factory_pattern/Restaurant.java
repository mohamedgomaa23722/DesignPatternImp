package com.pattern.factory_pattern;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
