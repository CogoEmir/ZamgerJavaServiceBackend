package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_izbori_pitanja", schema = "zamger", catalog = "")
public class AnketaIzboriPitanjaEntity {
    private int id;
    private int pitanje;
    private String izbor;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pitanje")
    public int getPitanje() {
        return pitanje;
    }

    public void setPitanje(int pitanje) {
        this.pitanje = pitanje;
    }

    @Basic
    @Column(name = "izbor")
    public String getIzbor() {
        return izbor;
    }

    public void setIzbor(String izbor) {
        this.izbor = izbor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaIzboriPitanjaEntity that = (AnketaIzboriPitanjaEntity) o;

        if (id != that.id) return false;
        if (pitanje != that.pitanje) return false;
        if (izbor != null ? !izbor.equals(that.izbor) : that.izbor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + pitanje;
        result = 31 * result + (izbor != null ? izbor.hashCode() : 0);
        return result;
    }
}
