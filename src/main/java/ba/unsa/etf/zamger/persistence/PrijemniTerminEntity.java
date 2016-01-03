package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "prijemni_termin", schema = "zamger", catalog = "")
public class PrijemniTerminEntity {
    private int id;
    private int akademskaGodina;
    private Date datum;
    private byte ciklusStudija;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "ciklus_studija")
    public byte getCiklusStudija() {
        return ciklusStudija;
    }

    public void setCiklusStudija(byte ciklusStudija) {
        this.ciklusStudija = ciklusStudija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrijemniTerminEntity that = (PrijemniTerminEntity) o;

        if (id != that.id) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (ciklusStudija != that.ciklusStudija) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + akademskaGodina;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (int) ciklusStudija;
        return result;
    }
}
