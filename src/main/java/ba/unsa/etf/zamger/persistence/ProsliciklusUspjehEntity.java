package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prosliciklus_uspjeh", schema = "zamger", catalog = "")
public class ProsliciklusUspjehEntity {
    private int osoba;
    private int fakultet;
    private int akademskaGodina;
    private int brojSemestara;
    private double opciUspjeh;
    private double dodatniBodovi;
    private int id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "fakultet")
    public int getFakultet() {
        return fakultet;
    }

    public void setFakultet(int fakultet) {
        this.fakultet = fakultet;
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
    @Column(name = "broj_semestara")
    public int getBrojSemestara() {
        return brojSemestara;
    }

    public void setBrojSemestara(int brojSemestara) {
        this.brojSemestara = brojSemestara;
    }

    @Basic
    @Column(name = "opci_uspjeh")
    public double getOpciUspjeh() {
        return opciUspjeh;
    }

    public void setOpciUspjeh(double opciUspjeh) {
        this.opciUspjeh = opciUspjeh;
    }

    @Basic
    @Column(name = "dodatni_bodovi")
    public double getDodatniBodovi() {
        return dodatniBodovi;
    }

    public void setDodatniBodovi(double dodatniBodovi) {
        this.dodatniBodovi = dodatniBodovi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProsliciklusUspjehEntity that = (ProsliciklusUspjehEntity) o;

        if (osoba != that.osoba) return false;
        if (fakultet != that.fakultet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (brojSemestara != that.brojSemestara) return false;
        if (Double.compare(that.opciUspjeh, opciUspjeh) != 0) return false;
        if (Double.compare(that.dodatniBodovi, dodatniBodovi) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = osoba;
        result = 31 * result + fakultet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + brojSemestara;
        temp = Double.doubleToLongBits(opciUspjeh);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dodatniBodovi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
