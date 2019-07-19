package com.homeshop;

public class TakeAwayDelivery implements Delivery {

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Livraison à emporter";
    }
}
