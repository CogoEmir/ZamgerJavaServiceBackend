package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "auth", schema = "zamger", catalog = "")
@IdClass(AuthEntityPK.class)
public class AuthEntity {
    private int id;
    private String login;
    private String password;
    private byte admin;
    private String externalId;
    private byte aktivan;
    private Date posljednjiPristup;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "admin")
    public byte getAdmin() {
        return admin;
    }

    public void setAdmin(byte admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Basic
    @Column(name = "aktivan")
    public byte getAktivan() {
        return aktivan;
    }

    public void setAktivan(byte aktivan) {
        this.aktivan = aktivan;
    }

    @Basic
    @Column(name = "posljednji_pristup")
    public Date getPosljednjiPristup() {
        return posljednjiPristup;
    }

    public void setPosljednjiPristup(Date posljednjiPristup) {
        this.posljednjiPristup = posljednjiPristup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthEntity that = (AuthEntity) o;

        if (id != that.id) return false;
        if (admin != that.admin) return false;
        if (aktivan != that.aktivan) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (externalId != null ? !externalId.equals(that.externalId) : that.externalId != null) return false;
        if (posljednjiPristup != null ? !posljednjiPristup.equals(that.posljednjiPristup) : that.posljednjiPristup != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) admin;
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (int) aktivan;
        result = 31 * result + (posljednjiPristup != null ? posljednjiPristup.hashCode() : 0);
        return result;
    }
}
