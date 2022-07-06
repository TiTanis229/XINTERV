package com.example.xinterv.vehicule;

import android.graphics.Color;

import java.util.Date;

public class Vehicule {

    String immatrulation;
    String marque;
    String modèle;
    String couleur;
    int puissance;
    String categorie;
    String boite;
    Date annee;

    public Vehicule(String immatrulation, String marque, String modèle, String couleur, int puissance, String categorie, String boite, Date annee) {
        this.immatrulation = immatrulation;
        this.marque = marque;
        this.modèle = modèle;
        this.couleur = couleur;
        this.puissance = puissance;
        this.categorie = categorie;
        this.boite = boite;
        this.annee = annee;
    }

    public String getImmatrulation() {
        return immatrulation;
    }

    public void setImmatrulation(String immatrulation) {
        this.immatrulation = immatrulation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModèle() {
        return modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getBoite() {
        return boite;
    }

    public void setBoite(String boite) {
        this.boite = boite;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "immatrulation='" + immatrulation + '\'' +
                ", marque='" + marque + '\'' +
                ", modèle='" + modèle + '\'' +
                ", couleur=" + couleur +
                ", puissance=" + puissance +
                ", categorie='" + categorie + '\'' +
                ", boite='" + boite + '\'' +
                ", annee=" + annee +
                '}';
    }
}
