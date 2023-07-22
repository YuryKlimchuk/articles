package com.hydroyura.articles.patterns.composite.onlinecart;

import java.util.Collection;

public class ProductKit implements IProduct {

    private String id;
    private Collection<IProduct> products;


    public ProductKit(Collection<IProduct> products, String id) {
        this.products = products;
        this.id = id;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getCost() {
        return products.stream().mapToInt(IProduct::getCost).sum();
    }
}
