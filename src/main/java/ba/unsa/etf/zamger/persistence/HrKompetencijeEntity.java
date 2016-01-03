package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "hr_kompetencije", schema = "zamger", catalog = "")
public class HrKompetencijeEntity {
    private int id;
    private int fkOsoba;
    private int jezik;
    private String naziv;
    private String razumjevanje;
    private String govor;
    private String pisanje;

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
    @Column(name = "jezik")
    public int getJezik() {
        return jezik;
    }

    public void setJezik(int jezik) {
        this.jezik = jezik;
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
    @Column(name = "razumjevanje")
    public String getRazumjevanje() {
        return razumjevanje;
    }

    public void setRazumjevanje(String razumjevanje) {
        this.razumjevanje = razumjevanje;
    }

    @Basic
    @Column(name = "govor")
    public String getGovor() {
        return govor;
    }

    public void setGovor(String govor) {
        this.govor = govor;
    }

    @Basic
    @Column(name = "pisanje")
    public String getPisanje() {
        return pisanje;
    }

    public void setPisanje(String pisanje) {
        this.pisanje = pisanje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HrKompetencijeEntity that = (HrKompetencijeEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (jezik != that.jezik) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (razumjevanje != null ? !razumjevanje.equals(that.razumjevanje) : that.razumjevanje != null) return false;
        if (govor != null ? !govor.equals(that.govor) : that.govor != null) return false;
        if (pisanje != null ? !pisanje.equals(that.pisanje) : that.pisanje != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + jezik;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (razumjevanje != null ? razumjevanje.hashCode() : 0);
        result = 31 * result + (govor != null ? govor.hashCode() : 0);
        result = 31 * result + (pisanje != null ? pisanje.hashCode() : 0);
        return result;
    }
}
