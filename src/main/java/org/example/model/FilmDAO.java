package org.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
    static Connection con = null;
    static PreparedStatement preparedStatement= null;

    public static void Dbconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection to mysql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcdcinema", "root", "");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static List<Film> getFilms() {
        List<Film> films = new ArrayList<>();
        String query = "SELECT * FROM film";
        try {
            Statement statement = con.createStatement();
            ResultSet rs= statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                Film film = new Film();
                film.setId(id);
                film.setTitre(rs.getString("titre"));
                film.setDescription(rs.getString("description"));
                film.setAffiche(rs.getString("affiche"));
                films.add(film);
            }
        } catch (Exception e) {System.out.println(e);}
        return films;
    }



    public static Film ajoutFilm(String titre, String description, String affiche) {
        try {
            String sqlInsert = "INSERT INTO film (titre,affiche,description) VALUES (?,?,?)";
            preparedStatement = con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,titre);
            preparedStatement.setString(2,affiche);
            preparedStatement.setString(3,description);
            preparedStatement.executeUpdate();
            System.out.println("Ajout de "+titre+" "+ description +" "+affiche+" avec succès.");
            preparedStatement.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    public static Film supprFilm(int id) {
        try {
            String sqlInsert = "DELETE FROM film WHERE id= ?";
            preparedStatement = con.prepareStatement(sqlInsert);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            System.out.println("La ligne avec l'Id : "+id+" a été supprimé avec succès.");
            preparedStatement.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    public static Film updateFilm(String colonne, String modif, int id) {
        try {
            String sqlInsert = "UPDATE film SET "+colonne+" = ? WHERE film.id= ?";
            preparedStatement = con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,modif);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
            System.out.println("La colonne "+colonne+" ayant l'id : "+id+"  a été modif avec : "+modif);
            preparedStatement.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
