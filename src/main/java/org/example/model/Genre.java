package org.example.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    private String type;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Film> films = new ArrayList<Film>();

    public Genre(String genre) {
        this.type = genre;
    }
    public Genre() {}

    public int getId() {
        return id;
    }

    public String getGenre() {
        return type;
    }

    public void setGenre(String genre) {
        this.type = genre;
    }

    public void setId(int id) {
        this.id = id;
    }
}
