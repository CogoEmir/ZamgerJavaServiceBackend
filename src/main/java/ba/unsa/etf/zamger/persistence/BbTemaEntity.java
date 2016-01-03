package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "bb_tema", schema = "zamger", catalog = "")
public class BbTemaEntity {
    private int id;
    private Timestamp vrijeme;
    private int prviPost;
    private int zadnjiPost;
    private int pregleda;
    private int osoba;
    private int projekat;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Basic
    @Column(name = "prvi_post")
    public int getPrviPost() {
        return prviPost;
    }

    public void setPrviPost(int prviPost) {
        this.prviPost = prviPost;
    }

    @Basic
    @Column(name = "zadnji_post")
    public int getZadnjiPost() {
        return zadnjiPost;
    }

    public void setZadnjiPost(int zadnjiPost) {
        this.zadnjiPost = zadnjiPost;
    }

    @Basic
    @Column(name = "pregleda")
    public int getPregleda() {
        return pregleda;
    }

    public void setPregleda(int pregleda) {
        this.pregleda = pregleda;
    }

    @Basic
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "projekat")
    public int getProjekat() {
        return projekat;
    }

    public void setProjekat(int projekat) {
        this.projekat = projekat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BbTemaEntity that = (BbTemaEntity) o;

        if (id != that.id) return false;
        if (prviPost != that.prviPost) return false;
        if (zadnjiPost != that.zadnjiPost) return false;
        if (pregleda != that.pregleda) return false;
        if (osoba != that.osoba) return false;
        if (projekat != that.projekat) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + prviPost;
        result = 31 * result + zadnjiPost;
        result = 31 * result + pregleda;
        result = 31 * result + osoba;
        result = 31 * result + projekat;
        return result;
    }
}
