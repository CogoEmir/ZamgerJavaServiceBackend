package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_publikacija", schema = "zamger", catalog = "")
public class HrPublikacijaEntity {
    private int id;
    private int fkOsoba;
    private int fkTipPublikacije;
    private Date datum;
    private String naziv;
    private String casopis;

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
    @Column(name = "fk_tip_publikacije")
    public int getFkTipPublikacije() {
        return fkTipPublikacije;
    }

    public void setFkTipPublikacije(int fkTipPublikacije) {
        this.fkTipPublikacije = fkTipPublikacije;
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
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "casopis")
    public String getCasopis() {
        return casopis;
    }

    public void setCasopis(String casopis) {
        this.casopis = casopis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrPublikacijaEntity that = (HrPublikacijaEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (fkTipPublikacije != that.fkTipPublikacije) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (casopis != null ? !casopis.equals(that.casopis) : that.casopis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + fkTipPublikacije;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (casopis != null ? casopis.hashCode() : 0);
        return result;
    }
}
