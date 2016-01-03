package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class StudentStudijEntityPK implements Serializable {
    private int student;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    private int studij;

    @Column(name = "studij")
    @Id
    public int getStudij() {
        return studij;
    }

    public void setStudij(int studij) {
        this.studij = studij;
    }

    private int semestar;

    @Column(name = "semestar")
    @Id
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentStudijEntityPK that = (StudentStudijEntityPK) o;

        if (student != that.student) return false;
        if (studij != that.studij) return false;
        if (semestar != that.semestar) return false;
        if (akademskaGodina != that.akademskaGodina) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + studij;
        result = 31 * result + semestar;
        result = 31 * result + akademskaGodina;
        return result;
    }
}
