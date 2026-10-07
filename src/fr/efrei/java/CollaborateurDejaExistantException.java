package fr.efrei.java;

public class CollaborateurDejaExistantException extends RuntimeException {
    public CollaborateurDejaExistantException() {
        super("Erreur Collaborateur Deja Existant");
    }
}
