package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class PrisustvoEntityPK implements Serializable {
    private int student;
    private int cas;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "cas")
    @Id
    public int getCas() {
        return cas;
    }

    public void setCas(int cas) {
        this.cas = cas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrisustvoEntityPK that = (PrisustvoEntityPK) o;

        if (student != that.student) return false;
        if (cas != that.cas) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + cas;
        return result;
    }
}
