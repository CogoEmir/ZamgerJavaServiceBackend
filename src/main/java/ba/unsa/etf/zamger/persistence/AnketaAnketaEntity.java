package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_anketa", schema = "zamger", catalog = "")
public class AnketaAnketaEntity {
    private int id;
    private Date datumOtvaranja;
    private Date datumZatvaranja;
    private String naziv;
    private String opis;
    private Byte aktivna;
    private Byte editable;
    private Integer akademskaGodina;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datum_otvaranja")
    public Date getDatumOtvaranja() {
        return datumOtvaranja;
    }

    public void setDatumOtvaranja(Date datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    @Basic
    @Column(name = "datum_zatvaranja")
    public Date getDatumZatvaranja() {
        return datumZatvaranja;
    }

    public void setDatumZatvaranja(Date datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "aktivna")
    public Byte getAktivna() {
        return aktivna;
    }

    public void setAktivna(Byte aktivna) {
        this.aktivna = aktivna;
    }

    @Basic
    @Column(name = "editable")
    public Byte getEditable() {
        return editable;
    }

    public void setEditable(Byte editable) {
        this.editable = editable;
    }

    @Basic
    @Column(name = "akademska_godina")
    public Integer getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(Integer akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaAnketaEntity that = (AnketaAnketaEntity) o;

        if (id != that.id) return false;
        if (datumOtvaranja != null ? !datumOtvaranja.equals(that.datumOtvaranja) : that.datumOtvaranja != null)
            return false;
        if (datumZatvaranja != null ? !datumZatvaranja.equals(that.datumZatvaranja) : that.datumZatvaranja != null)
            return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (aktivna != null ? !aktivna.equals(that.aktivna) : that.aktivna != null) return false;
        if (editable != null ? !editable.equals(that.editable) : that.editable != null) return false;
        if (akademskaGodina != null ? !akademskaGodina.equals(that.akademskaGodina) : that.akademskaGodina != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (datumOtvaranja != null ? datumOtvaranja.hashCode() : 0);
        result = 31 * result + (datumZatvaranja != null ? datumZatvaranja.hashCode() : 0);
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (aktivna != null ? aktivna.hashCode() : 0);
        result = 31 * result + (editable != null ? editable.hashCode() : 0);
        result = 31 * result + (akademskaGodina != null ? akademskaGodina.hashCode() : 0);
        return result;
    }
}
