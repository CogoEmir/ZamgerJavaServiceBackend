package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class StudentIspitTerminEntityPK implements Serializable {
    private int student;
    private int ispitTermin;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "ispit_termin")
    @Id
    public int getIspitTermin() {
        return ispitTermin;
    }

    public void setIspitTermin(int ispitTermin) {
        this.ispitTermin = ispitTermin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentIspitTerminEntityPK that = (StudentIspitTerminEntityPK) o;

        if (student != that.student) return false;
        if (ispitTermin != that.ispitTermin) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + ispitTermin;
        return result;
    }
}
