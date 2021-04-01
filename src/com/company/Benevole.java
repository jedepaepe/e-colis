package com.company;
public class Benevole extends Personne{
    private int numero_national;
    private String nom, prenom, telephone, email_adresse;

    public Benevole(String nom, String prenom, String telephone, String email_adresse, int numero_national) {
        super(nom, prenom, telephone, email_adresse);
        this.numero_national = numero_national;
    }

    public int getNumero_national() {
        return numero_national;
    }
}
