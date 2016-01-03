package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class NastavnikPredmetEntityPK implements Serializable {
    private int nastavnik;
    private int akademskaGodina;
    private int predmet;

    @Column(name = "nastavnik")
    @Id
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
    }

    @Column(name = "akademska_godina")
    @Id
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Column(name = "predmet")
    @Id
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NastavnikPredmetEntityPK that = (NastavnikPredmetEntityPK) o;

        if (nastavnik != that.nastavnik) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (predmet != that.predmet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nastavnik;
        result = 31 * result + akademskaGodina;
        result = 31 * result + predmet;
        return result;
    }
}
