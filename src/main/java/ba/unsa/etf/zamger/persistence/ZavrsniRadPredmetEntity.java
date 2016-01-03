package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zavrsni_rad_predmet", schema = "zamger", catalog = "")
public class ZavrsniRadPredmetEntity {
    private int id;
    private String naziv;
    private String predmet;
    private String akademskaGodina;
    private String student;
    private String nastavnik;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "predmet")
    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "akademska_godina")
    public String getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(String akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "student")
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Basic
    @Column(name = "nastavnik")
    public String getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(String nastavnik) {
        this.nastavnik = nastavnik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZavrsniRadPredmetEntity that = (ZavrsniRadPredmetEntity) o;

        if (id != that.id) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (predmet != null ? !predmet.equals(that.predmet) : that.predmet != null) return false;
        if (akademskaGodina != null ? !akademskaGodina.equals(that.akademskaGodina) : that.akademskaGodina != null)
            return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (nastavnik != null ? !nastavnik.equals(that.nastavnik) : that.nastavnik != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (predmet != null ? predmet.hashCode() : 0);
        result = 31 * result + (akademskaGodina != null ? akademskaGodina.hashCode() : 0);
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (nastavnik != null ? nastavnik.hashCode() : 0);
        return result;
    }
}
