package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "promjena_odsjeka", schema = "zamger", catalog = "")
public class PromjenaOdsjekaEntity {
    private int id;
    private int osoba;
    private int izOdsjeka;
    private int uOdsjek;
    private int akademskaGodina;

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
    @Column(name = "iz_odsjeka")
    public int getIzOdsjeka() {
        return izOdsjeka;
    }

    public void setIzOdsjeka(int izOdsjeka) {
        this.izOdsjeka = izOdsjeka;
    }

    @Basic
    @Column(name = "u_odsjek")
    public int getuOdsjek() {
        return uOdsjek;
    }

    public void setuOdsjek(int uOdsjek) {
        this.uOdsjek = uOdsjek;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromjenaOdsjekaEntity that = (PromjenaOdsjekaEntity) o;

        if (id != that.id) return false;
        if (osoba != that.osoba) return false;
        if (izOdsjeka != that.izOdsjeka) return false;
        if (uOdsjek != that.uOdsjek) return false;
        if (akademskaGodina != that.akademskaGodina) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + osoba;
        result = 31 * result + izOdsjeka;
        result = 31 * result + uOdsjek;
        result = 31 * result + akademskaGodina;
        return result;
    }
}
