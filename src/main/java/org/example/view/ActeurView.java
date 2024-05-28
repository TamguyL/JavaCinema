package org.example.view;
import org.example.model.Acteur;

import java.util.List;

public class ActeurView {

    public void afficheActeurs(List<Acteur> acteurs){
        System.out.println("Liste");
        for(Acteur acteur : acteurs){
            System.out.println(acteur.getNom() + " " + acteur.getPrenom() + " "+ acteur.getPhoto());
        }
    }

    public void afficheActeur(Acteur acteur) {
        System.out.println("ID: " + acteur.getId() + ", Name: " + acteur.getPrenom() + " " + acteur.getNom() + ", Photo: " + acteur.getPhoto() + "\r\n");
    }

}
