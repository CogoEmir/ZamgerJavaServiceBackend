package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zahtjev_za_potvrdu", schema = "zamger", catalog = "")
public class ZahtjevZaPotvrduEntity {
    private int id;
    private Integer student;
    private Integer tipPotvrde;
    private Integer svrhaPotvrde;
    private Date datumZahtjeva;
    private Integer status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student")
    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    @Basic
    @Column(name = "tip_potvrde")
    public Integer getTipPotvrde() {
        return tipPotvrde;
    }

    public void setTipPotvrde(Integer tipPotvrde) {
        this.tipPotvrde = tipPotvrde;
    }

    @Basic
    @Column(name = "svrha_potvrde")
    public Integer getSvrhaPotvrde() {
        return svrhaPotvrde;
    }

    public void setSvrhaPotvrde(Integer svrhaPotvrde) {
        this.svrhaPotvrde = svrhaPotvrde;
    }

    @Basic
    @Column(name = "datum_zahtjeva")
    public Date getDatumZahtjeva() {
        return datumZahtjeva;
    }

    public void setDatumZahtjeva(Date datumZahtjeva) {
        this.datumZahtjeva = datumZahtjeva;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZahtjevZaPotvrduEntity that = (ZahtjevZaPotvrduEntity) o;

        if (id != that.id) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (tipPotvrde != null ? !tipPotvrde.equals(that.tipPotvrde) : that.tipPotvrde != null) return false;
        if (svrhaPotvrde != null ? !svrhaPotvrde.equals(that.svrhaPotvrde) : that.svrhaPotvrde != null) return false;
        if (datumZahtjeva != null ? !datumZahtjeva.equals(that.datumZahtjeva) : that.datumZahtjeva != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (tipPotvrde != null ? tipPotvrde.hashCode() : 0);
        result = 31 * result + (svrhaPotvrde != null ? svrhaPotvrde.hashCode() : 0);
        result = 31 * result + (datumZahtjeva != null ? datumZahtjeva.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
