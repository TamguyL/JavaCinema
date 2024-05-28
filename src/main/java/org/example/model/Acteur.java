package org.example.model;
import javax.persistence.*;


@Entity
@Table(name = "acteur")

// Modele de MVC
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nom;
    private String prenom;
    private String photo;


    public Acteur(int id, String nom, String photo, String prenom) {
        this.id = id;
        this.nom = nom;
        this.photo = photo;
        this.prenom = prenom;
    }

    public Acteur() {

    }

    public Acteur(String nom, String prenom, String photo) {
        this.nom = nom;
        this.photo = photo;
        this.prenom = prenom;
    }

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