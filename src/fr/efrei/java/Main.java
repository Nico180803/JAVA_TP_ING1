package fr.efrei.java;

import java.util.Scanner;


public class Main {

    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Equipe equipe = new Equipe();

        Programmeur alice = new Programmeur("Alice","Martin","JAVA",42000, new Adresse("12 rue des Lilas", "75000", "Paris", "France"));
        Programmeur alex = new Programmeur("Alex","Doe","JAVA",43000);

        equipe.addCollaborateur(alex);
        equipe.addCollaborateur(alice);


        boucle : while (true){
            getMenu();

            switch (getScannerInt()){
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
                    ajouterCollaborateur(equipe);
                    break;

                case 4:
                {
                    System.out.println("Pourcentage d'augmentation :");
                    alice.augmentSalary(getScannerDouble());
                    break;
                }
                case 5:
                {
                    equipe.showAllCollaborateur();
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




    private static void ajouterCollaborateur(Equipe equipe) {
        System.out.println("Prénom ?");
        String prenom = sc.nextLine();
        System.out.println("Nom ?");
        String nom = sc.nextLine();
        System.out.println("Langage favori ?");
        String stack = sc.nextLine();
        System.out.println("Salaire annuel ?");
        double salaire = getScannerDouble();


        equipe.addCollaborateur(new Programmeur(prenom,nom,stack,salaire));

        System.out.println("Nouveau programmeur ajouté");
    }

    public static double getScannerDouble(){
        while (!sc.hasNextDouble()){
            System.out.println("Erreur : veuillez entrer un nombre");
            sc.nextLine();
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

    public static void getMenu(){
        System.out.println("""
                ==============================
                 Gestion des programmeurs
                ==============================
                
                1 - Afficher Alice
                2 - Afficher Alex
                3 - Ajouter un programmeur
                4 - Augmenter salaire alice
                5 - Afficher tout les collaborateurs
                0 - Quitter
                """);
    }
}