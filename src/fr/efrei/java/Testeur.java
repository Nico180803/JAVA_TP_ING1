package fr.efrei.java;

public class Testeur extends Collaborateur{

    public Testeur(String prenom, String nom, String preferedStack, double salaire, Adresse adresse) {
        super(prenom, nom, preferedStack, salaire, adresse);
    }

    public Testeur(String prenom, String nom, String preferedStack, double salaire) {
        super(prenom, nom, preferedStack, salaire);
    }


    public void travailler() {
        super.travailler("Le collaborateur fait des tests");
    }

    @Override
    public void former() {

    }
}
