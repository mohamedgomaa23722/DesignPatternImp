package com.pattern.strategy_pattern.model;

public class Item {
    private int id;
    private int cost;

    
    public Item(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
