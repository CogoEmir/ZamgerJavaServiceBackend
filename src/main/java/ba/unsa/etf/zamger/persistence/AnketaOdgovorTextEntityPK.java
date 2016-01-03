package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class AnketaOdgovorTextEntityPK implements Serializable {
    private int rezultat;
    private int pitanje;

    @Column(name = "rezultat")
    @Id
    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    @Column(name = "pitanje")
    @Id
    public int getPitanje() {
        return pitanje;
    }

    public void setPitanje(int pitanje) {
        this.pitanje = pitanje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaOdgovorTextEntityPK that = (AnketaOdgovorTextEntityPK) o;

        if (rezultat != that.rezultat) return false;
        if (pitanje != that.pitanje) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rezultat;
        result = 31 * result + pitanje;
        return result;
    }
}
