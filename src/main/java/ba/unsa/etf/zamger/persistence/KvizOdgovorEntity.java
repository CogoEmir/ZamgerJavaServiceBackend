package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kviz_odgovor", schema = "zamger", catalog = "")
public class KvizOdgovorEntity {
    private int id;
    private int kvizPitanje;
    private String tekst;
    private byte tacan;
    private byte vidljiv;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kviz_pitanje")
    public int getKvizPitanje() {
        return kvizPitanje;
    }

    public void setKvizPitanje(int kvizPitanje) {
        this.kvizPitanje = kvizPitanje;
    }

    @Basic
    @Column(name = "tekst")
    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Basic
    @Column(name = "tacan")
    public byte getTacan() {
        return tacan;
    }

    public void setTacan(byte tacan) {
        this.tacan = tacan;
    }

    @Basic
    @Column(name = "vidljiv")
    public byte getVidljiv() {
        return vidljiv;
    }

    public void setVidljiv(byte vidljiv) {
        this.vidljiv = vidljiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KvizOdgovorEntity that = (KvizOdgovorEntity) o;

        if (id != that.id) return false;
        if (kvizPitanje != that.kvizPitanje) return false;
        if (tacan != that.tacan) return false;
        if (vidljiv != that.vidljiv) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + kvizPitanje;
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        result = 31 * result + (int) tacan;
        result = 31 * result + (int) vidljiv;
        return result;
    }
}
