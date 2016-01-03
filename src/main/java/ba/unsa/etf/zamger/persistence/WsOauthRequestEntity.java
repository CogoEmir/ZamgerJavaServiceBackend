package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ws_oauth_request", schema = "zamger", catalog = "")
public class WsOauthRequestEntity {
    private int id;
    private String code;
    private Integer osoba;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "osoba")
    public Integer getOsoba() {
        return osoba;
    }

    public void setOsoba(Integer osoba) {
        this.osoba = osoba;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WsOauthRequestEntity that = (WsOauthRequestEntity) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (osoba != null ? !osoba.equals(that.osoba) : that.osoba != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (osoba != null ? osoba.hashCode() : 0);
        return result;
    }
}
