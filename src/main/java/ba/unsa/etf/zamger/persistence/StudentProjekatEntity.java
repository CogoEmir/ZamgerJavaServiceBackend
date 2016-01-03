package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "student_projekat", schema = "zamger", catalog = "")
@IdClass(StudentProjekatEntityPK.class)
public class StudentProjekatEntity {
    private int student;
    private int projekat;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "projekat")
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

        StudentProjekatEntity that = (StudentProjekatEntity) o;

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
