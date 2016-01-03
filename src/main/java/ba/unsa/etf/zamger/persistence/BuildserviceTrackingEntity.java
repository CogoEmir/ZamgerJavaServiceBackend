package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "buildservice_tracking", schema = "zamger", catalog = "")
public class BuildserviceTrackingEntity {
    private int zadatak;
    private String buildhost;
    private Timestamp vrijeme;

    @Id
    @Column(name = "zadatak")
    public int getZadatak() {
        return zadatak;
    }

    public void setZadatak(int zadatak) {
        this.zadatak = zadatak;
    }

    @Basic
    @Column(name = "buildhost")
    public String getBuildhost() {
        return buildhost;
    }

    public void setBuildhost(String buildhost) {
        this.buildhost = buildhost;
    }

    @Basic
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildserviceTrackingEntity that = (BuildserviceTrackingEntity) o;

        if (zadatak != that.zadatak) return false;
        if (buildhost != null ? !buildhost.equals(that.buildhost) : that.buildhost != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zadatak;
        result = 31 * result + (buildhost != null ? buildhost.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        return result;
    }
}
