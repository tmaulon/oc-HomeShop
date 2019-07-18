package com.homeshop;

public class Four {
    private Resistance resistance;
    private Soufflerie soufflerie;
    int puissance;
    int capacite;

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie setSoufflerie(Soufflerie soufflerie) {
        this.soufflerie = soufflerie;
    }

    public void cuire(Aliment aliment, int temperature, int duree) {
        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
    }
//    public void cuire(Aliment aliment) {
//        System.out.println("Je cuis un aliment : " + aliment.nom);
//        System.out.println("avec ma capacité de " + capacite + " litres");
//        System.out.println("et ma puissance de " + puissance + " degrés.");
//    }

    /**
     *  Fonction de maintenance accessible au technicien,
     *  mais pas à l'utilisateur final du four.
     *  Méthode accessible uniquement à l'intérieur d'une classe.
     */
    private void maintenir() {}


}
