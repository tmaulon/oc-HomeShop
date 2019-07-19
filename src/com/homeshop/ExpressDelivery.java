package com.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        if ( city.equals("Paris") )
            return 6.99;
        else
            return 9.99;
    }

    @Override
    public String getInfo() {
        if ( city.equals("Paris") )
            return "Livraison express dans paris : 6.99€.";
        else
            return "Livraison express hors paris : 9.99€.";
    }
}
