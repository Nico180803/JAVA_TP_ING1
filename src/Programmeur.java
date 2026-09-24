public class Programmeur {
    String prenom;
    String nom;
    String preferedStack;
    double salaire;


    public Programmeur(String prenom, String nom, String preferedStack, double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.preferedStack = preferedStack;
        this.salaire = salaire;
    }

    public void augmentSalary(double pourcent){
        this.salaire *= (1+pourcent);

        System.out.println("Nouveau salaire : "+this.salaire);
    }

    @Override
    public String toString() {
        return  "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", preferedStack='" + preferedStack + '\'' +
                ", salaire='" + salaire;
    }
}
