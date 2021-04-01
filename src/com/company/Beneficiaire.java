package com.company;

public class Beneficiaire extends Personne{
    private int charge_familiale, numero_national, code_postal;
    private String rue, ville;

    public Beneficiaire(String nom, String prenom, String telephone, String email_adresse, int charge_familiale, int numero_national, int code_postal, String rue, String ville) {
        super(nom, prenom, telephone, email_adresse);
        this.charge_familiale = charge_familiale;
        this.numero_national = numero_national;
        this.code_postal = code_postal;
        this.rue = rue;
        this.ville = ville;
    }

    public int getCharge_familiale() {
        return charge_familiale;
    }

    public int getNumero_national() {
        return numero_national;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }
}
