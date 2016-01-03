package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class SrednjaOcjeneEntityPK implements Serializable {
    private int osoba;
    private byte razred;
    private int redniBroj;

    @Column(name = "osoba")
    @Id
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Column(name = "razred")
    @Id
    public byte getRazred() {
        return razred;
    }

    public void setRazred(byte razred) {
        this.razred = razred;
    }

    @Column(name = "redni_broj")
    @Id
    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SrednjaOcjeneEntityPK that = (SrednjaOcjeneEntityPK) o;

        if (osoba != that.osoba) return false;
        if (razred != that.razred) return false;
        if (redniBroj != that.redniBroj) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = osoba;
        result = 31 * result + (int) razred;
        result = 31 * result + redniBroj;
        return result;
    }
}
