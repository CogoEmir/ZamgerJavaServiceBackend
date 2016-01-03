package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "priznavanje", schema = "zamger", catalog = "")
public class PriznavanjeEntity {
    private int id;
    private int student;
    private int akademskaGodina;
    private int ciklus;
    private String nazivPredmeta;
    private String sifraPredmeta;
    private double ects;
    private int ocjena;
    private int odluka;
    private String stranaInstitucija;

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
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
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
    @Column(name = "ciklus")
    public int getCiklus() {
        return ciklus;
    }

    public void setCiklus(int ciklus) {
        this.ciklus = ciklus;
    }

    @Basic
    @Column(name = "naziv_predmeta")
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    @Basic
    @Column(name = "sifra_predmeta")
    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
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
    @Column(name = "ocjena")
    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    @Basic
    @Column(name = "odluka")
    public int getOdluka() {
        return odluka;
    }

    public void setOdluka(int odluka) {
        this.odluka = odluka;
    }

    @Basic
    @Column(name = "strana_institucija")
    public String getStranaInstitucija() {
        return stranaInstitucija;
    }

    public void setStranaInstitucija(String stranaInstitucija) {
        this.stranaInstitucija = stranaInstitucija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriznavanjeEntity that = (PriznavanjeEntity) o;

        if (student != that.student) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (ciklus != that.ciklus) return false;
        if (Double.compare(that.ects, ects) != 0) return false;
        if (ocjena != that.ocjena) return false;
        if (odluka != that.odluka) return false;
        if (nazivPredmeta != null ? !nazivPredmeta.equals(that.nazivPredmeta) : that.nazivPredmeta != null)
            return false;
        if (sifraPredmeta != null ? !sifraPredmeta.equals(that.sifraPredmeta) : that.sifraPredmeta != null)
            return false;
        if (stranaInstitucija != null ? !stranaInstitucija.equals(that.stranaInstitucija) : that.stranaInstitucija != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = student;
        result = 31 * result + akademskaGodina;
        result = 31 * result + ciklus;
        result = 31 * result + (nazivPredmeta != null ? nazivPredmeta.hashCode() : 0);
        result = 31 * result + (sifraPredmeta != null ? sifraPredmeta.hashCode() : 0);
        temp = Double.doubleToLongBits(ects);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + ocjena;
        result = 31 * result + odluka;
        result = 31 * result + (stranaInstitucija != null ? stranaInstitucija.hashCode() : 0);
        return result;
    }
}
