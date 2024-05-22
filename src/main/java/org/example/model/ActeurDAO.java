package org.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActeurDAO {

    static Connection con = null;
    static PreparedStatement preparedStatement= null;

    public void Dbconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection to mysql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcdcinema", "root", "");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static List<Acteur> getActeurs() {
        List<Acteur> acteurs = new ArrayList<>();
        String query = "SELECT * FROM acteur";
        try {
            Statement statement = con.createStatement();
            ResultSet rs= statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                Acteur act = new Acteur();
                act.setId(id);
                act.setNom(rs.getString("nom"));
                act.setPrenom(rs.getString("prenom"));
                act.setPhoto(rs.getString("photo"));
                acteurs.add(act);
            }
        } catch (Exception e) {System.out.println(e);}
        return acteurs;
    }



    public static Acteur ajoutActeur(String nom, String prenom, String photo) {
        try {
            String sqlInsert = "INSERT INTO acteur (nom,prenom,photo) VALUES (?,?,?)";
            preparedStatement = con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setString(3,photo);
            preparedStatement.executeUpdate();
            System.out.println("Ajout de "+nom+" "+ prenom +" "+photo+" avec succès.");
            preparedStatement.close();
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    public static Acteur supprActeur(int id) {
        try {
            String sqlInsert = "DELETE FROM acteur WHERE id= ?";
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

    public static Acteur updateActeur(String colonne, String modif, int id) {
        try {
            String sqlInsert = "UPDATE acteur SET "+colonne+" = ? WHERE acteur.id= ?";
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