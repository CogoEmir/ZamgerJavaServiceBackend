package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_mentorstvo", schema = "zamger", catalog = "")
public class HrMentorstvoEntity {
    private int id;
    private int fkOsoba;
    private int fkFakultet;
    private int fkVrstaMentora;
    private Date datum;
    private String imeKandidata;
    private String nazivTeme;

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
    @Column(name = "fk_fakultet")
    public int getFkFakultet() {
        return fkFakultet;
    }

    public void setFkFakultet(int fkFakultet) {
        this.fkFakultet = fkFakultet;
    }

    @Basic
    @Column(name = "fk_vrsta_mentora")
    public int getFkVrstaMentora() {
        return fkVrstaMentora;
    }

    public void setFkVrstaMentora(int fkVrstaMentora) {
        this.fkVrstaMentora = fkVrstaMentora;
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
    @Column(name = "ime_kandidata")
    public String getImeKandidata() {
        return imeKandidata;
    }

    public void setImeKandidata(String imeKandidata) {
        this.imeKandidata = imeKandidata;
    }

    @Basic
    @Column(name = "naziv_teme")
    public String getNazivTeme() {
        return nazivTeme;
    }

    public void setNazivTeme(String nazivTeme) {
        this.nazivTeme = nazivTeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrMentorstvoEntity that = (HrMentorstvoEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (fkFakultet != that.fkFakultet) return false;
        if (fkVrstaMentora != that.fkVrstaMentora) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (imeKandidata != null ? !imeKandidata.equals(that.imeKandidata) : that.imeKandidata != null) return false;
        if (nazivTeme != null ? !nazivTeme.equals(that.nazivTeme) : that.nazivTeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + fkFakultet;
        result = 31 * result + fkVrstaMentora;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (imeKandidata != null ? imeKandidata.hashCode() : 0);
        result = 31 * result + (nazivTeme != null ? nazivTeme.hashCode() : 0);
        return result;
    }
}
