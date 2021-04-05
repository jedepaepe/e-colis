package com.company;

public class Produit {
    private String description;
    private double poids_kg, stock_produit; // camelCase
    // manque la liste des dons
    // manque la liste des livraisons

    public Produit(String description, double poids_kg, double stock_produit) {
        this.description = description;
        this.poids_kg = poids_kg;
        this.stock_produit = stock_produit;
    }

    public String getDescription() {
        return description;
    }

    public double getPoids_kg() {
        return poids_kg;
    }

    public double getStock_produit() {
        return stock_produit;
    }
}
