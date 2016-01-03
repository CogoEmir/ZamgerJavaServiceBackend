package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "stdin", schema = "zamger", catalog = "")
public class StdinEntity {
    private long id;
    private long zadaca;
    private int redniBroj;
    private String ulaz;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zadaca")
    public long getZadaca() {
        return zadaca;
    }

    public void setZadaca(long zadaca) {
        this.zadaca = zadaca;
    }

    @Basic
    @Column(name = "redni_broj")
    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    @Basic
    @Column(name = "ulaz")
    public String getUlaz() {
        return ulaz;
    }

    public void setUlaz(String ulaz) {
        this.ulaz = ulaz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StdinEntity that = (StdinEntity) o;

        if (id != that.id) return false;
        if (zadaca != that.zadaca) return false;
        if (redniBroj != that.redniBroj) return false;
        if (ulaz != null ? !ulaz.equals(that.ulaz) : that.ulaz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (zadaca ^ (zadaca >>> 32));
        result = 31 * result + redniBroj;
        result = 31 * result + (ulaz != null ? ulaz.hashCode() : 0);
        return result;
    }
}
