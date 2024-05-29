package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String titre;
    String affiche;
    String description;

    @ManyToOne
    @JoinColumn(name = "id_genre")
    private Genre genre;


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "realise",
            joinColumns = { @JoinColumn(name = "id_film") },
            inverseJoinColumns = { @JoinColumn(name = "id_realisateur") }
    )
    private List<Realisateur> realisateurs;

    public Film(int id, String description, String affiche, String titre, Genre genre, List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
        this.genre = genre;
        this.description = description;
        this.affiche = affiche;
        this.titre = titre;
        this.id = id;
    }

    public  Film() {}

    public Film(String titre, String description, String affiche, Genre genre, List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
        this.genre = genre;
        this.description = description;
        this.affiche = affiche;
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }
    public String getAffiche() {
        return affiche;
    }
    public String getTitre() {
        return titre;
    }
    public int getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(List<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setId(int id) {
        this.id = id;
    }
}
