package org.example;

import org.example.controller.ActeurController;
import org.example.model.Acteur;
import org.example.model.ActeurDAO;

import org.example.controller.RealisateurController;
import org.example.model.Realisateur;
import org.example.model.RealisateurDAO;

import org.example.controller.FilmController;
import org.example.model.Film;
import org.example.model.FilmDAO;

import java.sql.SQLException;
import java.util.List;

public class ActMvc {
    public static void main(String[] args) {
//        ActeurController ac = new ActeurController();
//        ActeurDAO acteurDAO = new ActeurDAO();
//        acteurDAO.Dbconnect();
//        List<Acteur> acteurs = ActeurDAO.getActeurs();
//        for(Acteur act : acteurs) {
//            // System.out.println(act.getNom());
//            ac.addActeur(act);
//        }
//        ac.afficheActeurs();
//        // ac.afficheActeur(1);
//        // ac.ajoutActeur("Toto", "Tati","photototi");
//        // ac.supprActeur(7);
//        // ac.updateActeur("prenom","Jean Paul" ,1);


//        RealisateurController rc = new RealisateurController();
//        RealisateurDAO realisateurDAO = new RealisateurDAO();
//        realisateurDAO.Dbconnect();
//        List<Realisateur> realisateurs = RealisateurDAO.getRealisateurs();
//        for(Realisateur real : realisateurs) {
//            rc.addRealisateur(real);
//        }
//        // rc.afficheRealisateurs();
//        // rc.afficheRealisateur(21);
//        // rc.ajoutRealisateur("Toté", "Tati","photototi");
//        // rc.supprRealisateur(20);
//         rc.updateRealisateur("prenom","Alain" ,19);


        FilmController fc = new FilmController();
        FilmDAO filmDAO = new FilmDAO();
        FilmDAO.Dbconnect();
        List<Film> films = FilmDAO.getFilms();
        for(Film film : films) {
            fc.addFilm(film);
        }
         //fc.afficheFilms();
         fc.afficheFilm(1);
         //fc.ajoutFilm("Toté", "Tati","photototi");
         //fc.supprFilm(20);
         //fc.updateFilm("prenom","Alain" ,19);
    }
}