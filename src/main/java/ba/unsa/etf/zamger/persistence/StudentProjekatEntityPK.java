package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class StudentProjekatEntityPK implements Serializable {
    private int student;
    private int projekat;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "projekat")
    @Id
    public int getProjekat() {
        return projekat;
    }

    public void setProjekat(int projekat) {
        this.projekat = projekat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentProjekatEntityPK that = (StudentProjekatEntityPK) o;

        if (student != that.student) return false;
        if (projekat != that.projekat) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + projekat;
        return result;
    }
}
