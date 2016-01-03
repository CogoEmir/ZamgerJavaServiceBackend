package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "cas", schema = "zamger", catalog = "")
public class CasEntity {
    private int id;
    private Date datum;
    private Time vrijeme;
    private int labgrupa;
    private int nastavnik;
    private int komponenta;
    private int kviz;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "vrijeme")
    public Time getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Time vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Basic
    @Column(name = "labgrupa")
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Basic
    @Column(name = "nastavnik")
    public int getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(int nastavnik) {
        this.nastavnik = nastavnik;
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
    @Column(name = "kviz")
    public int getKviz() {
        return kviz;
    }

    public void setKviz(int kviz) {
        this.kviz = kviz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CasEntity casEntity = (CasEntity) o;

        if (id != casEntity.id) return false;
        if (labgrupa != casEntity.labgrupa) return false;
        if (nastavnik != casEntity.nastavnik) return false;
        if (komponenta != casEntity.komponenta) return false;
        if (kviz != casEntity.kviz) return false;
        if (datum != null ? !datum.equals(casEntity.datum) : casEntity.datum != null) return false;
        if (vrijeme != null ? !vrijeme.equals(casEntity.vrijeme) : casEntity.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + labgrupa;
        result = 31 * result + nastavnik;
        result = 31 * result + komponenta;
        result = 31 * result + kviz;
        return result;
    }
}
