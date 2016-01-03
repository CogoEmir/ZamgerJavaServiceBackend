package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "srednja_skola", schema = "zamger", catalog = "")
public class SrednjaSkolaEntity {
    private int id;
    private String naziv;
    private int opcina;
    private byte domaca;

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
    @Column(name = "opcina")
    public int getOpcina() {
        return opcina;
    }

    public void setOpcina(int opcina) {
        this.opcina = opcina;
    }

    @Basic
    @Column(name = "domaca")
    public byte getDomaca() {
        return domaca;
    }

    public void setDomaca(byte domaca) {
        this.domaca = domaca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SrednjaSkolaEntity that = (SrednjaSkolaEntity) o;

        if (id != that.id) return false;
        if (opcina != that.opcina) return false;
        if (domaca != that.domaca) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + opcina;
        result = 31 * result + (int) domaca;
        return result;
    }
}
