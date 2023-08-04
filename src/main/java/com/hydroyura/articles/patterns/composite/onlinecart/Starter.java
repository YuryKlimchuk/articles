package com.hydroyura.articles.patterns.composite.onlinecart;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {

        IProduct productSingleA = new ProductSingle(10, "prod_single_A");
        IProduct productSingleB = new ProductSingle(5, "prod_single_B");
        IProduct productSingleC = new ProductSingle(4, "prod_single_C");
        IProduct productSingleD = new ProductSingle(12, "prod_single_D");
        IProduct productSingleE = new ProductSingle(4, "prod_single_E");
        IProduct productSingleF = new ProductSingle(9, "prod_single_F");

        IProduct productKitA = new ProductKit(Arrays.asList(productSingleA, productSingleB), "product_kit_A");
        IProduct productKitB = new ProductKit(Arrays.asList(productSingleC, productSingleD), "product_kit_B");

        IProduct cart = new ProductKit(Arrays.asList(productKitA, productKitB, productSingleE, productSingleF), "cart");

        System.out.println("Total cost = " + cart.getCost());
    }

}
