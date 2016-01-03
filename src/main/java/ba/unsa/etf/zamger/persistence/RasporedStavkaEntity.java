package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "raspored_stavka", schema = "zamger", catalog = "")
public class RasporedStavkaEntity {
    private int id;
    private int raspored;
    private byte danUSedmici;
    private int predmet;
    private int vrijemePocetak;
    private int vrijemeKraj;
    private int sala;
    private String tip;
    private int labgrupa;
    private int dupla;
    private byte isjeckana;
    private Time finiPocetak;
    private Time finiKraj;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "raspored")
    public int getRaspored() {
        return raspored;
    }

    public void setRaspored(int raspored) {
        this.raspored = raspored;
    }

    @Basic
    @Column(name = "dan_u_sedmici")
    public byte getDanUSedmici() {
        return danUSedmici;
    }

    public void setDanUSedmici(byte danUSedmici) {
        this.danUSedmici = danUSedmici;
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
    @Column(name = "vrijeme_pocetak")
    public int getVrijemePocetak() {
        return vrijemePocetak;
    }

    public void setVrijemePocetak(int vrijemePocetak) {
        this.vrijemePocetak = vrijemePocetak;
    }

    @Basic
    @Column(name = "vrijeme_kraj")
    public int getVrijemeKraj() {
        return vrijemeKraj;
    }

    public void setVrijemeKraj(int vrijemeKraj) {
        this.vrijemeKraj = vrijemeKraj;
    }

    @Basic
    @Column(name = "sala")
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Basic
    @Column(name = "tip")
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
    @Column(name = "dupla")
    public int getDupla() {
        return dupla;
    }

    public void setDupla(int dupla) {
        this.dupla = dupla;
    }

    @Basic
    @Column(name = "isjeckana")
    public byte getIsjeckana() {
        return isjeckana;
    }

    public void setIsjeckana(byte isjeckana) {
        this.isjeckana = isjeckana;
    }

    @Basic
    @Column(name = "fini_pocetak")
    public Time getFiniPocetak() {
        return finiPocetak;
    }

    public void setFiniPocetak(Time finiPocetak) {
        this.finiPocetak = finiPocetak;
    }

    @Basic
    @Column(name = "fini_kraj")
    public Time getFiniKraj() {
        return finiKraj;
    }

    public void setFiniKraj(Time finiKraj) {
        this.finiKraj = finiKraj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RasporedStavkaEntity that = (RasporedStavkaEntity) o;

        if (id != that.id) return false;
        if (raspored != that.raspored) return false;
        if (danUSedmici != that.danUSedmici) return false;
        if (predmet != that.predmet) return false;
        if (vrijemePocetak != that.vrijemePocetak) return false;
        if (vrijemeKraj != that.vrijemeKraj) return false;
        if (sala != that.sala) return false;
        if (labgrupa != that.labgrupa) return false;
        if (dupla != that.dupla) return false;
        if (isjeckana != that.isjeckana) return false;
        if (tip != null ? !tip.equals(that.tip) : that.tip != null) return false;
        if (finiPocetak != null ? !finiPocetak.equals(that.finiPocetak) : that.finiPocetak != null) return false;
        if (finiKraj != null ? !finiKraj.equals(that.finiKraj) : that.finiKraj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + raspored;
        result = 31 * result + (int) danUSedmici;
        result = 31 * result + predmet;
        result = 31 * result + vrijemePocetak;
        result = 31 * result + vrijemeKraj;
        result = 31 * result + sala;
        result = 31 * result + (tip != null ? tip.hashCode() : 0);
        result = 31 * result + labgrupa;
        result = 31 * result + dupla;
        result = 31 * result + (int) isjeckana;
        result = 31 * result + (finiPocetak != null ? finiPocetak.hashCode() : 0);
        result = 31 * result + (finiKraj != null ? finiKraj.hashCode() : 0);
        return result;
    }
}
