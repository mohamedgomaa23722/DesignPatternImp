package com.pattern.Decorator;

public class BasicSandwich implements Sandwich{
    @Override
    public double getCost() {
        return 10.5;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
