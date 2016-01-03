package ba.unsa.etf.zamger.persistence;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by CogoEmir on 1/3/2016.
 */
public class KvizStudentEntityPK implements Serializable {
    private int student;
    private int kviz;

    @Column(name = "student")
    @Id
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Column(name = "kviz")
    @Id
    public int getKviz() {
        return kviz;
    }

    public void setKviz(int kviz) {
        this.kviz = kviz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KvizStudentEntityPK that = (KvizStudentEntityPK) o;

        if (student != that.student) return false;
        if (kviz != that.kviz) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + kviz;
        return result;
    }
}
