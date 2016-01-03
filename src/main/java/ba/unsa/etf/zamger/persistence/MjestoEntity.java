package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "mjesto", schema = "zamger", catalog = "")
public class MjestoEntity {
    private int id;
    private String naziv;
    private int opcina;
    private int drzava;
    private String opcinaVanBih;

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
    @Column(name = "drzava")
    public int getDrzava() {
        return drzava;
    }

    public void setDrzava(int drzava) {
        this.drzava = drzava;
    }

    @Basic
    @Column(name = "opcina_van_bih")
    public String getOpcinaVanBih() {
        return opcinaVanBih;
    }

    public void setOpcinaVanBih(String opcinaVanBih) {
        this.opcinaVanBih = opcinaVanBih;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MjestoEntity that = (MjestoEntity) o;

        if (id != that.id) return false;
        if (opcina != that.opcina) return false;
        if (drzava != that.drzava) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (opcinaVanBih != null ? !opcinaVanBih.equals(that.opcinaVanBih) : that.opcinaVanBih != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + opcina;
        result = 31 * result + drzava;
        result = 31 * result + (opcinaVanBih != null ? opcinaVanBih.hashCode() : 0);
        return result;
    }
}
