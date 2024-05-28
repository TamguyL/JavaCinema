package org.example.controller;
import org.example.model.Acteur;
import org.example.model.ActeurDAO;
import org.example.view.ActeurView;

import java.util.ArrayList;
import java.util.List;

public class ActeurController {

    private List<Acteur> Acteurs;
    private ActeurView viewActeur;
    private ActeurDAO daoActeur;


    public ActeurController() {
        this.Acteurs = new ArrayList();
        this.viewActeur = new ActeurView();
        this.daoActeur = new ActeurDAO();

    }

    public void afficheActeurs(){
        List<Acteur> acteur = ActeurDAO.getActeurs();
        viewActeur.afficheActeurs(acteur);
    }

    public void afficheActeur(int id){
        Acteur acteur = ActeurDAO.getActeur(id);
        if (acteur != null) {
            viewActeur.afficheActeur(acteur);
        } else {
            System.out.println("Actor not found with ID: " + id);
        }
    }

    public void ajoutActeur(String nom, String prenom, String photo){
        Acteur acteur = new Acteur(nom, prenom, photo);
        daoActeur.ajoutActeur(acteur);
    }

    public void supprActeur(int id) {
        daoActeur.supprActeur(id);
    }

    public void updateActeur(String nom, String prenom, String photo, int id) {
        Acteur acteur = new Acteur(id, nom, photo, prenom);
        daoActeur.updateActeur(acteur);
    }

}