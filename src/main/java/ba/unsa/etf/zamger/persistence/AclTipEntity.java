package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "acl_tip", schema = "zamger", catalog = "")
public class AclTipEntity {
    private String naziv;
    private byte brPredikata;
    private String predikat1;
    private String predikat2;
    private String predikat3;

    @Id
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "br_predikata")
    public byte getBrPredikata() {
        return brPredikata;
    }

    public void setBrPredikata(byte brPredikata) {
        this.brPredikata = brPredikata;
    }

    @Basic
    @Column(name = "predikat1")
    public String getPredikat1() {
        return predikat1;
    }

    public void setPredikat1(String predikat1) {
        this.predikat1 = predikat1;
    }

    @Basic
    @Column(name = "predikat2")
    public String getPredikat2() {
        return predikat2;
    }

    public void setPredikat2(String predikat2) {
        this.predikat2 = predikat2;
    }

    @Basic
    @Column(name = "predikat3")
    public String getPredikat3() {
        return predikat3;
    }

    public void setPredikat3(String predikat3) {
        this.predikat3 = predikat3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclTipEntity that = (AclTipEntity) o;

        if (brPredikata != that.brPredikata) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (predikat1 != null ? !predikat1.equals(that.predikat1) : that.predikat1 != null) return false;
        if (predikat2 != null ? !predikat2.equals(that.predikat2) : that.predikat2 != null) return false;
        if (predikat3 != null ? !predikat3.equals(that.predikat3) : that.predikat3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = naziv != null ? naziv.hashCode() : 0;
        result = 31 * result + (int) brPredikata;
        result = 31 * result + (predikat1 != null ? predikat1.hashCode() : 0);
        result = 31 * result + (predikat2 != null ? predikat2.hashCode() : 0);
        result = 31 * result + (predikat3 != null ? predikat3.hashCode() : 0);
        return result;
    }
}
