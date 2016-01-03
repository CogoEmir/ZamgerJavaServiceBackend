package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "student_studij", schema = "zamger", catalog = "")
@IdClass(StudentStudijEntityPK.class)
public class StudentStudijEntity {
    private int student;
    private int studij;
    private int semestar;
    private int akademskaGodina;
    private int nacinStudiranja;
    private byte ponovac;
    private int odluka;
    private int planStudija;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "studij")
    public int getStudij() {
        return studij;
    }

    public void setStudij(int studij) {
        this.studij = studij;
    }

    @Id
    @Column(name = "semestar")
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Id
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "nacin_studiranja")
    public int getNacinStudiranja() {
        return nacinStudiranja;
    }

    public void setNacinStudiranja(int nacinStudiranja) {
        this.nacinStudiranja = nacinStudiranja;
    }

    @Basic
    @Column(name = "ponovac")
    public byte getPonovac() {
        return ponovac;
    }

    public void setPonovac(byte ponovac) {
        this.ponovac = ponovac;
    }

    @Basic
    @Column(name = "odluka")
    public int getOdluka() {
        return odluka;
    }

    public void setOdluka(int odluka) {
        this.odluka = odluka;
    }

    @Basic
    @Column(name = "plan_studija")
    public int getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(int planStudija) {
        this.planStudija = planStudija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentStudijEntity that = (StudentStudijEntity) o;

        if (student != that.student) return false;
        if (studij != that.studij) return false;
        if (semestar != that.semestar) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (nacinStudiranja != that.nacinStudiranja) return false;
        if (ponovac != that.ponovac) return false;
        if (odluka != that.odluka) return false;
        if (planStudija != that.planStudija) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + studij;
        result = 31 * result + semestar;
        result = 31 * result + akademskaGodina;
        result = 31 * result + nacinStudiranja;
        result = 31 * result + (int) ponovac;
        result = 31 * result + odluka;
        result = 31 * result + planStudija;
        return result;
    }
}
