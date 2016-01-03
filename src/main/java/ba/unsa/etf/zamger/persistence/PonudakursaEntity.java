package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ponudakursa", schema = "zamger", catalog = "")
public class PonudakursaEntity {
    private int id;
    private int predmet;
    private int studij;
    private int semestar;
    private byte obavezan;
    private int akademskaGodina;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "obavezan")
    public byte getObavezan() {
        return obavezan;
    }

    public void setObavezan(byte obavezan) {
        this.obavezan = obavezan;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PonudakursaEntity that = (PonudakursaEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (studij != that.studij) return false;
        if (semestar != that.semestar) return false;
        if (obavezan != that.obavezan) return false;
        if (akademskaGodina != that.akademskaGodina) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + predmet;
        result = 31 * result + studij;
        result = 31 * result + semestar;
        result = 31 * result + (int) obavezan;
        result = 31 * result + akademskaGodina;
        return result;
    }
}
