package org.example.model;

public class Film {

    private int id;
    private String titre;
    private String description;
    private String affiche;

    public Film() {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.affiche = affiche;
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

}
