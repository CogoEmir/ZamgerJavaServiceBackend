package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kolizija", schema = "zamger", catalog = "")
public class KolizijaEntity {
    private int id;
    private int student;
    private int akademskaGodina;
    private int semestar;
    private int predmet;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "semestar")
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Basic
    @Column(name = "predmet")
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

        KolizijaEntity that = (KolizijaEntity) o;

        if (student != that.student) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (semestar != that.semestar) return false;
        if (predmet != that.predmet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + akademskaGodina;
        result = 31 * result + semestar;
        result = 31 * result + predmet;
        return result;
    }
}
