package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "angazman", schema = "zamger", catalog = "")
@IdClass(AngazmanEntityPK.class)
public class AngazmanEntity {
    private int predmet;
    private int akademskaGodina;
    private int osoba;
    private int angazmanStatus;

    @Id
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Id
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
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
    @Column(name = "angazman_status")
    public int getAngazmanStatus() {
        return angazmanStatus;
    }

    public void setAngazmanStatus(int angazmanStatus) {
        this.angazmanStatus = angazmanStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AngazmanEntity that = (AngazmanEntity) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (osoba != that.osoba) return false;
        if (angazmanStatus != that.angazmanStatus) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + osoba;
        result = 31 * result + angazmanStatus;
        return result;
    }
}
