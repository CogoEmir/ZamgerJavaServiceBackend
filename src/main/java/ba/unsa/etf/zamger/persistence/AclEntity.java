package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "acl", schema = "zamger", catalog = "")
public class AclEntity {
    private int osoba;
    private String aclTip;
    private int predikat1;
    private int predikat2;
    private int predikat3;
    private int id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "acl_tip")
    public String getAclTip() {
        return aclTip;
    }

    public void setAclTip(String aclTip) {
        this.aclTip = aclTip;
    }

    @Basic
    @Column(name = "predikat1")
    public int getPredikat1() {
        return predikat1;
    }

    public void setPredikat1(int predikat1) {
        this.predikat1 = predikat1;
    }

    @Basic
    @Column(name = "predikat2")
    public int getPredikat2() {
        return predikat2;
    }

    public void setPredikat2(int predikat2) {
        this.predikat2 = predikat2;
    }

    @Basic
    @Column(name = "predikat3")
    public int getPredikat3() {
        return predikat3;
    }

    public void setPredikat3(int predikat3) {
        this.predikat3 = predikat3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclEntity aclEntity = (AclEntity) o;

        if (osoba != aclEntity.osoba) return false;
        if (predikat1 != aclEntity.predikat1) return false;
        if (predikat2 != aclEntity.predikat2) return false;
        if (predikat3 != aclEntity.predikat3) return false;
        if (aclTip != null ? !aclTip.equals(aclEntity.aclTip) : aclEntity.aclTip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = osoba;
        result = 31 * result + (aclTip != null ? aclTip.hashCode() : 0);
        result = 31 * result + predikat1;
        result = 31 * result + predikat2;
        result = 31 * result + predikat3;
        return result;
    }
}
