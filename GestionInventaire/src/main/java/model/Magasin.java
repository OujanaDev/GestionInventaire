package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String ville;

    @Column
    private String directeur_personnel;

    @Column
    private Date Dateofupdated;

    public Magasin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDirecteur_personnel() {
        return directeur_personnel;
    }

    public void setDirecteur_personnel(String directeur_personnel) {
        this.directeur_personnel = directeur_personnel;
    }

    public Date getDateofupdated() {
        return Dateofupdated;
    }

    public void setDateofupdated(Date dateofupdated) {
        Dateofupdated = dateofupdated;
    }
}
