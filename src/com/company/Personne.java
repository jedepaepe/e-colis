package com.company;
public abstract class Personne {
    private String nom, prenom, telephone, email_adresse;

    public Personne(String nom, String prenom, String telephone, String email_adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email_adresse = email_adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail_adresse() {
        return email_adresse;
    }
}
