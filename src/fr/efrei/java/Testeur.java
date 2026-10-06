package fr.efrei.java;

public class Testeur extends Collaborateur{

    public Testeur(String id,String prenom, String nom, double salaire, Adresse adresse) {
        super(id,prenom, nom, salaire, adresse);
    }

    public Testeur(String id,String prenom, String nom,  double salaire) {
        super(id,prenom, nom, salaire);
    }


    public void travailler() {
        super.travailler("Le collaborateur fait des tests");
    }

    @Override
    public void former() {

    }
}
