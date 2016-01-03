package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prisustvo", schema = "zamger", catalog = "")
@IdClass(PrisustvoEntityPK.class)
public class PrisustvoEntity {
    private int student;
    private int cas;
    private byte prisutan;
    private byte plusMinus;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Id
    @Column(name = "cas")
    public int getCas() {
        return cas;
    }

    public void setCas(int cas) {
        this.cas = cas;
    }

    @Basic
    @Column(name = "prisutan")
    public byte getPrisutan() {
        return prisutan;
    }

    public void setPrisutan(byte prisutan) {
        this.prisutan = prisutan;
    }

    @Basic
    @Column(name = "plus_minus")
    public byte getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(byte plusMinus) {
        this.plusMinus = plusMinus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrisustvoEntity that = (PrisustvoEntity) o;

        if (student != that.student) return false;
        if (cas != that.cas) return false;
        if (prisutan != that.prisutan) return false;
        if (plusMinus != that.plusMinus) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + cas;
        result = 31 * result + (int) prisutan;
        result = 31 * result + (int) plusMinus;
        return result;
    }
}
