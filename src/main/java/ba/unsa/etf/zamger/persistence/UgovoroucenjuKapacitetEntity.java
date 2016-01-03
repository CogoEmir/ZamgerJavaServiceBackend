package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ugovoroucenju_kapacitet", schema = "zamger", catalog = "")
public class UgovoroucenjuKapacitetEntity {
    private int predmet;
    private int akademskaGodina;
    private int kapacitet;
    private int kapacitetEkstra;

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
    @Column(name = "kapacitet")
    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    @Basic
    @Column(name = "kapacitet_ekstra")
    public int getKapacitetEkstra() {
        return kapacitetEkstra;
    }

    public void setKapacitetEkstra(int kapacitetEkstra) {
        this.kapacitetEkstra = kapacitetEkstra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UgovoroucenjuKapacitetEntity that = (UgovoroucenjuKapacitetEntity) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (kapacitet != that.kapacitet) return false;
        if (kapacitetEkstra != that.kapacitetEkstra) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + kapacitet;
        result = 31 * result + kapacitetEkstra;
        return result;
    }
}
