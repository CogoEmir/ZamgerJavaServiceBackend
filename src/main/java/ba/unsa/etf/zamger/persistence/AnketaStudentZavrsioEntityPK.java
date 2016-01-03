package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class AnketaStudentZavrsioEntityPK implements Serializable {
    private int student;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    private int predmet;

    @Column(name = "predmet")
    @Id
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    private int akademskaGodina;

    @Column(name = "akademska_godina")
    @Id
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    private int anketa;

    @Column(name = "anketa")
    @Id
    public int getAnketa() {
        return anketa;
    }

    public void setAnketa(int anketa) {
        this.anketa = anketa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaStudentZavrsioEntityPK that = (AnketaStudentZavrsioEntityPK) o;

        if (student != that.student) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (anketa != that.anketa) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + anketa;
        return result;
    }
}
