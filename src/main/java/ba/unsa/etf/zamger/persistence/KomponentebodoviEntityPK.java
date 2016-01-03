package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class KomponentebodoviEntityPK implements Serializable {
    private int student;
    private int predmet;
    private int komponenta;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "predmet")
    @Id
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Column(name = "komponenta")
    @Id
    public int getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(int komponenta) {
        this.komponenta = komponenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KomponentebodoviEntityPK that = (KomponentebodoviEntityPK) o;

        if (student != that.student) return false;
        if (predmet != that.predmet) return false;
        if (komponenta != that.komponenta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + predmet;
        result = 31 * result + komponenta;
        return result;
    }
}
