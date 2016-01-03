package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "raspored", schema = "zamger", catalog = "")
public class RasporedEntity {
    private int id;
    private int studij;
    private int akademskaGodina;
    private int semestar;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "studij")
    public int getStudij() {
        return studij;
    }

    public void setStudij(int studij) {
        this.studij = studij;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "semestar")
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RasporedEntity that = (RasporedEntity) o;

        if (id != that.id) return false;
        if (studij != that.studij) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (semestar != that.semestar) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + studij;
        result = 31 * result + akademskaGodina;
        result = 31 * result + semestar;
        return result;
    }
}
