package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ras_sati", schema = "zamger", catalog = "")
public class RasSatiEntity {
    private byte idS;
    private String satS;

    @Id
    @Column(name = "idS")
    public byte getIdS() {
        return idS;
    }

    public void setIdS(byte idS) {
        this.idS = idS;
    }

    @Basic
    @Column(name = "satS")
    public String getSatS() {
        return satS;
    }

    public void setSatS(String satS) {
        this.satS = satS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RasSatiEntity that = (RasSatiEntity) o;

        if (idS != that.idS) return false;
        if (satS != null ? !satS.equals(that.satS) : that.satS != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idS;
        result = 31 * result + (satS != null ? satS.hashCode() : 0);
        return result;
    }
}
