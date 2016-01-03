package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zadatak", schema = "zamger", catalog = "")
public class ZadatakEntity {
    private long id;
    private int zadaca;
    private int redniBroj;
    private int student;
    private byte status;
    private double bodova;
    private String izvjestajSkripte;
    private Date vrijeme;
    private String komentar;
    private String filename;
    private int userid;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zadaca")
    public int getZadaca() {
        return zadaca;
    }

    public void setZadaca(int zadaca) {
        this.zadaca = zadaca;
    }

    @Basic
    @Column(name = "redni_broj")
    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    @Basic
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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
    @Column(name = "izvjestaj_skripte")
    public String getIzvjestajSkripte() {
        return izvjestajSkripte;
    }

    public void setIzvjestajSkripte(String izvjestajSkripte) {
        this.izvjestajSkripte = izvjestajSkripte;
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
    @Column(name = "komentar")
    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    @Basic
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZadatakEntity that = (ZadatakEntity) o;

        if (id != that.id) return false;
        if (zadaca != that.zadaca) return false;
        if (redniBroj != that.redniBroj) return false;
        if (student != that.student) return false;
        if (status != that.status) return false;
        if (Double.compare(that.bodova, bodova) != 0) return false;
        if (userid != that.userid) return false;
        if (izvjestajSkripte != null ? !izvjestajSkripte.equals(that.izvjestajSkripte) : that.izvjestajSkripte != null)
            return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;
        if (komentar != null ? !komentar.equals(that.komentar) : that.komentar != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + zadaca;
        result = 31 * result + redniBroj;
        result = 31 * result + student;
        result = 31 * result + (int) status;
        temp = Double.doubleToLongBits(bodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (izvjestajSkripte != null ? izvjestajSkripte.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + (komentar != null ? komentar.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + userid;
        return result;
    }
}
