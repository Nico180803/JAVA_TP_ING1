package fr.efrei.java;

public class CollaborateurDejaExistantException extends RuntimeException {
    public CollaborateurDejaExistantException() {
        System.out.println("Erreur Collaborateur Deja Existant");
    }
}
