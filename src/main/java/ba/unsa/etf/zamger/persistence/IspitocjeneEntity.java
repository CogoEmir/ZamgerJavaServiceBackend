package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ispitocjene", schema = "zamger", catalog = "")
@IdClass(IspitocjeneEntityPK.class)
public class IspitocjeneEntity {
    private int ispit;
    private int student;
    private double ocjena;

    @Id
    @Column(name = "ispit")
    public int getIspit() {
        return ispit;
    }

    public void setIspit(int ispit) {
        this.ispit = ispit;
    }

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Basic
    @Column(name = "ocjena")
    public double getOcjena() {
        return ocjena;
    }

    public void setOcjena(double ocjena) {
        this.ocjena = ocjena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IspitocjeneEntity that = (IspitocjeneEntity) o;

        if (ispit != that.ispit) return false;
        if (student != that.student) return false;
        if (Double.compare(that.ocjena, ocjena) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = ispit;
        result = 31 * result + student;
        temp = Double.doubleToLongBits(ocjena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
