package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class AnketaOdgovorRankEntityPK implements Serializable {
    private int rezultat;
    private int pitanje;
    private int izborId;

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

    @Column(name = "izbor_id")
    @Id
    public int getIzborId() {
        return izborId;
    }

    public void setIzborId(int izborId) {
        this.izborId = izborId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaOdgovorRankEntityPK that = (AnketaOdgovorRankEntityPK) o;

        if (rezultat != that.rezultat) return false;
        if (pitanje != that.pitanje) return false;
        if (izborId != that.izborId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rezultat;
        result = 31 * result + pitanje;
        result = 31 * result + izborId;
        return result;
    }
}
