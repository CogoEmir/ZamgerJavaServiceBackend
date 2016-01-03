package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_radno_iskustvo", schema = "zamger", catalog = "")
public class HrRadnoIskustvoEntity {
    private int id;
    private int fkOsoba;
    private Date datumPocetka;
    private Date datumKraja;
    private String poslodavac;
    private String adresaPoslodavca;
    private String radnoMjesto;
    private String radnoMjestoEn;
    private String opisRadnogMjesta;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fk_osoba")
    public int getFkOsoba() {
        return fkOsoba;
    }

    public void setFkOsoba(int fkOsoba) {
        this.fkOsoba = fkOsoba;
    }

    @Basic
    @Column(name = "datum_pocetka")
    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    @Basic
    @Column(name = "datum_kraja")
    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    @Basic
    @Column(name = "poslodavac")
    public String getPoslodavac() {
        return poslodavac;
    }

    public void setPoslodavac(String poslodavac) {
        this.poslodavac = poslodavac;
    }

    @Basic
    @Column(name = "adresa_poslodavca")
    public String getAdresaPoslodavca() {
        return adresaPoslodavca;
    }

    public void setAdresaPoslodavca(String adresaPoslodavca) {
        this.adresaPoslodavca = adresaPoslodavca;
    }

    @Basic
    @Column(name = "radno_mjesto")
    public String getRadnoMjesto() {
        return radnoMjesto;
    }

    public void setRadnoMjesto(String radnoMjesto) {
        this.radnoMjesto = radnoMjesto;
    }

    @Basic
    @Column(name = "radno_mjesto_en")
    public String getRadnoMjestoEn() {
        return radnoMjestoEn;
    }

    public void setRadnoMjestoEn(String radnoMjestoEn) {
        this.radnoMjestoEn = radnoMjestoEn;
    }

    @Basic
    @Column(name = "opis_radnog_mjesta")
    public String getOpisRadnogMjesta() {
        return opisRadnogMjesta;
    }

    public void setOpisRadnogMjesta(String opisRadnogMjesta) {
        this.opisRadnogMjesta = opisRadnogMjesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrRadnoIskustvoEntity that = (HrRadnoIskustvoEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (datumPocetka != null ? !datumPocetka.equals(that.datumPocetka) : that.datumPocetka != null) return false;
        if (datumKraja != null ? !datumKraja.equals(that.datumKraja) : that.datumKraja != null) return false;
        if (poslodavac != null ? !poslodavac.equals(that.poslodavac) : that.poslodavac != null) return false;
        if (adresaPoslodavca != null ? !adresaPoslodavca.equals(that.adresaPoslodavca) : that.adresaPoslodavca != null)
            return false;
        if (radnoMjesto != null ? !radnoMjesto.equals(that.radnoMjesto) : that.radnoMjesto != null) return false;
        if (radnoMjestoEn != null ? !radnoMjestoEn.equals(that.radnoMjestoEn) : that.radnoMjestoEn != null)
            return false;
        if (opisRadnogMjesta != null ? !opisRadnogMjesta.equals(that.opisRadnogMjesta) : that.opisRadnogMjesta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + (datumPocetka != null ? datumPocetka.hashCode() : 0);
        result = 31 * result + (datumKraja != null ? datumKraja.hashCode() : 0);
        result = 31 * result + (poslodavac != null ? poslodavac.hashCode() : 0);
        result = 31 * result + (adresaPoslodavca != null ? adresaPoslodavca.hashCode() : 0);
        result = 31 * result + (radnoMjesto != null ? radnoMjesto.hashCode() : 0);
        result = 31 * result + (radnoMjestoEn != null ? radnoMjestoEn.hashCode() : 0);
        result = 31 * result + (opisRadnogMjesta != null ? opisRadnogMjesta.hashCode() : 0);
        return result;
    }
}
