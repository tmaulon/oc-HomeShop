package com.homeshop;

public class DirectDelivery implements Delivery {

    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison directe : 4.99€.";
    }
}
