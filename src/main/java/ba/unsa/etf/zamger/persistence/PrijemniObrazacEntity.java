package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prijemni_obrazac", schema = "zamger", catalog = "")
public class PrijemniObrazacEntity {
    private int prijemniTermin;
    private int osoba;
    private String sifra;
    private String jezik;
    private int id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "prijemni_termin")
    public int getPrijemniTermin() {
        return prijemniTermin;
    }

    public void setPrijemniTermin(int prijemniTermin) {
        this.prijemniTermin = prijemniTermin;
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
    @Column(name = "sifra")
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    @Basic
    @Column(name = "jezik")
    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrijemniObrazacEntity that = (PrijemniObrazacEntity) o;

        if (prijemniTermin != that.prijemniTermin) return false;
        if (osoba != that.osoba) return false;
        if (sifra != null ? !sifra.equals(that.sifra) : that.sifra != null) return false;
        if (jezik != null ? !jezik.equals(that.jezik) : that.jezik != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prijemniTermin;
        result = 31 * result + osoba;
        result = 31 * result + (sifra != null ? sifra.hashCode() : 0);
        result = 31 * result + (jezik != null ? jezik.hashCode() : 0);
        return result;
    }
}
