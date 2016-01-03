package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_odgovor_rank", schema = "zamger", catalog = "")
@IdClass(AnketaOdgovorRankEntityPK.class)
public class AnketaOdgovorRankEntity {
    private int rezultat;
    private int pitanje;
    private int izborId;

    @Id
    @Column(name = "rezultat")
    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    @Id
    @Column(name = "pitanje")
    public int getPitanje() {
        return pitanje;
    }

    public void setPitanje(int pitanje) {
        this.pitanje = pitanje;
    }

    @Id
    @Column(name = "izbor_id")
    public int getIzborId() {
        return izborId;
    }

    public void setIzborId(int izborId) {
        this.izborId = izborId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaOdgovorRankEntity that = (AnketaOdgovorRankEntity) o;

        if (rezultat != that.rezultat) return false;
        if (pitanje != that.pitanje) return false;
        if (izborId != that.izborId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rezultat;
        result = 31 * result + pitanje;
        result = 31 * result + izborId;
        return result;
    }
}
