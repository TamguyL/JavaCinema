package org.example.model;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ActeurDAO {

    Session session=null ;
    Transaction trans;

    public static Acteur getActeur(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (session.get(Acteur.class,id));
    }

    public static List<Acteur> getActeurs() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (session.createQuery("FROM Acteur", Acteur.class).getResultList());
    }

    public void ajoutActeur(Acteur act) {
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        session.persist(act);
        trans.commit();
    }

    public void supprActeur(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Acteur acteur = new Acteur();
        trans = session.beginTransaction();
        acteur.setId(id);
        session.delete(acteur);
        trans.commit();
    }

    public void updateActeur(Acteur act) {
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        session.update(act);
        trans.commit();
    }

}