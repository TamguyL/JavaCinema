package org.example.controller;

import org.example.model.Realisateur;
import org.example.view.RealisateurView;

import java.util.ArrayList;
import java.util.List;

public class RealisateurController {

    private List<Realisateur> Realisateurs;
    private RealisateurView viewRealisateur;


    public RealisateurController() {
        this.Realisateurs = new ArrayList();
        this.viewRealisateur = new RealisateurView();
    }
    public void addRealisateur(Realisateur act){
        Realisateurs.add(act);
    }

    public void afficheRealisateurs(){
        viewRealisateur.afficheRealisateurs(Realisateurs);
    }
    public void afficheRealisateur(int id){
        viewRealisateur.afficheRealisateur(id, Realisateurs);
    }
    public void ajoutRealisateur(String nom, String prenom, String photo) {
        viewRealisateur.ajoutRealisateur(nom, prenom, photo);
    }

    public void supprRealisateur(int id) {
        viewRealisateur.supprRealisateur(id);
    }

    public void updateRealisateur(String colonne, String modif, int id) {
        viewRealisateur.updateRealisateur(colonne, modif, id);
    }

}

