package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "student_labgrupa", schema = "zamger", catalog = "")
@IdClass(StudentLabgrupaEntityPK.class)
public class StudentLabgrupaEntity {
    private int student;
    private int labgrupa;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "labgrupa")
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

        StudentLabgrupaEntity that = (StudentLabgrupaEntity) o;

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
