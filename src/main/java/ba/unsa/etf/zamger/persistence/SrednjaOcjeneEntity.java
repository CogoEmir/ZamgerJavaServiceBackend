package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "srednja_ocjene", schema = "zamger", catalog = "")
@IdClass(SrednjaOcjeneEntityPK.class)
public class SrednjaOcjeneEntity {
    private int osoba;
    private byte razred;
    private int redniBroj;
    private byte ocjena;
    private byte tipocjene;

    @Id
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Id
    @Column(name = "razred")
    public byte getRazred() {
        return razred;
    }

    public void setRazred(byte razred) {
        this.razred = razred;
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
    @Column(name = "tipocjene")
    public byte getTipocjene() {
        return tipocjene;
    }

    public void setTipocjene(byte tipocjene) {
        this.tipocjene = tipocjene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SrednjaOcjeneEntity that = (SrednjaOcjeneEntity) o;

        if (osoba != that.osoba) return false;
        if (razred != that.razred) return false;
        if (redniBroj != that.redniBroj) return false;
        if (ocjena != that.ocjena) return false;
        if (tipocjene != that.tipocjene) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = osoba;
        result = 31 * result + (int) razred;
        result = 31 * result + redniBroj;
        result = 31 * result + (int) ocjena;
        result = 31 * result + (int) tipocjene;
        return result;
    }
}
