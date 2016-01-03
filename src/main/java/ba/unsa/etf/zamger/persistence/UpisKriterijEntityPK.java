package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class UpisKriterijEntityPK implements Serializable {
    private int prijemniTermin;
    private int studij;

    @Column(name = "prijemni_termin")
    @Id
    public int getPrijemniTermin() {
        return prijemniTermin;
    }

    public void setPrijemniTermin(int prijemniTermin) {
        this.prijemniTermin = prijemniTermin;
    }

    @Column(name = "studij")
    @Id
    public int getStudij() {
        return studij;
    }

    public void setStudij(int studij) {
        this.studij = studij;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpisKriterijEntityPK that = (UpisKriterijEntityPK) o;

        if (prijemniTermin != that.prijemniTermin) return false;
        if (studij != that.studij) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prijemniTermin;
        result = 31 * result + studij;
        return result;
    }
}
