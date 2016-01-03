package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class StudentskiModulPredmetEntityPK implements Serializable {
    private int predmet;
    private int akademskaGodina;
    private int studentskiModul;

    @Column(name = "predmet")
    @Id
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Column(name = "akademska_godina")
    @Id
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Column(name = "studentski_modul")
    @Id
    public int getStudentskiModul() {
        return studentskiModul;
    }

    public void setStudentskiModul(int studentskiModul) {
        this.studentskiModul = studentskiModul;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentskiModulPredmetEntityPK that = (StudentskiModulPredmetEntityPK) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (studentskiModul != that.studentskiModul) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + studentskiModul;
        return result;
    }
}
