package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ws_session", schema = "zamger", catalog = "")
public class WsSessionEntity {
    private int id;
    private Integer osoba;
    private String token;

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
    public Integer getOsoba() {
        return osoba;
    }

    public void setOsoba(Integer osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WsSessionEntity that = (WsSessionEntity) o;

        if (id != that.id) return false;
        if (osoba != null ? !osoba.equals(that.osoba) : that.osoba != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (osoba != null ? osoba.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }
}
