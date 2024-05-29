package org.example;

import org.example.model.*;
import org.example.controller.*;
import org.example.view.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ActMvc {
    public static void main(String[] args) {

        // Appel Fonction Acteur
//        ActeurController ac = new ActeurController();
//        ac.afficheActeur(1);
//        ac.afficheActeur(2);
//        ac.afficheActeur(5);
//        ac.ajoutActeur("Pitt","Brad","photobrad");
//        ac.updateActeur("Black", "Jack", "laphotodeouf", 5);
//        ac.supprActeur(9);
//        ac.afficheActeurs();

        // Appel Fonction Realisateur
//        RealisateurController rc = new RealisateurController();

        // Appel Fonction Film
//        FilmController fc = new FilmController();
//        fc.concatenation();
//        fc.afficheFilm(3);
//        fc.afficheFilm(2);
//        fc.afficheFilm(5);
//        fc.ajoutFilm("Pitt","Brad","photobrad");
//        fc.updateFilm("Black", "Jack", "laphotodeouf", 5);
//        fc.supprFilm(9);
//        fc.afficheFilms();

//        GenreDAO daoGenre = new GenreDAO();
//        List<Genre> genres = daoGenre.getGenres();
//        for (Genre g: genres) {
//            System.out.println(g.getGenre());
//        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("filmunit");
        EntityManager em = emf.createEntityManager();

        // Create and persist a student
        em.getTransaction().begin();
        Acteur acteur = new Acteur();
        acteur.setNom("John");
        acteur.setPrenom("ee");
        acteur.setPhoto("ee.jpg");
        em.persist(acteur);
        em.getTransaction().commit();

        // Retrieve all students
        TypedQuery<Acteur> query = em.createQuery("SELECT s FROM Acteur s", Acteur.class);
        List<Acteur> acteurs = query.getResultList();
        for (Acteur s :acteurs) {
            System.out.println("ID: " + s.getId() + " Name: " + s.getNom());
        }
        em.close();
        emf.close();


    }
}