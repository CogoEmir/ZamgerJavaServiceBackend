package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "komentar", schema = "zamger", catalog = "")
public class KomentarEntity {
    private int id;
    private int student;
    private int nastavnik;
    private int labgrupa;
    private Date datum;
    private String komentar;

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
    @Column(name = "nastavnik")
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
    }

    @Basic
    @Column(name = "labgrupa")
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Basic
    @Column(name = "datum")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "komentar")
    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KomentarEntity that = (KomentarEntity) o;

        if (id != that.id) return false;
        if (student != that.student) return false;
        if (nastavnik != that.nastavnik) return false;
        if (labgrupa != that.labgrupa) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (komentar != null ? !komentar.equals(that.komentar) : that.komentar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + student;
        result = 31 * result + nastavnik;
        result = 31 * result + labgrupa;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (komentar != null ? komentar.hashCode() : 0);
        return result;
    }
}
