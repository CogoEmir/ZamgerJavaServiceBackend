package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "studij", schema = "zamger", catalog = "")
public class StudijEntity {
    private int id;
    private String naziv;
    private int zavrsniSemestar;
    private int institucija;
    private String kratkinaziv;
    private byte mogucUpis;
    private int tipstudija;
    private int preduslov;

    @Id
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
    @Column(name = "zavrsni_semestar")
    public int getZavrsniSemestar() {
        return zavrsniSemestar;
    }

    public void setZavrsniSemestar(int zavrsniSemestar) {
        this.zavrsniSemestar = zavrsniSemestar;
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
    @Column(name = "kratkinaziv")
    public String getKratkinaziv() {
        return kratkinaziv;
    }

    public void setKratkinaziv(String kratkinaziv) {
        this.kratkinaziv = kratkinaziv;
    }

    @Basic
    @Column(name = "moguc_upis")
    public byte getMogucUpis() {
        return mogucUpis;
    }

    public void setMogucUpis(byte mogucUpis) {
        this.mogucUpis = mogucUpis;
    }

    @Basic
    @Column(name = "tipstudija")
    public int getTipstudija() {
        return tipstudija;
    }

    public void setTipstudija(int tipstudija) {
        this.tipstudija = tipstudija;
    }

    @Basic
    @Column(name = "preduslov")
    public int getPreduslov() {
        return preduslov;
    }

    public void setPreduslov(int preduslov) {
        this.preduslov = preduslov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudijEntity that = (StudijEntity) o;

        if (id != that.id) return false;
        if (zavrsniSemestar != that.zavrsniSemestar) return false;
        if (institucija != that.institucija) return false;
        if (mogucUpis != that.mogucUpis) return false;
        if (tipstudija != that.tipstudija) return false;
        if (preduslov != that.preduslov) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (kratkinaziv != null ? !kratkinaziv.equals(that.kratkinaziv) : that.kratkinaziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + zavrsniSemestar;
        result = 31 * result + institucija;
        result = 31 * result + (kratkinaziv != null ? kratkinaziv.hashCode() : 0);
        result = 31 * result + (int) mogucUpis;
        result = 31 * result + tipstudija;
        result = 31 * result + preduslov;
        return result;
    }
}
