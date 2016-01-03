package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_naucni_radovi", schema = "zamger", catalog = "")
public class HrNaucniRadoviEntity {
    private int id;
    private int fkOsoba;
    private Date datum;
    private String nazivRada;
    private String nazivCasopisa;
    private String nazivIzdavaca;

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
    @Column(name = "naziv_rada")
    public String getNazivRada() {
        return nazivRada;
    }

    public void setNazivRada(String nazivRada) {
        this.nazivRada = nazivRada;
    }

    @Basic
    @Column(name = "naziv_casopisa")
    public String getNazivCasopisa() {
        return nazivCasopisa;
    }

    public void setNazivCasopisa(String nazivCasopisa) {
        this.nazivCasopisa = nazivCasopisa;
    }

    @Basic
    @Column(name = "naziv_izdavaca")
    public String getNazivIzdavaca() {
        return nazivIzdavaca;
    }

    public void setNazivIzdavaca(String nazivIzdavaca) {
        this.nazivIzdavaca = nazivIzdavaca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrNaucniRadoviEntity that = (HrNaucniRadoviEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (nazivRada != null ? !nazivRada.equals(that.nazivRada) : that.nazivRada != null) return false;
        if (nazivCasopisa != null ? !nazivCasopisa.equals(that.nazivCasopisa) : that.nazivCasopisa != null)
            return false;
        if (nazivIzdavaca != null ? !nazivIzdavaca.equals(that.nazivIzdavaca) : that.nazivIzdavaca != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (nazivRada != null ? nazivRada.hashCode() : 0);
        result = 31 * result + (nazivCasopisa != null ? nazivCasopisa.hashCode() : 0);
        result = 31 * result + (nazivIzdavaca != null ? nazivIzdavaca.hashCode() : 0);
        return result;
    }
}
