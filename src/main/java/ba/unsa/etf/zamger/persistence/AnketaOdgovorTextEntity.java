package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_odgovor_text", schema = "zamger", catalog = "")
@IdClass(AnketaOdgovorTextEntityPK.class)
public class AnketaOdgovorTextEntity {
    private int rezultat;
    private int pitanje;
    private String odgovor;

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

    @Basic
    @Column(name = "odgovor")
    public String getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(String odgovor) {
        this.odgovor = odgovor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaOdgovorTextEntity that = (AnketaOdgovorTextEntity) o;

        if (rezultat != that.rezultat) return false;
        if (pitanje != that.pitanje) return false;
        if (odgovor != null ? !odgovor.equals(that.odgovor) : that.odgovor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rezultat;
        result = 31 * result + pitanje;
        result = 31 * result + (odgovor != null ? odgovor.hashCode() : 0);
        return result;
    }
}
