package fr.efrei.java;

import static fr.efrei.java.Main.sc;

public class Programmeur extends Collaborateur {


    public Programmeur(String prenom, String nom, String preferedStack, double salaire, Adresse adresse) {
        super(prenom, nom, preferedStack, salaire, adresse);
    }

    public Programmeur(String prenom, String nom, String preferedStack, double salaire) {
        super(prenom, nom, preferedStack, salaire);
    }

    public void augmentSalary(double pourcent){

        while (pourcent<0){
            System.out.println("Erreur : veuillez entrez une valeur positive");
            pourcent =sc.nextDouble();
            sc.nextLine();
        }

        this.salaire *= (1+pourcent);

        System.out.println("Nouveau salaire : "+this.salaire);
    }

    public void travailler() {
        super.travailler("Le collaborateur programme");
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPreferedStack() {
        return preferedStack;
    }

    public void setPreferedStack(String preferedStack) {
        this.preferedStack = preferedStack;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return  "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", preferedStack='" + preferedStack + '\'' +
                ", salaire='" + salaire+
                ", "+ adresse;
    }

    @Override
    public void former() {

    }
}
