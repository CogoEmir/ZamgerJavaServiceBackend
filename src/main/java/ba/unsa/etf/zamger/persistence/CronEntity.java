package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "cron", schema = "zamger", catalog = "")
public class CronEntity {
    private int id;
    private String path;
    private byte aktivan;
    private String godina;
    private String mjesec;
    private String dan;
    private String sat;
    private String minuta;
    private String sekunda;
    private Date zadnjeIzvrsenje;
    private Date sljedeceIzvrsenje;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
    @Column(name = "godina")
    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    @Basic
    @Column(name = "mjesec")
    public String getMjesec() {
        return mjesec;
    }

    public void setMjesec(String mjesec) {
        this.mjesec = mjesec;
    }

    @Basic
    @Column(name = "dan")
    public String getDan() {
        return dan;
    }

    public void setDan(String dan) {
        this.dan = dan;
    }

    @Basic
    @Column(name = "sat")
    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    @Basic
    @Column(name = "minuta")
    public String getMinuta() {
        return minuta;
    }

    public void setMinuta(String minuta) {
        this.minuta = minuta;
    }

    @Basic
    @Column(name = "sekunda")
    public String getSekunda() {
        return sekunda;
    }

    public void setSekunda(String sekunda) {
        this.sekunda = sekunda;
    }

    @Basic
    @Column(name = "zadnje_izvrsenje")
    public Date getZadnjeIzvrsenje() {
        return zadnjeIzvrsenje;
    }

    public void setZadnjeIzvrsenje(Date zadnjeIzvrsenje) {
        this.zadnjeIzvrsenje = zadnjeIzvrsenje;
    }

    @Basic
    @Column(name = "sljedece_izvrsenje")
    public Date getSljedeceIzvrsenje() {
        return sljedeceIzvrsenje;
    }

    public void setSljedeceIzvrsenje(Date sljedeceIzvrsenje) {
        this.sljedeceIzvrsenje = sljedeceIzvrsenje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CronEntity that = (CronEntity) o;

        if (id != that.id) return false;
        if (aktivan != that.aktivan) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (godina != null ? !godina.equals(that.godina) : that.godina != null) return false;
        if (mjesec != null ? !mjesec.equals(that.mjesec) : that.mjesec != null) return false;
        if (dan != null ? !dan.equals(that.dan) : that.dan != null) return false;
        if (sat != null ? !sat.equals(that.sat) : that.sat != null) return false;
        if (minuta != null ? !minuta.equals(that.minuta) : that.minuta != null) return false;
        if (sekunda != null ? !sekunda.equals(that.sekunda) : that.sekunda != null) return false;
        if (zadnjeIzvrsenje != null ? !zadnjeIzvrsenje.equals(that.zadnjeIzvrsenje) : that.zadnjeIzvrsenje != null)
            return false;
        if (sljedeceIzvrsenje != null ? !sljedeceIzvrsenje.equals(that.sljedeceIzvrsenje) : that.sljedeceIzvrsenje != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (int) aktivan;
        result = 31 * result + (godina != null ? godina.hashCode() : 0);
        result = 31 * result + (mjesec != null ? mjesec.hashCode() : 0);
        result = 31 * result + (dan != null ? dan.hashCode() : 0);
        result = 31 * result + (sat != null ? sat.hashCode() : 0);
        result = 31 * result + (minuta != null ? minuta.hashCode() : 0);
        result = 31 * result + (sekunda != null ? sekunda.hashCode() : 0);
        result = 31 * result + (zadnjeIzvrsenje != null ? zadnjeIzvrsenje.hashCode() : 0);
        result = 31 * result + (sljedeceIzvrsenje != null ? sljedeceIzvrsenje.hashCode() : 0);
        return result;
    }
}
