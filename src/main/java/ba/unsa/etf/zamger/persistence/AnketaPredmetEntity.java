package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_predmet", schema = "zamger", catalog = "")
public class AnketaPredmetEntity {
    private int anketa;
    private Integer predmet;
    private int akademskaGodina;
    private int semestar;
    private byte aktivna;

    @Basic
    @Column(name = "anketa")
    public int getAnketa() {
        return anketa;
    }

    public void setAnketa(int anketa) {
        this.anketa = anketa;
    }

    @Basic
    @Column(name = "predmet")
    public Integer getPredmet() {
        return predmet;
    }

    public void setPredmet(Integer predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "semestar")
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Basic
    @Column(name = "aktivna")
    public byte getAktivna() {
        return aktivna;
    }

    public void setAktivna(byte aktivna) {
        this.aktivna = aktivna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaPredmetEntity that = (AnketaPredmetEntity) o;

        if (anketa != that.anketa) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (semestar != that.semestar) return false;
        if (aktivna != that.aktivna) return false;
        if (predmet != null ? !predmet.equals(that.predmet) : that.predmet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anketa;
        result = 31 * result + (predmet != null ? predmet.hashCode() : 0);
        result = 31 * result + akademskaGodina;
        result = 31 * result + semestar;
        result = 31 * result + (int) aktivna;
        return result;
    }
}
