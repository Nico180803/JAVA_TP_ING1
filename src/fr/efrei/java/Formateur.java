package fr.efrei.java;

public interface Formateur {

    void former();

    default void sePresenter() {
        System.out.println("Bonjour je suis votre formateur");
    }
}
