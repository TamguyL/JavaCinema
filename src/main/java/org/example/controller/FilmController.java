package org.example.controller;
import org.example.model.Acteur;
import org.example.model.Film;
import org.example.view.ActeurView;
import org.example.view.FilmView;

import java.util.ArrayList;
import java.util.List;

public class FilmController {
    private List<Film> Films;
    private FilmView viewFilm;


    public FilmController() {
        this.Films = new ArrayList();
        this.viewFilm = new FilmView();
    }
    public void addFilm(Film film){
        Films.add(film);
    }

    public void afficheFilms(){
        viewFilm.afficheFilms(Films);
    }
    public void afficheFilm(int id){
        viewFilm.afficheFilm(id, Films);
    }
    public void ajoutFilm(String titre, String description, String affiche) {
        viewFilm.ajoutFilm(titre, description, affiche);
    }

    public void supprFilm(int id) {
        viewFilm.supprFilm(id);
    }

    public void updateFilm(String colonne, String modif, int id) {
        viewFilm.updateFilm(colonne, modif, id);
    }
}
