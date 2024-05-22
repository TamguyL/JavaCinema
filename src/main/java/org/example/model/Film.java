package org.example.model;

public class Film {

    private int id;
    private String titre;
    private String description;
    private String affiche;
    private String genre;
    private int id_realisateur;

    public Film() {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.affiche = affiche;
        this.genre = genre;
        this.id_realisateur = id_realisateur;
    }

    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public String getDescription() {
        return description;
    }
    public String getAffiche() {
        return affiche;
    }
    public String getGenre() {
        return genre;
    }
    public int getId_realisateur() {
        return id_realisateur;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }
//    public void setId_genre(int id_genre) {
//        this.id_genre = id_genre;
//    }
    public void setId_realisateur(int id_realisateur) {
        this.id_realisateur = id_realisateur;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
