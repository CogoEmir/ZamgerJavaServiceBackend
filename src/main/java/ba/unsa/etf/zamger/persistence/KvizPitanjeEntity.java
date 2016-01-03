package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kviz_pitanje", schema = "zamger", catalog = "")
public class KvizPitanjeEntity {
    private int id;
    private int kviz;
    private String tip;
    private String tekst;
    private double bodova;
    private byte vidljivo;
    private int ukupno;
    private int tacnih;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kviz")
    public int getKviz() {
        return kviz;
    }

    public void setKviz(int kviz) {
        this.kviz = kviz;
    }

    @Basic
    @Column(name = "tip")
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
    @Column(name = "bodova")
    public double getBodova() {
        return bodova;
    }

    public void setBodova(double bodova) {
        this.bodova = bodova;
    }

    @Basic
    @Column(name = "vidljivo")
    public byte getVidljivo() {
        return vidljivo;
    }

    public void setVidljivo(byte vidljivo) {
        this.vidljivo = vidljivo;
    }

    @Basic
    @Column(name = "ukupno")
    public int getUkupno() {
        return ukupno;
    }

    public void setUkupno(int ukupno) {
        this.ukupno = ukupno;
    }

    @Basic
    @Column(name = "tacnih")
    public int getTacnih() {
        return tacnih;
    }

    public void setTacnih(int tacnih) {
        this.tacnih = tacnih;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KvizPitanjeEntity that = (KvizPitanjeEntity) o;

        if (id != that.id) return false;
        if (kviz != that.kviz) return false;
        if (Double.compare(that.bodova, bodova) != 0) return false;
        if (vidljivo != that.vidljivo) return false;
        if (ukupno != that.ukupno) return false;
        if (tacnih != that.tacnih) return false;
        if (tip != null ? !tip.equals(that.tip) : that.tip != null) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + kviz;
        result = 31 * result + (tip != null ? tip.hashCode() : 0);
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        temp = Double.doubleToLongBits(bodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) vidljivo;
        result = 31 * result + ukupno;
        result = 31 * result + tacnih;
        return result;
    }
}
