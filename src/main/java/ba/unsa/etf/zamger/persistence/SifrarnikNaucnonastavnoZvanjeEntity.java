package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "sifrarnik_naucnonastavno_zvanje", schema = "zamger", catalog = "")
public class SifrarnikNaucnonastavnoZvanjeEntity {
    private int id;
    private String naziv;
    private String titula;

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
    @Column(name = "titula")
    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SifrarnikNaucnonastavnoZvanjeEntity that = (SifrarnikNaucnonastavnoZvanjeEntity) o;

        if (id != that.id) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (titula != null ? !titula.equals(that.titula) : that.titula != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (titula != null ? titula.hashCode() : 0);
        return result;
    }
}
