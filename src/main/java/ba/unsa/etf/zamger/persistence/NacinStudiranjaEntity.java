package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "nacin_studiranja", schema = "zamger", catalog = "")
public class NacinStudiranjaEntity {
    private int id;
    private String naziv;
    private byte mogucUpis;

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

        NacinStudiranjaEntity that = (NacinStudiranjaEntity) o;

        if (id != that.id) return false;
        if (mogucUpis != that.mogucUpis) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (int) mogucUpis;
        return result;
    }
}
