package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "institucija", schema = "zamger", catalog = "")
public class InstitucijaEntity {
    private int id;
    private String naziv;
    private int roditelj;
    private String kratkiNaziv;
    private int tipinstitucije;
    private int dekan;
    private String brojProtokola;

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
    @Column(name = "roditelj")
    public int getRoditelj() {
        return roditelj;
    }

    public void setRoditelj(int roditelj) {
        this.roditelj = roditelj;
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
    @Column(name = "tipinstitucije")
    public int getTipinstitucije() {
        return tipinstitucije;
    }

    public void setTipinstitucije(int tipinstitucije) {
        this.tipinstitucije = tipinstitucije;
    }

    @Basic
    @Column(name = "dekan")
    public int getDekan() {
        return dekan;
    }

    public void setDekan(int dekan) {
        this.dekan = dekan;
    }

    @Basic
    @Column(name = "broj_protokola")
    public String getBrojProtokola() {
        return brojProtokola;
    }

    public void setBrojProtokola(String brojProtokola) {
        this.brojProtokola = brojProtokola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstitucijaEntity that = (InstitucijaEntity) o;

        if (id != that.id) return false;
        if (roditelj != that.roditelj) return false;
        if (tipinstitucije != that.tipinstitucije) return false;
        if (dekan != that.dekan) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (kratkiNaziv != null ? !kratkiNaziv.equals(that.kratkiNaziv) : that.kratkiNaziv != null) return false;
        if (brojProtokola != null ? !brojProtokola.equals(that.brojProtokola) : that.brojProtokola != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + roditelj;
        result = 31 * result + (kratkiNaziv != null ? kratkiNaziv.hashCode() : 0);
        result = 31 * result + tipinstitucije;
        result = 31 * result + dekan;
        result = 31 * result + (brojProtokola != null ? brojProtokola.hashCode() : 0);
        return result;
    }
}
