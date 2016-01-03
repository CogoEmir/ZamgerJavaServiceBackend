package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "acl_url", schema = "zamger", catalog = "")
public class AclUrlEntity {
    private int id;
    private int osoba;
    private String url;

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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclUrlEntity that = (AclUrlEntity) o;

        if (osoba != that.osoba) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = osoba;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
