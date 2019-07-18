package com.homeshop;

public class Main {

    public static void main(String[] args) {
        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        Aliment cake = new Aliment();
        cake.nom = "Cake aux fruits";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake, 180, 60);
        System.out.println("");
        cake.manger();


    }
}
