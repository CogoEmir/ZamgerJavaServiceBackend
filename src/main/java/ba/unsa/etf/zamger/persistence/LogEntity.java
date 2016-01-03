package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "log", schema = "zamger", catalog = "")
public class LogEntity {
    private int id;
    private Timestamp vrijeme;
    private int userid;
    private String dogadjaj;
    private byte nivo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Basic
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "dogadjaj")
    public String getDogadjaj() {
        return dogadjaj;
    }

    public void setDogadjaj(String dogadjaj) {
        this.dogadjaj = dogadjaj;
    }

    @Basic
    @Column(name = "nivo")
    public byte getNivo() {
        return nivo;
    }

    public void setNivo(byte nivo) {
        this.nivo = nivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntity logEntity = (LogEntity) o;

        if (id != logEntity.id) return false;
        if (userid != logEntity.userid) return false;
        if (nivo != logEntity.nivo) return false;
        if (vrijeme != null ? !vrijeme.equals(logEntity.vrijeme) : logEntity.vrijeme != null) return false;
        if (dogadjaj != null ? !dogadjaj.equals(logEntity.dogadjaj) : logEntity.dogadjaj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + userid;
        result = 31 * result + (dogadjaj != null ? dogadjaj.hashCode() : 0);
        result = 31 * result + (int) nivo;
        return result;
    }
}
