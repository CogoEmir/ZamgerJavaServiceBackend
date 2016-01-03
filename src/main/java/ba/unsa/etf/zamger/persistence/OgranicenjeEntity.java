package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ogranicenje", schema = "zamger", catalog = "")
@IdClass(OgranicenjeEntityPK.class)
public class OgranicenjeEntity {
    private int nastavnik;
    private int labgrupa;
    private int zavrsnirad;

    @Id
    @Column(name = "nastavnik")
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
    }

    @Id
    @Column(name = "labgrupa")
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Basic
    @Column(name = "zavrsnirad")
    public int getZavrsnirad() {
        return zavrsnirad;
    }

    public void setZavrsnirad(int zavrsnirad) {
        this.zavrsnirad = zavrsnirad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OgranicenjeEntity that = (OgranicenjeEntity) o;

        if (nastavnik != that.nastavnik) return false;
        if (labgrupa != that.labgrupa) return false;
        if (zavrsnirad != that.zavrsnirad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nastavnik;
        result = 31 * result + labgrupa;
        result = 31 * result + zavrsnirad;
        return result;
    }
}
