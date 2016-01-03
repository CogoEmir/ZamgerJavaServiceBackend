package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class AkademskaGodinaPredmetEntityPK implements Serializable {
    private int akademskaGodina;
    private int predmet;

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

        AkademskaGodinaPredmetEntityPK that = (AkademskaGodinaPredmetEntityPK) o;

        if (akademskaGodina != that.akademskaGodina) return false;
        if (predmet != that.predmet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = akademskaGodina;
        result = 31 * result + predmet;
        return result;
    }
}
