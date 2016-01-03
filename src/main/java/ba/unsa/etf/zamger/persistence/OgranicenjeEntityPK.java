package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class OgranicenjeEntityPK implements Serializable {
    private int nastavnik;
    private int labgrupa;

    @Column(name = "nastavnik")
    @Id
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
    }

    @Column(name = "labgrupa")
    @Id
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OgranicenjeEntityPK that = (OgranicenjeEntityPK) o;

        if (nastavnik != that.nastavnik) return false;
        if (labgrupa != that.labgrupa) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nastavnik;
        result = 31 * result + labgrupa;
        return result;
    }
}
