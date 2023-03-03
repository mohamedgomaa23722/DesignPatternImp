package com.pattern.Decorator;

public class Salad extends SandwichDecorator implements Sandwich {
    public Salad(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",Salad";
    }
}
