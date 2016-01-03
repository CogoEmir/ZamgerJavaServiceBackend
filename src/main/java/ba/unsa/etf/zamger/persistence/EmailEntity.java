package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "email", schema = "zamger", catalog = "")
public class EmailEntity {
    private int id;
    private int osoba;
    private String adresa;
    private byte sistemska;

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
    @Column(name = "adresa")
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Basic
    @Column(name = "sistemska")
    public byte getSistemska() {
        return sistemska;
    }

    public void setSistemska(byte sistemska) {
        this.sistemska = sistemska;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailEntity that = (EmailEntity) o;

        if (id != that.id) return false;
        if (osoba != that.osoba) return false;
        if (sistemska != that.sistemska) return false;
        if (adresa != null ? !adresa.equals(that.adresa) : that.adresa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + osoba;
        result = 31 * result + (adresa != null ? adresa.hashCode() : 0);
        result = 31 * result + (int) sistemska;
        return result;
    }
}
