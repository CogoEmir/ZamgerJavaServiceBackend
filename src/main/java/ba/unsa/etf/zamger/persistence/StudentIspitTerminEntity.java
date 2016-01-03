package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "student_ispit_termin", schema = "zamger", catalog = "")
@IdClass(StudentIspitTerminEntityPK.class)
public class StudentIspitTerminEntity {
    private int student;
    private int ispitTermin;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "ispit_termin")
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

        StudentIspitTerminEntity that = (StudentIspitTerminEntity) o;

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
