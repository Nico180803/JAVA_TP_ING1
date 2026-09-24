package fr.efrei.java;

public abstract class Collaborateur implements Formateur{
    protected String prenom;
    protected String nom;
    protected double salaire;
    protected Adresse adresse;

    public Collaborateur(String prenom, String nom, double salaire, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    public Collaborateur(String prenom, String nom, double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.salaire = salaire;
    }

   public void travailler(String tache){
       System.out.println(tache);
   }
}
