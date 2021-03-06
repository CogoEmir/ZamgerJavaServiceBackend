package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ugovoroucenju_izborni", schema = "zamger", catalog = "")
public class UgovoroucenjuIzborniEntity {
    private int ugovoroucenju;
    private int predmet;
    private int id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ugovoroucenju")
    public int getUgovoroucenju() {
        return ugovoroucenju;
    }

    public void setUgovoroucenju(int ugovoroucenju) {
        this.ugovoroucenju = ugovoroucenju;
    }

    @Basic
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UgovoroucenjuIzborniEntity that = (UgovoroucenjuIzborniEntity) o;

        if (ugovoroucenju != that.ugovoroucenju) return false;
        if (predmet != that.predmet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ugovoroucenju;
        result = 31 * result + predmet;
        return result;
    }
}
