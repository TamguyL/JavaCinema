package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="realisateur")
public class Realisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    private String nom;
    private String prenom;
    private String photo;

    @ManyToMany(mappedBy = "realisateurs")
    List<Film> films = new ArrayList<Film>();

    public Realisateur(int id, String nom, String prenom, String photo) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.photo = photo;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
