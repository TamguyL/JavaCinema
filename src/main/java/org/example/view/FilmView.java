package org.example.view;
import org.example.model.FilmDAO;
import org.example.model.Film;
import java.util.List;

public class FilmView {
    public void afficheFilms(List<Film> films){
        System.out.println("Liste");
        for(Film film : films){
            System.out.println(film.getTitre());
            System.out.println("Description : " +film.getDescription());
            System.out.println("Genre : " +film.getGenre());
            System.out.println("Realisateur : " +film.getId_realisateur());
        }

    }
    public void afficheFilm(int id, List<Film> films){
        for(Film film: films){
            if (film.getId()==id){
                System.out.println(film.getTitre());
                System.out.println("Description : " +film.getDescription());
                System.out.println("Genre : " +film.getGenre());
                System.out.println("Realisateur : " +film.getId_realisateur());
                break;
            }

        }}
    public void ajoutFilm(String titre, String description, String affiche) {
        FilmDAO.ajoutFilm(titre, description, affiche);
    }

    public void supprFilm(int id) {
        FilmDAO.supprFilm(id);
    }

    public void updateFilm(String colonne, String modif, int id) {
        FilmDAO.updateFilm(colonne, modif, id);
    }
}
