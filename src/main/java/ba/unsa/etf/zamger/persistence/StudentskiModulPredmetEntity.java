package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "studentski_modul_predmet", schema = "zamger", catalog = "")
@IdClass(StudentskiModulPredmetEntityPK.class)
public class StudentskiModulPredmetEntity {
    private int predmet;
    private int akademskaGodina;
    private int studentskiModul;
    private byte aktivan;

    @Id
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Id
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Id
    @Column(name = "studentski_modul")
    public int getStudentskiModul() {
        return studentskiModul;
    }

    public void setStudentskiModul(int studentskiModul) {
        this.studentskiModul = studentskiModul;
    }

    @Basic
    @Column(name = "aktivan")
    public byte getAktivan() {
        return aktivan;
    }

    public void setAktivan(byte aktivan) {
        this.aktivan = aktivan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentskiModulPredmetEntity that = (StudentskiModulPredmetEntity) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (studentskiModul != that.studentskiModul) return false;
        if (aktivan != that.aktivan) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + studentskiModul;
        result = 31 * result + (int) aktivan;
        return result;
    }
}
