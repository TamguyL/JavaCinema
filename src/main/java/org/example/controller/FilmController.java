package org.example.controller;

import org.example.model.*;
import org.example.view.FilmView;

import java.util.ArrayList;
import java.util.List;

public class FilmController {
    private List<Film> Films;
    private FilmView viewFilm;
    private FilmDAO daoFilm;
    private GenreDAO doaGenre;


    public FilmController() {
        this.Films = new ArrayList();
        this.viewFilm = new FilmView();
        this.daoFilm = new FilmDAO();
    }

    public void afficheFilms() {
        List<Film> film = FilmDAO.getFilms();
        viewFilm.afficheFilms(film);
    }


    public void afficheFilm(int id) {
        Film film = daoFilm.getFilm(id);
        if (film != null) {
            viewFilm.afficheFilm(film);
        } else {
            System.out.println("Film not found with ID: " + id);
        }
    }

    public void ajoutFilm(String titre, String description, String affiche, Genre genre, List<Realisateur> realisateurs) {
        Film film = new Film(titre, description, affiche, genre, realisateurs);
        daoFilm.ajoutFilm(film);
    }

    public void supprFilm(int id) {
        daoFilm.supprFilm(id);
    }

    public void updateFilm(int id, String titre, String description, String affiche, Genre genre, List<Realisateur> realisateurs) {
        Film film = new Film(id, titre, description, affiche, genre, realisateurs);
        daoFilm.updateFilm(film);
    }

    public void concatenation(){
        List<Film> films = FilmDAO.getFilms();
        for (Film f : films){
            System.out.println(f.getTitre()+":"+f.getGenre().getGenre());
            for (Realisateur r :f.getRealisateurs()){
                System.out.println(r.getNom()+" "+r.getPrenom());
            }

        }
    }
}

