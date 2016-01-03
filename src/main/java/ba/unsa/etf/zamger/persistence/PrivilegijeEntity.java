package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "privilegije", schema = "zamger", catalog = "")
public class PrivilegijeEntity {
    private int osoba;
    private String privilegija;
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
    @Column(name = "privilegija")
    public String getPrivilegija() {
        return privilegija;
    }

    public void setPrivilegija(String privilegija) {
        this.privilegija = privilegija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivilegijeEntity that = (PrivilegijeEntity) o;

        if (osoba != that.osoba) return false;
        if (privilegija != null ? !privilegija.equals(that.privilegija) : that.privilegija != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = osoba;
        result = 31 * result + (privilegija != null ? privilegija.hashCode() : 0);
        return result;
    }
}
