package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_usavrsavanje", schema = "zamger", catalog = "")
public class HrUsavrsavanjeEntity {
    private int id;
    private int fkOsoba;
    private Date datum;
    private int nazivUsavrsavanja;
    private int obrazovnaInstitucija;
    private int kvalifikacija;

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
    @Column(name = "datum")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "naziv_usavrsavanja")
    public int getNazivUsavrsavanja() {
        return nazivUsavrsavanja;
    }

    public void setNazivUsavrsavanja(int nazivUsavrsavanja) {
        this.nazivUsavrsavanja = nazivUsavrsavanja;
    }

    @Basic
    @Column(name = "obrazovna_institucija")
    public int getObrazovnaInstitucija() {
        return obrazovnaInstitucija;
    }

    public void setObrazovnaInstitucija(int obrazovnaInstitucija) {
        this.obrazovnaInstitucija = obrazovnaInstitucija;
    }

    @Basic
    @Column(name = "kvalifikacija")
    public int getKvalifikacija() {
        return kvalifikacija;
    }

    public void setKvalifikacija(int kvalifikacija) {
        this.kvalifikacija = kvalifikacija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrUsavrsavanjeEntity that = (HrUsavrsavanjeEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (nazivUsavrsavanja != that.nazivUsavrsavanja) return false;
        if (obrazovnaInstitucija != that.obrazovnaInstitucija) return false;
        if (kvalifikacija != that.kvalifikacija) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + nazivUsavrsavanja;
        result = 31 * result + obrazovnaInstitucija;
        result = 31 * result + kvalifikacija;
        return result;
    }
}
