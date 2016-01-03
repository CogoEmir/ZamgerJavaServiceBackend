package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kanton", schema = "zamger", catalog = "")
public class KantonEntity {
    private int id;
    private String naziv;
    private String kratkiNaziv;

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
    @Column(name = "kratki_naziv")
    public String getKratkiNaziv() {
        return kratkiNaziv;
    }

    public void setKratkiNaziv(String kratkiNaziv) {
        this.kratkiNaziv = kratkiNaziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KantonEntity that = (KantonEntity) o;

        if (id != that.id) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (kratkiNaziv != null ? !kratkiNaziv.equals(that.kratkiNaziv) : that.kratkiNaziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (kratkiNaziv != null ? kratkiNaziv.hashCode() : 0);
        return result;
    }
}
