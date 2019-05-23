package com.homeshop;

public class Four {
    int puissance;
    int capacite;

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
    }

}
