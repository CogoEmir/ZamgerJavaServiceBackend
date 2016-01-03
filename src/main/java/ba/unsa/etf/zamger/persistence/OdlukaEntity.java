package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "odluka", schema = "zamger", catalog = "")
public class OdlukaEntity {
    private int id;
    private Date datum;
    private String brojProtokola;
    private int student;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "broj_protokola")
    public String getBrojProtokola() {
        return brojProtokola;
    }

    public void setBrojProtokola(String brojProtokola) {
        this.brojProtokola = brojProtokola;
    }

    @Basic
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OdlukaEntity that = (OdlukaEntity) o;

        if (id != that.id) return false;
        if (student != that.student) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (brojProtokola != null ? !brojProtokola.equals(that.brojProtokola) : that.brojProtokola != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (brojProtokola != null ? brojProtokola.hashCode() : 0);
        result = 31 * result + student;
        return result;
    }
}
