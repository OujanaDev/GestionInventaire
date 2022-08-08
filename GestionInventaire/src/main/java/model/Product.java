//class Prodcut= class Matériel
package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column
    private String nom;

    @Column
    private String description;

    @Column
    private String marque;

    @Column
    private String image_url;

    @Column
    private List taille;

    @Column
    private int duree_location;

    @Column
    private double cout_location;

    @Column
    private double cout_remplacement;

    @Column
    private Date dateofupdate;

    public Product() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List getTaille() {
        return taille;
    }

    public void setTaille(List taille) {
        this.taille = taille;
    }

    public int getDuree_location() {
        return duree_location;
    }

    public void setDuree_location(int duree_location) {
        this.duree_location = duree_location;
    }

    public double getCout_location() {
        return cout_location;
    }

    public void setCout_location(double cout_location) {
        this.cout_location = cout_location;
    }

    public double getCout_remplacement() {
        return cout_remplacement;
    }

    public void setCout_remplacement(double cout_remplacement) {
        this.cout_remplacement = cout_remplacement;
    }

    public Date getDateofupdate() {
        return dateofupdate;
    }

    public void setDateofupdate(Date dateofupdate) {
        this.dateofupdate = dateofupdate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", marque='" + marque + '\'' +
                ", image_url='" + image_url + '\'' +
                ", taille=" + taille +
                ", duree_location=" + duree_location +
                ", cout_location=" + cout_location +
                ", cout_remplacement=" + cout_remplacement +
                ", dateofupdate=" + dateofupdate +
                '}';
    }
}
