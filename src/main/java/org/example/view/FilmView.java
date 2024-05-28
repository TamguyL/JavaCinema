package org.example.view;
import org.example.model.Film;

import java.util.List;

public class FilmView {

    public void afficheFilms(List<Film> films){
        System.out.println("Liste");
        for(Film film : films){
            System.out.println(film.getTitre() + " " + film.getGenre());
            System.out.println(film.getAffiche() + " " + film.getDescription());
        }
    }

    public void afficheFilm(Film film) {
        System.out.println("ID: " + film.getId() + ", Name: " + film.getTitre() + " ");
        System.out.println("Idgenre: " + film.getGenre());
        System.out.println(film.getAffiche() + " " + film.getDescription());
    }
}
