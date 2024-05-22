package org.example.view;
import org.example.model.ActeurDAO;
import org.example.model.Acteur;
import java.util.List;

public class ActeurView {
    public void afficheActeurs(List<Acteur> acteurs){
        System.out.println("Liste");
        for(Acteur acteur : acteurs){
            System.out.println(acteur.getNom() + " " + acteur.getPrenom() + " "+ acteur.getPhoto());
        }

    }
    public void afficheActeur(int id, List<Acteur> acteurs){
        for(Acteur acteur: acteurs){
            if (acteur.getId()==id){
            System.out.println(acteur.getNom() + " " + acteur.getPrenom() + " " + acteur.getPhoto());
            break;
        }

        }}
    public void ajoutActeur(String nom, String prenom, String photo) {
        ActeurDAO.ajoutActeur(nom, prenom, photo);
    }

    public void supprActeur(int id) {
        ActeurDAO.supprActeur(id);
    }

    public void updateActeur(String colonne, String modif, int id) {
        ActeurDAO.updateActeur(colonne, modif, id);
    }
}