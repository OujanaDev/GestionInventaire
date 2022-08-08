package model;


import java.time.LocalDateTime;
import java.util.Date;

public class Inventaire {

    private int inventaire_id;
    private int Product_id;
    private int Magasin_id;
    private LocalDateTime update;

    public Inventaire() {
    }

    public int getMagasin_id() {
        return Magasin_id;
    }

    public void setMagasin_id(int magasin_id) {
        Magasin_id = magasin_id;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }
}
