package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ispit", schema = "zamger", catalog = "")
public class IspitEntity {
    private int id;
    private int predmet;
    private int akademskaGodina;
    private Date datum;
    private int komponenta;
    private Timestamp vrijemeobjave;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "datum")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "komponenta")
    public int getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(int komponenta) {
        this.komponenta = komponenta;
    }

    @Basic
    @Column(name = "vrijemeobjave")
    public Timestamp getVrijemeobjave() {
        return vrijemeobjave;
    }

    public void setVrijemeobjave(Timestamp vrijemeobjave) {
        this.vrijemeobjave = vrijemeobjave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IspitEntity that = (IspitEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (komponenta != that.komponenta) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (vrijemeobjave != null ? !vrijemeobjave.equals(that.vrijemeobjave) : that.vrijemeobjave != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + komponenta;
        result = 31 * result + (vrijemeobjave != null ? vrijemeobjave.hashCode() : 0);
        return result;
    }
}
