package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class AutotestRezultatEntityPK implements Serializable {
    private int autotest;
    private int student;

    @Column(name = "autotest")
    @Id
    public int getAutotest() {
        return autotest;
    }

    public void setAutotest(int autotest) {
        this.autotest = autotest;
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

        AutotestRezultatEntityPK that = (AutotestRezultatEntityPK) o;

        if (autotest != that.autotest) return false;
        if (student != that.student) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autotest;
        result = 31 * result + student;
        return result;
    }
}
