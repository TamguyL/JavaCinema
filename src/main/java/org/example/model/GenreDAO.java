package org.example.model;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class GenreDAO {

    public GenreDAO() {
    }

    public List getGenres(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Genre> query = session.createQuery("From Genre" , Genre.class);
        List<Genre> genres = query.getResultList();
        return (genres);
    }
}
