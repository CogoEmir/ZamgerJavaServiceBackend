package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prijemni_prijava", schema = "zamger", catalog = "")
@IdClass(PrijemniPrijavaEntityPK.class)
public class PrijemniPrijavaEntity {
    private int prijemniTermin;
    private int osoba;
    private int brojDosjea;
    private byte nacinStudiranja;
    private int studijPrvi;
    private int studijDrugi;
    private int studijTreci;
    private int studijCetvrti;
    private byte izasao;
    private double rezultat;

    @Id
    @Column(name = "prijemni_termin")
    public int getPrijemniTermin() {
        return prijemniTermin;
    }

    public void setPrijemniTermin(int prijemniTermin) {
        this.prijemniTermin = prijemniTermin;
    }

    @Id
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "broj_dosjea")
    public int getBrojDosjea() {
        return brojDosjea;
    }

    public void setBrojDosjea(int brojDosjea) {
        this.brojDosjea = brojDosjea;
    }

    @Basic
    @Column(name = "nacin_studiranja")
    public byte getNacinStudiranja() {
        return nacinStudiranja;
    }

    public void setNacinStudiranja(byte nacinStudiranja) {
        this.nacinStudiranja = nacinStudiranja;
    }

    @Basic
    @Column(name = "studij_prvi")
    public int getStudijPrvi() {
        return studijPrvi;
    }

    public void setStudijPrvi(int studijPrvi) {
        this.studijPrvi = studijPrvi;
    }

    @Basic
    @Column(name = "studij_drugi")
    public int getStudijDrugi() {
        return studijDrugi;
    }

    public void setStudijDrugi(int studijDrugi) {
        this.studijDrugi = studijDrugi;
    }

    @Basic
    @Column(name = "studij_treci")
    public int getStudijTreci() {
        return studijTreci;
    }

    public void setStudijTreci(int studijTreci) {
        this.studijTreci = studijTreci;
    }

    @Basic
    @Column(name = "studij_cetvrti")
    public int getStudijCetvrti() {
        return studijCetvrti;
    }

    public void setStudijCetvrti(int studijCetvrti) {
        this.studijCetvrti = studijCetvrti;
    }

    @Basic
    @Column(name = "izasao")
    public byte getIzasao() {
        return izasao;
    }

    public void setIzasao(byte izasao) {
        this.izasao = izasao;
    }

    @Basic
    @Column(name = "rezultat")
    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrijemniPrijavaEntity that = (PrijemniPrijavaEntity) o;

        if (prijemniTermin != that.prijemniTermin) return false;
        if (osoba != that.osoba) return false;
        if (brojDosjea != that.brojDosjea) return false;
        if (nacinStudiranja != that.nacinStudiranja) return false;
        if (studijPrvi != that.studijPrvi) return false;
        if (studijDrugi != that.studijDrugi) return false;
        if (studijTreci != that.studijTreci) return false;
        if (studijCetvrti != that.studijCetvrti) return false;
        if (izasao != that.izasao) return false;
        if (Double.compare(that.rezultat, rezultat) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = prijemniTermin;
        result = 31 * result + osoba;
        result = 31 * result + brojDosjea;
        result = 31 * result + (int) nacinStudiranja;
        result = 31 * result + studijPrvi;
        result = 31 * result + studijDrugi;
        result = 31 * result + studijTreci;
        result = 31 * result + studijCetvrti;
        result = 31 * result + (int) izasao;
        temp = Double.doubleToLongBits(rezultat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
