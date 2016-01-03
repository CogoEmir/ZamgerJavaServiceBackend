package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "predmet", schema = "zamger", catalog = "")
public class PredmetEntity {
    private int id;
    private String sifra;
    private String naziv;
    private int institucija;
    private String kratkiNaziv;
    private int tippredmeta;
    private double ects;
    private int satiPredavanja;
    private int satiVjezbi;
    private int satiTutorijala;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sifra")
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
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
    @Column(name = "institucija")
    public int getInstitucija() {
        return institucija;
    }

    public void setInstitucija(int institucija) {
        this.institucija = institucija;
    }

    @Basic
    @Column(name = "kratki_naziv")
    public String getKratkiNaziv() {
        return kratkiNaziv;
    }

    public void setKratkiNaziv(String kratkiNaziv) {
        this.kratkiNaziv = kratkiNaziv;
    }

    @Basic
    @Column(name = "tippredmeta")
    public int getTippredmeta() {
        return tippredmeta;
    }

    public void setTippredmeta(int tippredmeta) {
        this.tippredmeta = tippredmeta;
    }

    @Basic
    @Column(name = "ects")
    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    @Basic
    @Column(name = "sati_predavanja")
    public int getSatiPredavanja() {
        return satiPredavanja;
    }

    public void setSatiPredavanja(int satiPredavanja) {
        this.satiPredavanja = satiPredavanja;
    }

    @Basic
    @Column(name = "sati_vjezbi")
    public int getSatiVjezbi() {
        return satiVjezbi;
    }

    public void setSatiVjezbi(int satiVjezbi) {
        this.satiVjezbi = satiVjezbi;
    }

    @Basic
    @Column(name = "sati_tutorijala")
    public int getSatiTutorijala() {
        return satiTutorijala;
    }

    public void setSatiTutorijala(int satiTutorijala) {
        this.satiTutorijala = satiTutorijala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredmetEntity that = (PredmetEntity) o;

        if (id != that.id) return false;
        if (institucija != that.institucija) return false;
        if (tippredmeta != that.tippredmeta) return false;
        if (Double.compare(that.ects, ects) != 0) return false;
        if (satiPredavanja != that.satiPredavanja) return false;
        if (satiVjezbi != that.satiVjezbi) return false;
        if (satiTutorijala != that.satiTutorijala) return false;
        if (sifra != null ? !sifra.equals(that.sifra) : that.sifra != null) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (kratkiNaziv != null ? !kratkiNaziv.equals(that.kratkiNaziv) : that.kratkiNaziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (sifra != null ? sifra.hashCode() : 0);
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + institucija;
        result = 31 * result + (kratkiNaziv != null ? kratkiNaziv.hashCode() : 0);
        result = 31 * result + tippredmeta;
        temp = Double.doubleToLongBits(ects);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + satiPredavanja;
        result = 31 * result + satiVjezbi;
        result = 31 * result + satiTutorijala;
        return result;
    }
}
