package fr.efrei.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipe {

    private Set<Collaborateur> collaborateurs;

    public Equipe() {
        this.collaborateurs = new HashSet<Collaborateur>();
    }


    public void addCollaborateur(Collaborateur collaborateur) throws CollaborateurDejaExistantException{

        boolean result = this.collaborateurs.add(collaborateur);

        if (!result){
            throw new CollaborateurDejaExistantException();
        }

    }

    public void showAllCollaborateur(){
        for(Collaborateur collaborateur : collaborateurs){
            System.out.println(collaborateur);
            System.out.println();
        }
    }

    public void showCollaborateurById(String id){
        for(Collaborateur collaborateur : collaborateurs){
            if (collaborateur.getId().equals(id)) {
                System.out.println(collaborateur);
                System.out.println();
            }

        }
    }

    public void showCollaborateurByNamePart(String name){
        for(Collaborateur collaborateur : collaborateurs){
            if (collaborateur.getNom().contains(name)) {
                System.out.println(collaborateur);
                System.out.println();
            }

        }
    }

    public void showCollaborateurBySalaryLimit(double minSalary){
        for(Collaborateur collaborateur : collaborateurs){
            if (collaborateur.getSalaire() > minSalary) {
                System.out.println(collaborateur);
                System.out.println();
            }

        }
    }

    public void sortByName(){
        List<Collaborateur> sortedList = new ArrayList<>(collaborateurs);
        sortedList.sort((c1, c2) -> c1.getNom().compareTo(c2.getNom()));

        System.out.println(sortedList);

    }



}
