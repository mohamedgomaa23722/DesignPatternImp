package com.pattern.Decorator;

public class DecoratorImp {
    public static void main(String[] args) {
        Sandwich basicSandwich = new Beef(new Salad(new BasicSandwich()));
        System.out.println("Description :" + basicSandwich.getDescription());
        System.out.println("Cost :" + basicSandwich.getCost());
    }
}
