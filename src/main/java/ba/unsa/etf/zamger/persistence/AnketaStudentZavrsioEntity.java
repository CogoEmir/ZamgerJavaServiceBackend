package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_student_zavrsio", schema = "zamger", catalog = "")
@IdClass(AnketaStudentZavrsioEntityPK.class)
public class AnketaStudentZavrsioEntity {
    private int student;
    private int predmet;
    private int akademskaGodina;
    private int anketa;
    private Date zavrsena;
    private int anketaRezultat;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

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
    @Column(name = "anketa")
    public int getAnketa() {
        return anketa;
    }

    public void setAnketa(int anketa) {
        this.anketa = anketa;
    }

    @Basic
    @Column(name = "zavrsena")
    public Date getZavrsena() {
        return zavrsena;
    }

    public void setZavrsena(Date zavrsena) {
        this.zavrsena = zavrsena;
    }

    @Basic
    @Column(name = "anketa_rezultat")
    public int getAnketaRezultat() {
        return anketaRezultat;
    }

    public void setAnketaRezultat(int anketaRezultat) {
        this.anketaRezultat = anketaRezultat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaStudentZavrsioEntity that = (AnketaStudentZavrsioEntity) o;

        if (student != that.student) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (anketa != that.anketa) return false;
        if (anketaRezultat != that.anketaRezultat) return false;
        if (zavrsena != null ? !zavrsena.equals(that.zavrsena) : that.zavrsena != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + anketa;
        result = 31 * result + (zavrsena != null ? zavrsena.hashCode() : 0);
        result = 31 * result + anketaRezultat;
        return result;
    }
}
