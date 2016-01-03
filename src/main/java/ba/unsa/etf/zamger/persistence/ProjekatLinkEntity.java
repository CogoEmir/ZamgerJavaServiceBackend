package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "projekat_link", schema = "zamger", catalog = "")
public class ProjekatLinkEntity {
    private int id;
    private String naziv;
    private String url;
    private String opis;
    private int projekat;
    private int osoba;
    private Timestamp vrijeme;

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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "projekat")
    public int getProjekat() {
        return projekat;
    }

    public void setProjekat(int projekat) {
        this.projekat = projekat;
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
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjekatLinkEntity that = (ProjekatLinkEntity) o;

        if (id != that.id) return false;
        if (projekat != that.projekat) return false;
        if (osoba != that.osoba) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + projekat;
        result = 31 * result + osoba;
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        return result;
    }
}
