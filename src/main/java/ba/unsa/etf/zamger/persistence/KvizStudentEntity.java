package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kviz_student", schema = "zamger", catalog = "")
@IdClass(KvizStudentEntityPK.class)
public class KvizStudentEntity {
    private int student;
    private int kviz;
    private byte dovrsen;
    private double bodova;
    private Date vrijemeAktivacije;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "kviz")
    public int getKviz() {
        return kviz;
    }

    public void setKviz(int kviz) {
        this.kviz = kviz;
    }

    @Basic
    @Column(name = "dovrsen")
    public byte getDovrsen() {
        return dovrsen;
    }

    public void setDovrsen(byte dovrsen) {
        this.dovrsen = dovrsen;
    }

    @Basic
    @Column(name = "bodova")
    public double getBodova() {
        return bodova;
    }

    public void setBodova(double bodova) {
        this.bodova = bodova;
    }

    @Basic
    @Column(name = "vrijeme_aktivacije")
    public Date getVrijemeAktivacije() {
        return vrijemeAktivacije;
    }

    public void setVrijemeAktivacije(Date vrijemeAktivacije) {
        this.vrijemeAktivacije = vrijemeAktivacije;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KvizStudentEntity that = (KvizStudentEntity) o;

        if (student != that.student) return false;
        if (kviz != that.kviz) return false;
        if (dovrsen != that.dovrsen) return false;
        if (Double.compare(that.bodova, bodova) != 0) return false;
        if (vrijemeAktivacije != null ? !vrijemeAktivacije.equals(that.vrijemeAktivacije) : that.vrijemeAktivacije != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = student;
        result = 31 * result + kviz;
        result = 31 * result + (int) dovrsen;
        temp = Double.doubleToLongBits(bodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (vrijemeAktivacije != null ? vrijemeAktivacije.hashCode() : 0);
        return result;
    }
}
