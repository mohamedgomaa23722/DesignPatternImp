package com.pattern.Decorator;

public class Beef extends SandwichDecorator implements Sandwich{
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
