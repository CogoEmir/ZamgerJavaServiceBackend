package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prosliciklus_ocjene", schema = "zamger", catalog = "")
@IdClass(ProsliciklusOcjeneEntityPK.class)
public class ProsliciklusOcjeneEntity {
    private int osoba;
    private int redniBroj;
    private byte ocjena;
    private double ects;

    @Id
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Id
    @Column(name = "redni_broj")
    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    @Basic
    @Column(name = "ocjena")
    public byte getOcjena() {
        return ocjena;
    }

    public void setOcjena(byte ocjena) {
        this.ocjena = ocjena;
    }

    @Basic
    @Column(name = "ects")
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProsliciklusOcjeneEntity that = (ProsliciklusOcjeneEntity) o;

        if (osoba != that.osoba) return false;
        if (redniBroj != that.redniBroj) return false;
        if (ocjena != that.ocjena) return false;
        if (Double.compare(that.ects, ects) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = osoba;
        result = 31 * result + redniBroj;
        result = 31 * result + (int) ocjena;
        temp = Double.doubleToLongBits(ects);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
