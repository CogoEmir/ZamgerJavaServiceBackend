package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "tipkomponente", schema = "zamger", catalog = "")
public class TipkomponenteEntity {
    private int id;
    private String naziv;
    private String opisOpcija;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "opis_opcija")
    public String getOpisOpcija() {
        return opisOpcija;
    }

    public void setOpisOpcija(String opisOpcija) {
        this.opisOpcija = opisOpcija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipkomponenteEntity that = (TipkomponenteEntity) o;

        if (id != that.id) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (opisOpcija != null ? !opisOpcija.equals(that.opisOpcija) : that.opisOpcija != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (opisOpcija != null ? opisOpcija.hashCode() : 0);
        return result;
    }
}
