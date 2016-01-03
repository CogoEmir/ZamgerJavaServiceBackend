package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class StudentLabgrupaEntityPK implements Serializable {
    private int student;
    private int labgrupa;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "labgrupa")
    @Id
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentLabgrupaEntityPK that = (StudentLabgrupaEntityPK) o;

        if (student != that.student) return false;
        if (labgrupa != that.labgrupa) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + labgrupa;
        return result;
    }
}
