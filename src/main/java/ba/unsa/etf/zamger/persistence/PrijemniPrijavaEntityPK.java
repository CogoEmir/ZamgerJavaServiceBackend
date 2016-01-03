package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class PrijemniPrijavaEntityPK implements Serializable {
    private int prijemniTermin;
    private int osoba;

    @Column(name = "prijemni_termin")
    @Id
    public int getPrijemniTermin() {
        return prijemniTermin;
    }

    public void setPrijemniTermin(int prijemniTermin) {
        this.prijemniTermin = prijemniTermin;
    }

    @Column(name = "osoba")
    @Id
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrijemniPrijavaEntityPK that = (PrijemniPrijavaEntityPK) o;

        if (prijemniTermin != that.prijemniTermin) return false;
        if (osoba != that.osoba) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prijemniTermin;
        result = 31 * result + osoba;
        return result;
    }
}
