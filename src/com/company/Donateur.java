package com.company;

import java.util.ArrayList;

public class Donateur extends Personne{
    private ArrayList<Produit> don;

    public Donateur(String nom, String prenom, String telephone, String email_adresse, ArrayList<Produit> don) {
        super(nom, prenom, telephone, email_adresse);
        this.don = don;
    }

    public ArrayList<Produit> getDon() {
        return don;
    }
}
