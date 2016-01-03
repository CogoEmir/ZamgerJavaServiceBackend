package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "izbor", schema = "zamger", catalog = "")
public class IzborEntity {
    private int fkOsoba;
    private int fkNaucnonastavnoZvanje;
    private Date datumIzbora;
    private Date datumIsteka;
    private int fkNaucnaOblast;
    private int fkUzaNaucnaOblast;
    private byte dopunski;
    private byte drugaInstitucija;

    @Basic
    @Column(name = "fk_osoba")
    public int getFkOsoba() {
        return fkOsoba;
    }

    public void setFkOsoba(int fkOsoba) {
        this.fkOsoba = fkOsoba;
    }

    @Basic
    @Column(name = "fk_naucnonastavno_zvanje")
    public int getFkNaucnonastavnoZvanje() {
        return fkNaucnonastavnoZvanje;
    }

    public void setFkNaucnonastavnoZvanje(int fkNaucnonastavnoZvanje) {
        this.fkNaucnonastavnoZvanje = fkNaucnonastavnoZvanje;
    }

    @Basic
    @Column(name = "datum_izbora")
    public Date getDatumIzbora() {
        return datumIzbora;
    }

    public void setDatumIzbora(Date datumIzbora) {
        this.datumIzbora = datumIzbora;
    }

    @Basic
    @Column(name = "datum_isteka")
    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Basic
    @Column(name = "fk_naucna_oblast")
    public int getFkNaucnaOblast() {
        return fkNaucnaOblast;
    }

    public void setFkNaucnaOblast(int fkNaucnaOblast) {
        this.fkNaucnaOblast = fkNaucnaOblast;
    }

    @Basic
    @Column(name = "fk_uza_naucna_oblast")
    public int getFkUzaNaucnaOblast() {
        return fkUzaNaucnaOblast;
    }

    public void setFkUzaNaucnaOblast(int fkUzaNaucnaOblast) {
        this.fkUzaNaucnaOblast = fkUzaNaucnaOblast;
    }

    @Basic
    @Column(name = "dopunski")
    public byte getDopunski() {
        return dopunski;
    }

    public void setDopunski(byte dopunski) {
        this.dopunski = dopunski;
    }

    @Basic
    @Column(name = "druga_institucija")
    public byte getDrugaInstitucija() {
        return drugaInstitucija;
    }

    public void setDrugaInstitucija(byte drugaInstitucija) {
        this.drugaInstitucija = drugaInstitucija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IzborEntity that = (IzborEntity) o;

        if (fkOsoba != that.fkOsoba) return false;
        if (fkNaucnonastavnoZvanje != that.fkNaucnonastavnoZvanje) return false;
        if (fkNaucnaOblast != that.fkNaucnaOblast) return false;
        if (fkUzaNaucnaOblast != that.fkUzaNaucnaOblast) return false;
        if (dopunski != that.dopunski) return false;
        if (drugaInstitucija != that.drugaInstitucija) return false;
        if (datumIzbora != null ? !datumIzbora.equals(that.datumIzbora) : that.datumIzbora != null) return false;
        if (datumIsteka != null ? !datumIsteka.equals(that.datumIsteka) : that.datumIsteka != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fkOsoba;
        result = 31 * result + fkNaucnonastavnoZvanje;
        result = 31 * result + (datumIzbora != null ? datumIzbora.hashCode() : 0);
        result = 31 * result + (datumIsteka != null ? datumIsteka.hashCode() : 0);
        result = 31 * result + fkNaucnaOblast;
        result = 31 * result + fkUzaNaucnaOblast;
        result = 31 * result + (int) dopunski;
        result = 31 * result + (int) drugaInstitucija;
        return result;
    }
}
