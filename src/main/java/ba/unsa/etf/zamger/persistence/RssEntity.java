package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "rss", schema = "zamger", catalog = "")
public class RssEntity {
    private String id;
    private int auth;
    private Date access;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "auth")
    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }

    @Basic
    @Column(name = "access")
    public Date getAccess() {
        return access;
    }

    public void setAccess(Date access) {
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RssEntity rssEntity = (RssEntity) o;

        if (auth != rssEntity.auth) return false;
        if (id != null ? !id.equals(rssEntity.id) : rssEntity.id != null) return false;
        if (access != null ? !access.equals(rssEntity.access) : rssEntity.access != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + auth;
        result = 31 * result + (access != null ? access.hashCode() : 0);
        return result;
    }
}
