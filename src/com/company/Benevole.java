package com.company;
public class Benevole extends Personne{
    private int numero_national;    // => numeroNational
    private String nom, prenom, telephone, email_adresse;   // => emailAdresse
    // ajouter la liste des livraisons

    public Benevole(String nom, String prenom, String telephone, String email_adresse, int numero_national) {
        super(nom, prenom, telephone, email_adresse);
        this.numero_national = numero_national;
    }

    public int getNumero_national() {
        return numero_national;
    }
}
