package org.example.view;

import org.example.model.RealisateurDAO;
import org.example.model.Realisateur;
import java.util.List;

public class RealisateurView {
    public void afficheRealisateurs(List<Realisateur> realisateurs){
        System.out.println("Liste");
        for(Realisateur realisateur : realisateurs){
            System.out.println(realisateur.getNom() + " " + realisateur.getPrenom() + " "+ realisateur.getPhoto());
        }

    }
    public void afficheRealisateur(int id, List<Realisateur> realisateurs){
        for(Realisateur realisateur: realisateurs){
            if (realisateur.getId()==id){
                System.out.println(realisateur.getNom() + " " + realisateur.getPrenom() + " " + realisateur.getPhoto());
                break;
            }

        }}
    public void ajoutRealisateur(String nom, String prenom, String photo) {
        RealisateurDAO.ajoutRealisateur(nom, prenom, photo);
    }

    public void supprRealisateur(int id) {
        RealisateurDAO.supprRealisateur(id);
    }

    public void updateRealisateur(String colonne, String modif, int id) {
        RealisateurDAO.updateRealisateur(colonne, modif, id);
    }
}
