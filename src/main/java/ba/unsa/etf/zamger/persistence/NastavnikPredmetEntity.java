package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "nastavnik_predmet", schema = "zamger", catalog = "")
@IdClass(NastavnikPredmetEntityPK.class)
public class NastavnikPredmetEntity {
    private int nastavnik;
    private int akademskaGodina;
    private int predmet;
    private String nivoPristupa;

    @Id
    @Column(name = "nastavnik")
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
    }

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
    @Column(name = "nivo_pristupa")
    public String getNivoPristupa() {
        return nivoPristupa;
    }

    public void setNivoPristupa(String nivoPristupa) {
        this.nivoPristupa = nivoPristupa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NastavnikPredmetEntity that = (NastavnikPredmetEntity) o;

        if (nastavnik != that.nastavnik) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (predmet != that.predmet) return false;
        if (nivoPristupa != null ? !nivoPristupa.equals(that.nivoPristupa) : that.nivoPristupa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nastavnik;
        result = 31 * result + akademskaGodina;
        result = 31 * result + predmet;
        result = 31 * result + (nivoPristupa != null ? nivoPristupa.hashCode() : 0);
        return result;
    }
}
