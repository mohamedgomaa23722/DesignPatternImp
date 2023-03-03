package com.pattern.Decorator;

public class Beef extends SandwichDecorator{
    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beef";
    }
}
