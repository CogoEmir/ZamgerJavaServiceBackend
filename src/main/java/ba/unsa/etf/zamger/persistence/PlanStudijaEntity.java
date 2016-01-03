package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "plan_studija", schema = "zamger", catalog = "")
public class PlanStudijaEntity {
    private int id;
    private int godinaVazenja;
    private int studij;
    private int semestar;
    private int predmet;
    private byte obavezan;


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "godina_vazenja")
    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public void setGodinaVazenja(int godinaVazenja) {
        this.godinaVazenja = godinaVazenja;
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
    @Column(name = "semestar")
    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Basic
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "obavezan")
    public byte getObavezan() {
        return obavezan;
    }

    public void setObavezan(byte obavezan) {
        this.obavezan = obavezan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanStudijaEntity that = (PlanStudijaEntity) o;

        if (godinaVazenja != that.godinaVazenja) return false;
        if (studij != that.studij) return false;
        if (semestar != that.semestar) return false;
        if (predmet != that.predmet) return false;
        if (obavezan != that.obavezan) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = godinaVazenja;
        result = 31 * result + studij;
        result = 31 * result + semestar;
        result = 31 * result + predmet;
        result = 31 * result + (int) obavezan;
        return result;
    }
}
