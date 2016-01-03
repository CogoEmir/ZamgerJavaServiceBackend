package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "tipstudija", schema = "zamger", catalog = "")
public class TipstudijaEntity {
    private int id;
    private String naziv;
    private byte ciklus;
    private byte trajanje;
    private byte mogucUpis;

    @Basic
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "ciklus")
    public byte getCiklus() {
        return ciklus;
    }

    public void setCiklus(byte ciklus) {
        this.ciklus = ciklus;
    }

    @Basic
    @Column(name = "trajanje")
    public byte getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(byte trajanje) {
        this.trajanje = trajanje;
    }

    @Basic
    @Column(name = "moguc_upis")
    public byte getMogucUpis() {
        return mogucUpis;
    }

    public void setMogucUpis(byte mogucUpis) {
        this.mogucUpis = mogucUpis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipstudijaEntity that = (TipstudijaEntity) o;

        if (id != that.id) return false;
        if (ciklus != that.ciklus) return false;
        if (trajanje != that.trajanje) return false;
        if (mogucUpis != that.mogucUpis) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (int) ciklus;
        result = 31 * result + (int) trajanje;
        result = 31 * result + (int) mogucUpis;
        return result;
    }
}
