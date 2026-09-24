package fr.efrei.java;

public abstract class Collaborateur implements Formateur{
    protected String prenom;
    protected String nom;
    protected String preferedStack;
    protected double salaire;
    protected Adresse adresse;

    public Collaborateur(String prenom, String nom, String preferedStack, double salaire, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.preferedStack = preferedStack;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    public Collaborateur(String prenom, String nom, String preferedStack, double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.preferedStack = preferedStack;
        this.salaire = salaire;
    }

   public void travailler(String tache){
       System.out.println(tache);
   }
}
