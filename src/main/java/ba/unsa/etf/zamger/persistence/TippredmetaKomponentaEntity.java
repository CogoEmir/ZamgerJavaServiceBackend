package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "tippredmeta_komponenta", schema = "zamger", catalog = "")
public class TippredmetaKomponentaEntity {
    private int tippredmeta;
    private int komponenta;

    @Basic
    @Column(name = "tippredmeta")
    public int getTippredmeta() {
        return tippredmeta;
    }

    public void setTippredmeta(int tippredmeta) {
        this.tippredmeta = tippredmeta;
    }

    @Basic
    @Column(name = "komponenta")
    public int getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(int komponenta) {
        this.komponenta = komponenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TippredmetaKomponentaEntity that = (TippredmetaKomponentaEntity) o;

        if (tippredmeta != that.tippredmeta) return false;
        if (komponenta != that.komponenta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tippredmeta;
        result = 31 * result + komponenta;
        return result;
    }
}
