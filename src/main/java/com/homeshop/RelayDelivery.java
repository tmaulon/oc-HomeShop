package com.homeshop;

public class RelayDelivery implements Delivery {
    private int number;

    public RelayDelivery(int number)
    {
        this.number = number;
    }

    @Override
    public double getPrice() {
        if ( number >= 1 && number <=22 )
            return 0;
        else if ( number >= 23 && number <=47 )
            return 2.99;
        else
            return 4.99;
    }

    @Override
    public String getInfo() {
        if ( number >= 1 && number <=22 )
            return "Livraison Point Relais gratuit";
        else if ( number >= 23 && number <=47 )
            return "Livraison Point Relais 2.99€";
        else
            return "Livraison Point Relais 4.99€";
    }
}
