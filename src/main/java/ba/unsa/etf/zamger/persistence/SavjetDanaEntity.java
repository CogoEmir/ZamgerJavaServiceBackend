package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "savjet_dana", schema = "zamger", catalog = "")
public class SavjetDanaEntity {
    private int id;
    private String tekst;
    private String vrstaKorisnika;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "vrsta_korisnika")
    public String getVrstaKorisnika() {
        return vrstaKorisnika;
    }

    public void setVrstaKorisnika(String vrstaKorisnika) {
        this.vrstaKorisnika = vrstaKorisnika;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavjetDanaEntity that = (SavjetDanaEntity) o;

        if (id != that.id) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;
        if (vrstaKorisnika != null ? !vrstaKorisnika.equals(that.vrstaKorisnika) : that.vrstaKorisnika != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        result = 31 * result + (vrstaKorisnika != null ? vrstaKorisnika.hashCode() : 0);
        return result;
    }
}
