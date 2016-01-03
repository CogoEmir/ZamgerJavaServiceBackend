package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "preference", schema = "zamger", catalog = "")
public class PreferenceEntity {
    private int id;
    private int korisnik;
    private String preferenca;
    private String vrijednost;


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "korisnik")
    public int getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(int korisnik) {
        this.korisnik = korisnik;
    }

    @Basic
    @Column(name = "preferenca")
    public String getPreferenca() {
        return preferenca;
    }

    public void setPreferenca(String preferenca) {
        this.preferenca = preferenca;
    }

    @Basic
    @Column(name = "vrijednost")
    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreferenceEntity that = (PreferenceEntity) o;

        if (korisnik != that.korisnik) return false;
        if (preferenca != null ? !preferenca.equals(that.preferenca) : that.preferenca != null) return false;
        if (vrijednost != null ? !vrijednost.equals(that.vrijednost) : that.vrijednost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = korisnik;
        result = 31 * result + (preferenca != null ? preferenca.hashCode() : 0);
        result = 31 * result + (vrijednost != null ? vrijednost.hashCode() : 0);
        return result;
    }
}
