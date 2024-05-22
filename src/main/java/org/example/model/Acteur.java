package org.example.model;
import java.sql.*;
import java.util.List;

public class Acteur {

    private int id;
    private String nom;
    private String prenom;
    private String photo;


    //Constructeur
    public Acteur() {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.photo = photo;
    }

    //    Getter
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getPhoto() {
        return photo;
    }

    //Setter

    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

}