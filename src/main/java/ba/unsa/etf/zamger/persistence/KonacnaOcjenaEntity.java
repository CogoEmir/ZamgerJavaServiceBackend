package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "konacna_ocjena", schema = "zamger", catalog = "")
@IdClass(KonacnaOcjenaEntityPK.class)
public class KonacnaOcjenaEntity {
    private int student;
    private int predmet;
    private int akademskaGodina;
    private int ocjena;
    private Date datum;
    private Date datumUIndeksu;
    private Integer odluka;
    private byte datumProvjeren;

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
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
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "ocjena")
    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    @Basic
    @Column(name = "datum")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "datum_u_indeksu")
    public Date getDatumUIndeksu() {
        return datumUIndeksu;
    }

    public void setDatumUIndeksu(Date datumUIndeksu) {
        this.datumUIndeksu = datumUIndeksu;
    }

    @Basic
    @Column(name = "odluka")
    public Integer getOdluka() {
        return odluka;
    }

    public void setOdluka(Integer odluka) {
        this.odluka = odluka;
    }

    @Basic
    @Column(name = "datum_provjeren")
    public byte getDatumProvjeren() {
        return datumProvjeren;
    }

    public void setDatumProvjeren(byte datumProvjeren) {
        this.datumProvjeren = datumProvjeren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KonacnaOcjenaEntity that = (KonacnaOcjenaEntity) o;

        if (student != that.student) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (ocjena != that.ocjena) return false;
        if (datumProvjeren != that.datumProvjeren) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (datumUIndeksu != null ? !datumUIndeksu.equals(that.datumUIndeksu) : that.datumUIndeksu != null)
            return false;
        if (odluka != null ? !odluka.equals(that.odluka) : that.odluka != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = student;
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + ocjena;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (datumUIndeksu != null ? datumUIndeksu.hashCode() : 0);
        result = 31 * result + (odluka != null ? odluka.hashCode() : 0);
        result = 31 * result + (int) datumProvjeren;
        return result;
    }
}
