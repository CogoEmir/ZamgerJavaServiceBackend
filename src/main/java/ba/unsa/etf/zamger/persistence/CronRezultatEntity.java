package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "cron_rezultat", schema = "zamger", catalog = "")
public class CronRezultatEntity {
    private int id;
    private int cron;
    private String izlaz;
    private int returnValue;
    private Date vrijeme;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cron")
    public int getCron() {
        return cron;
    }

    public void setCron(int cron) {
        this.cron = cron;
    }

    @Basic
    @Column(name = "izlaz")
    public String getIzlaz() {
        return izlaz;
    }

    public void setIzlaz(String izlaz) {
        this.izlaz = izlaz;
    }

    @Basic
    @Column(name = "return_value")
    public int getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }

    @Basic
    @Column(name = "vrijeme")
    public Date getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Date vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CronRezultatEntity that = (CronRezultatEntity) o;

        if (id != that.id) return false;
        if (cron != that.cron) return false;
        if (returnValue != that.returnValue) return false;
        if (izlaz != null ? !izlaz.equals(that.izlaz) : that.izlaz != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cron;
        result = 31 * result + (izlaz != null ? izlaz.hashCode() : 0);
        result = 31 * result + returnValue;
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        return result;
    }
}
