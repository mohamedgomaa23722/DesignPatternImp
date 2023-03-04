package com.pattern.factory_pattern;


public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }

}