package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class IspitocjeneEntityPK implements Serializable {
    private int ispit;
    private int student;

    @Column(name = "ispit")
    @Id
    public int getIspit() {
        return ispit;
    }

    public void setIspit(int ispit) {
        this.ispit = ispit;
    }

    @Column(name = "student")
    @Id
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

        IspitocjeneEntityPK that = (IspitocjeneEntityPK) o;

        if (ispit != that.ispit) return false;
        if (student != that.student) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ispit;
        result = 31 * result + student;
        return result;
    }
}
