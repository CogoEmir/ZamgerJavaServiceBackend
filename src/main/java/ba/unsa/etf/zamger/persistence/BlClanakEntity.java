package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "bl_clanak", schema = "zamger", catalog = "")
public class BlClanakEntity {
    private int id;
    private String naslov;
    private String tekst;
    private String slika;
    private Timestamp vrijeme;
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
    @Column(name = "naslov")
    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    @Basic
    @Column(name = "tekst")
    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Basic
    @Column(name = "slika")
    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
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

        BlClanakEntity that = (BlClanakEntity) o;

        if (id != that.id) return false;
        if (osoba != that.osoba) return false;
        if (projekat != that.projekat) return false;
        if (naslov != null ? !naslov.equals(that.naslov) : that.naslov != null) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;
        if (slika != null ? !slika.equals(that.slika) : that.slika != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naslov != null ? naslov.hashCode() : 0);
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        result = 31 * result + (slika != null ? slika.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + osoba;
        result = 31 * result + projekat;
        return result;
    }
}
