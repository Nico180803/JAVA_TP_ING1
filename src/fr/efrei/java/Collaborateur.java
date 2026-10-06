package fr.efrei.java;

import java.util.Objects;

public abstract class Collaborateur implements Formateur{
    protected String id;
    protected String prenom;
    protected String nom;
    protected double salaire;
    protected Adresse adresse;

    public Collaborateur(String id, String prenom, String nom, double salaire, Adresse adresse) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    public Collaborateur(String id, String prenom, String nom, double salaire) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.salaire = salaire;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborateur that = (Collaborateur) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void travailler(String tache){
       System.out.println(tache);
   }

    public String getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

}
