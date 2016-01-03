package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "upis_kriterij", schema = "zamger", catalog = "")
@IdClass(UpisKriterijEntityPK.class)
public class UpisKriterijEntity {
    private int prijemniTermin;
    private double donjaGranica;
    private double gornjaGranica;
    private int kandidatiStrani;
    private int kandidatiSamiPlacaju;
    private int kandidatiKantonPlaca;
    private int kandidatiVanredni;
    private int prijemniMax;
    private int studij;

    @Id
    @Column(name = "prijemni_termin")
    public int getPrijemniTermin() {
        return prijemniTermin;
    }

    public void setPrijemniTermin(int prijemniTermin) {
        this.prijemniTermin = prijemniTermin;
    }

    @Basic
    @Column(name = "donja_granica")
    public double getDonjaGranica() {
        return donjaGranica;
    }

    public void setDonjaGranica(double donjaGranica) {
        this.donjaGranica = donjaGranica;
    }

    @Basic
    @Column(name = "gornja_granica")
    public double getGornjaGranica() {
        return gornjaGranica;
    }

    public void setGornjaGranica(double gornjaGranica) {
        this.gornjaGranica = gornjaGranica;
    }

    @Basic
    @Column(name = "kandidati_strani")
    public int getKandidatiStrani() {
        return kandidatiStrani;
    }

    public void setKandidatiStrani(int kandidatiStrani) {
        this.kandidatiStrani = kandidatiStrani;
    }

    @Basic
    @Column(name = "kandidati_sami_placaju")
    public int getKandidatiSamiPlacaju() {
        return kandidatiSamiPlacaju;
    }

    public void setKandidatiSamiPlacaju(int kandidatiSamiPlacaju) {
        this.kandidatiSamiPlacaju = kandidatiSamiPlacaju;
    }

    @Basic
    @Column(name = "kandidati_kanton_placa")
    public int getKandidatiKantonPlaca() {
        return kandidatiKantonPlaca;
    }

    public void setKandidatiKantonPlaca(int kandidatiKantonPlaca) {
        this.kandidatiKantonPlaca = kandidatiKantonPlaca;
    }

    @Basic
    @Column(name = "kandidati_vanredni")
    public int getKandidatiVanredni() {
        return kandidatiVanredni;
    }

    public void setKandidatiVanredni(int kandidatiVanredni) {
        this.kandidatiVanredni = kandidatiVanredni;
    }

    @Basic
    @Column(name = "prijemni_max")
    public int getPrijemniMax() {
        return prijemniMax;
    }

    public void setPrijemniMax(int prijemniMax) {
        this.prijemniMax = prijemniMax;
    }

    @Id
    @Column(name = "studij")
    public int getStudij() {
        return studij;
    }

    public void setStudij(int studij) {
        this.studij = studij;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpisKriterijEntity that = (UpisKriterijEntity) o;

        if (prijemniTermin != that.prijemniTermin) return false;
        if (Double.compare(that.donjaGranica, donjaGranica) != 0) return false;
        if (Double.compare(that.gornjaGranica, gornjaGranica) != 0) return false;
        if (kandidatiStrani != that.kandidatiStrani) return false;
        if (kandidatiSamiPlacaju != that.kandidatiSamiPlacaju) return false;
        if (kandidatiKantonPlaca != that.kandidatiKantonPlaca) return false;
        if (kandidatiVanredni != that.kandidatiVanredni) return false;
        if (prijemniMax != that.prijemniMax) return false;
        if (studij != that.studij) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = prijemniTermin;
        temp = Double.doubleToLongBits(donjaGranica);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gornjaGranica);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + kandidatiStrani;
        result = 31 * result + kandidatiSamiPlacaju;
        result = 31 * result + kandidatiKantonPlaca;
        result = 31 * result + kandidatiVanredni;
        result = 31 * result + prijemniMax;
        result = 31 * result + studij;
        return result;
    }
}
