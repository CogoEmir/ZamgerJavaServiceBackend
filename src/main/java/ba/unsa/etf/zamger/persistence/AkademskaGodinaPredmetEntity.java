package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "akademska_godina_predmet", schema = "zamger", catalog = "")
@IdClass(AkademskaGodinaPredmetEntityPK.class)
public class AkademskaGodinaPredmetEntity {
    private int akademskaGodina;
    private int predmet;
    private int tippredmeta;

    @Id
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Id
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "tippredmeta")
    public int getTippredmeta() {
        return tippredmeta;
    }

    public void setTippredmeta(int tippredmeta) {
        this.tippredmeta = tippredmeta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AkademskaGodinaPredmetEntity that = (AkademskaGodinaPredmetEntity) o;

        if (akademskaGodina != that.akademskaGodina) return false;
        if (predmet != that.predmet) return false;
        if (tippredmeta != that.tippredmeta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = akademskaGodina;
        result = 31 * result + predmet;
        result = 31 * result + tippredmeta;
        return result;
    }
}
