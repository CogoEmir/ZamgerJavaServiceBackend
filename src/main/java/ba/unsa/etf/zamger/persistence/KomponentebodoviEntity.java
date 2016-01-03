package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "komponentebodovi", schema = "zamger", catalog = "")
@IdClass(KomponentebodoviEntityPK.class)
public class KomponentebodoviEntity {
    private int student;
    private int predmet;
    private int komponenta;
    private double bodovi;

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
    @Column(name = "komponenta")
    public int getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(int komponenta) {
        this.komponenta = komponenta;
    }

    @Basic
    @Column(name = "bodovi")
    public double getBodovi() {
        return bodovi;
    }

    public void setBodovi(double bodovi) {
        this.bodovi = bodovi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KomponentebodoviEntity that = (KomponentebodoviEntity) o;

        if (student != that.student) return false;
        if (predmet != that.predmet) return false;
        if (komponenta != that.komponenta) return false;
        if (Double.compare(that.bodovi, bodovi) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = student;
        result = 31 * result + predmet;
        result = 31 * result + komponenta;
        temp = Double.doubleToLongBits(bodovi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
