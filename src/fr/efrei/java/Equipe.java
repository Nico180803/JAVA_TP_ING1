package fr.efrei.java;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private List<Collaborateur> collaborateurs;

    public Equipe() {
        this.collaborateurs = new ArrayList<Collaborateur>();
    }


    public void addCollaborateur(Collaborateur collaborateur){
        this.collaborateurs.add(collaborateur);
    }

    public void showAllCollaborateur(){
        for(Collaborateur collaborateur : collaborateurs){
            System.out.println(collaborateur);
            System.out.println();
        }
    }



}
