package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "poruka", schema = "zamger", catalog = "")
public class PorukaEntity {
    private int id;
    private byte tip;
    private byte opseg;
    private int primalac;
    private int posiljalac;
    private Date vrijeme;
    private int ref;
    private String naslov;
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
    @Column(name = "tip")
    public byte getTip() {
        return tip;
    }

    public void setTip(byte tip) {
        this.tip = tip;
    }

    @Basic
    @Column(name = "opseg")
    public byte getOpseg() {
        return opseg;
    }

    public void setOpseg(byte opseg) {
        this.opseg = opseg;
    }

    @Basic
    @Column(name = "primalac")
    public int getPrimalac() {
        return primalac;
    }

    public void setPrimalac(int primalac) {
        this.primalac = primalac;
    }

    @Basic
    @Column(name = "posiljalac")
    public int getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(int posiljalac) {
        this.posiljalac = posiljalac;
    }

    @Basic
    @Column(name = "vrijeme")
    public Date getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Date vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Basic
    @Column(name = "ref")
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    @Basic
    @Column(name = "naslov")
    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
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

        PorukaEntity that = (PorukaEntity) o;

        if (id != that.id) return false;
        if (tip != that.tip) return false;
        if (opseg != that.opseg) return false;
        if (primalac != that.primalac) return false;
        if (posiljalac != that.posiljalac) return false;
        if (ref != that.ref) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;
        if (naslov != null ? !naslov.equals(that.naslov) : that.naslov != null) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) tip;
        result = 31 * result + (int) opseg;
        result = 31 * result + primalac;
        result = 31 * result + posiljalac;
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + ref;
        result = 31 * result + (naslov != null ? naslov.hashCode() : 0);
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        return result;
    }
}
