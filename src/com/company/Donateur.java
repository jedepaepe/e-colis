package com.company;

import java.util.ArrayList;

public class Donateur extends Personne{
    private ArrayList<Produit> don; // le donateur peut faire plusieurs dons => ArrayList<Don> dons (cette classe manque)

    public Donateur(String nom, String prenom, String telephone, String email_adresse, ArrayList<Produit> don) {    // retirer don du constructeur (vous ne connaissez pas la liste des dons au moment où vous créer le donateur)
        super(nom, prenom, telephone, email_adresse);
        this.don = don;
    }

    public ArrayList<Produit> getDon() {
        return don;
    }
    
    // ajouter une méthode addDon(Don don) {...} 
}
