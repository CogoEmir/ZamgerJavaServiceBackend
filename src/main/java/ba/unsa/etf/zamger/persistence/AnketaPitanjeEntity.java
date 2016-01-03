package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_pitanje", schema = "zamger", catalog = "")
public class AnketaPitanjeEntity {
    private int id;
    private int anketa;
    private int tipPitanja;
    private String tekst;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "anketa")
    public int getAnketa() {
        return anketa;
    }

    public void setAnketa(int anketa) {
        this.anketa = anketa;
    }

    @Basic
    @Column(name = "tip_pitanja")
    public int getTipPitanja() {
        return tipPitanja;
    }

    public void setTipPitanja(int tipPitanja) {
        this.tipPitanja = tipPitanja;
    }

    @Basic
    @Column(name = "tekst")
    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaPitanjeEntity that = (AnketaPitanjeEntity) o;

        if (id != that.id) return false;
        if (anketa != that.anketa) return false;
        if (tipPitanja != that.tipPitanja) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + anketa;
        result = 31 * result + tipPitanja;
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        return result;
    }
}
