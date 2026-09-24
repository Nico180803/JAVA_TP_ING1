package fr.efrei.java;

import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Programmeur alice = new Programmeur("Alice","Martin","JAVA",42000, new Adresse("12 rue des Lilas", "75000", "Paris", "France"));
        Programmeur alex = new Programmeur("Alex","Doe","JAVA",43000);

        Formateur formateur = alice;

        int choix;

        boucle : while (true){
            System.out.println("""
                ==============================
                 Gestion des programmeurs
                ==============================
                
                1 - Afficher Alice
                2 - Afficher Alex
                3 - Ajouter un programmeur
                4 - Augmenter salaire alice
                0 - Quitter
                """);
            choix = getScannerInt();

            switch (choix){
                case 1:
                {
                    System.out.println(alice);
                    break;
                }
                case 2:
                {
                    System.out.println(alex);
                    break;
                }
                case 3:
                {
                    System.out.println("Prénom ?");
                    String prenom = sc.nextLine();
                    System.out.println("Nom ?");
                    String nom = sc.nextLine();
                    System.out.println("Langage favori ?");
                    String stack = sc.nextLine();
                    System.out.println("Salaire annuel ?");
                    double salaire = getScannerDouble();

                    sc.nextLine();

                    Programmeur prg = new Programmeur(prenom,nom,stack,salaire);

                    System.out.println(prg);
                    break;
                }
                case 4:
                {
                    System.out.println("Pourcentage d'augmentation :");
                    alice.augmentSalary(getScannerDouble());
                    break;
                }
                case 0:
                {
                    break boucle;
                }
                default:
                    System.out.println("Erreur : Veuillez saisir une option valide");
            }
        }


    }

    public static double getScannerDouble(){
        while (!sc.hasNextDouble()){
            System.out.println("Erreur : veuillez entrer un nombre");
            sc.next();
        }
        double retour = sc.nextInt();
        sc.nextLine();
        return retour;

    }

    public static int getScannerInt(){
        while (!sc.hasNextInt()){
            System.out.println("Erreur : veuillez entrer un nombre");
            sc.nextLine();
        }
        int retour = sc.nextInt();
        sc.nextLine();
        return retour;

    }
}