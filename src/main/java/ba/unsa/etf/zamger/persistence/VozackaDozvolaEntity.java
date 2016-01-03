package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "vozacka_dozvola", schema = "zamger", catalog = "")
public class VozackaDozvolaEntity {
    private int id;
    private int fkOsoba;
    private int fkVozackiKategorija;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fk_osoba")
    public int getFkOsoba() {
        return fkOsoba;
    }

    public void setFkOsoba(int fkOsoba) {
        this.fkOsoba = fkOsoba;
    }

    @Basic
    @Column(name = "fk_vozacki_kategorija")
    public int getFkVozackiKategorija() {
        return fkVozackiKategorija;
    }

    public void setFkVozackiKategorija(int fkVozackiKategorija) {
        this.fkVozackiKategorija = fkVozackiKategorija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VozackaDozvolaEntity that = (VozackaDozvolaEntity) o;

        if (id != that.id) return false;
        if (fkOsoba != that.fkOsoba) return false;
        if (fkVozackiKategorija != that.fkVozackiKategorija) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fkOsoba;
        result = 31 * result + fkVozackiKategorija;
        return result;
    }
}
