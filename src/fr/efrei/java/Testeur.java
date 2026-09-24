package fr.efrei.java;

public class Testeur extends Collaborateur{

    public Testeur(String prenom, String nom, double salaire, Adresse adresse) {
        super(prenom, nom, salaire, adresse);
    }

    public Testeur(String prenom, String nom,  double salaire) {
        super(prenom, nom, salaire);
    }


    public void travailler() {
        super.travailler("Le collaborateur fait des tests");
    }

    @Override
    public void former() {

    }
}
