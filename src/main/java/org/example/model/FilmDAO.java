package org.example.model;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class FilmDAO {

    Session session=null ;
    Transaction trans;

//    SELECT acteur.nom,acteur.prenom,film.titre,film.description,genre.type,realisateur.nom,realisateur.prenom
//    FROM joue,acteur,film,genre,realisateur
//    WHERE joue.Id_acteur = acteur.id
//    AND joue.Id_film = film.id
//    AND genre.id = film.id_genre
//    AND realisateur.id = film.id_realisateur;

    public Film getFilm(int id){
        System.out.println("tu arrives a getfilm de filmDAo");
        session = HibernateUtil.getSessionFactory().openSession();
        return (session.get(Film.class,id));
    }

    public static List<Film> getFilms() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (session.createQuery("FROM Film", Film.class).getResultList());
    }

    public void ajoutFilm(Film film) {
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        session.persist(film);
        trans.commit();
    }

    public void supprFilm(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Film film = new Film();
        trans = session.beginTransaction();
        film.setId(id);
        session.delete(film);
        trans.commit();
    }

    public void updateFilm(Film film) {
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        session.update(film);
        trans.commit();
    }
}
