package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "uspjeh_u_srednjoj", schema = "zamger", catalog = "")
public class UspjehUSrednjojEntity {
    private int osoba;
    private int srednjaSkola;
    private int godina;
    private double opciUspjeh;
    private double kljucniPredmeti;
    private double dodatniBodovi;
    private byte ucenikGeneracije;

    @Id
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "srednja_skola")
    public int getSrednjaSkola() {
        return srednjaSkola;
    }

    public void setSrednjaSkola(int srednjaSkola) {
        this.srednjaSkola = srednjaSkola;
    }

    @Basic
    @Column(name = "godina")
    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
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
    @Column(name = "kljucni_predmeti")
    public double getKljucniPredmeti() {
        return kljucniPredmeti;
    }

    public void setKljucniPredmeti(double kljucniPredmeti) {
        this.kljucniPredmeti = kljucniPredmeti;
    }

    @Basic
    @Column(name = "dodatni_bodovi")
    public double getDodatniBodovi() {
        return dodatniBodovi;
    }

    public void setDodatniBodovi(double dodatniBodovi) {
        this.dodatniBodovi = dodatniBodovi;
    }

    @Basic
    @Column(name = "ucenik_generacije")
    public byte getUcenikGeneracije() {
        return ucenikGeneracije;
    }

    public void setUcenikGeneracije(byte ucenikGeneracije) {
        this.ucenikGeneracije = ucenikGeneracije;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UspjehUSrednjojEntity that = (UspjehUSrednjojEntity) o;

        if (osoba != that.osoba) return false;
        if (srednjaSkola != that.srednjaSkola) return false;
        if (godina != that.godina) return false;
        if (Double.compare(that.opciUspjeh, opciUspjeh) != 0) return false;
        if (Double.compare(that.kljucniPredmeti, kljucniPredmeti) != 0) return false;
        if (Double.compare(that.dodatniBodovi, dodatniBodovi) != 0) return false;
        if (ucenikGeneracije != that.ucenikGeneracije) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = osoba;
        result = 31 * result + srednjaSkola;
        result = 31 * result + godina;
        temp = Double.doubleToLongBits(opciUspjeh);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(kljucniPredmeti);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dodatniBodovi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ucenikGeneracije;
        return result;
    }
}
