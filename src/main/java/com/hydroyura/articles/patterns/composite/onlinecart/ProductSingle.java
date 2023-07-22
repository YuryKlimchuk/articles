package com.hydroyura.articles.patterns.composite.onlinecart;

public class ProductSingle implements IProduct {

    private int cost;
    private String id;


    public ProductSingle(int cost, String id) {
        this.cost = cost;
        this.id = id;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getCost() {
        return cost;
    }

}
