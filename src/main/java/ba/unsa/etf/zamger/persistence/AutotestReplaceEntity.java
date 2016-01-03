package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "autotest_replace", schema = "zamger", catalog = "")
public class AutotestReplaceEntity {
    private int id;
    private int zadaca;
    private int zadatak;
    private String tip;
    private String specifikacija;
    private String zamijeni;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zadaca")
    public int getZadaca() {
        return zadaca;
    }

    public void setZadaca(int zadaca) {
        this.zadaca = zadaca;
    }

    @Basic
    @Column(name = "zadatak")
    public int getZadatak() {
        return zadatak;
    }

    public void setZadatak(int zadatak) {
        this.zadatak = zadatak;
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
    @Column(name = "specifikacija")
    public String getSpecifikacija() {
        return specifikacija;
    }

    public void setSpecifikacija(String specifikacija) {
        this.specifikacija = specifikacija;
    }

    @Basic
    @Column(name = "zamijeni")
    public String getZamijeni() {
        return zamijeni;
    }

    public void setZamijeni(String zamijeni) {
        this.zamijeni = zamijeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutotestReplaceEntity that = (AutotestReplaceEntity) o;

        if (id != that.id) return false;
        if (zadaca != that.zadaca) return false;
        if (zadatak != that.zadatak) return false;
        if (tip != null ? !tip.equals(that.tip) : that.tip != null) return false;
        if (specifikacija != null ? !specifikacija.equals(that.specifikacija) : that.specifikacija != null)
            return false;
        if (zamijeni != null ? !zamijeni.equals(that.zamijeni) : that.zamijeni != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + zadaca;
        result = 31 * result + zadatak;
        result = 31 * result + (tip != null ? tip.hashCode() : 0);
        result = 31 * result + (specifikacija != null ? specifikacija.hashCode() : 0);
        result = 31 * result + (zamijeni != null ? zamijeni.hashCode() : 0);
        return result;
    }
}
