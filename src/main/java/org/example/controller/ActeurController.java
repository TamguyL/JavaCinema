package org.example.controller;
import org.example.model.Acteur;
import org.example.view.ActeurView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActeurController {

    private List<Acteur> Acteurs;
    private ActeurView viewActeur;


    public ActeurController() {
        this.Acteurs = new ArrayList();
        this.viewActeur = new ActeurView();
    }
    public void addActeur(Acteur act){
        Acteurs.add(act);
    }

    public void afficheActeurs(){
        viewActeur.afficheActeurs(Acteurs);
    }
    public void afficheActeur(int id){
        viewActeur.afficheActeur(id, Acteurs);
    }
    public void ajoutActeur(String nom, String prenom, String photo){
        viewActeur.ajoutActeur(nom, prenom, photo);
    }

    public void supprActeur(int id) {
        viewActeur.supprActeur(id);
    }

    public void updateActeur(String colonne, String modif, int id) {
        viewActeur.updateActeur(colonne, modif, id);
    }

}