package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_rezultat", schema = "zamger", catalog = "")
public class AnketaRezultatEntity {
    private int id;
    private int anketa;
    private Date zavrsena;
    private Integer predmet;
    private String uniqueId;
    private int akademskaGodina;
    private int studij;
    private int semestar;
    private Integer student;
    private int labgrupa;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "anketa")
    public int getAnketa() {
        return anketa;
    }

    public void setAnketa(int anketa) {
        this.anketa = anketa;
    }

    @Basic
    @Column(name = "zavrsena")
    public Date getZavrsena() {
        return zavrsena;
    }

    public void setZavrsena(Date zavrsena) {
        this.zavrsena = zavrsena;
    }

    @Basic
    @Column(name = "predmet")
    public Integer getPredmet() {
        return predmet;
    }

    public void setPredmet(Integer predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "unique_id")
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
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
    @Column(name = "student")
    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    @Basic
    @Column(name = "labgrupa")
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaRezultatEntity that = (AnketaRezultatEntity) o;

        if (id != that.id) return false;
        if (anketa != that.anketa) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (studij != that.studij) return false;
        if (semestar != that.semestar) return false;
        if (labgrupa != that.labgrupa) return false;
        if (zavrsena != null ? !zavrsena.equals(that.zavrsena) : that.zavrsena != null) return false;
        if (predmet != null ? !predmet.equals(that.predmet) : that.predmet != null) return false;
        if (uniqueId != null ? !uniqueId.equals(that.uniqueId) : that.uniqueId != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + anketa;
        result = 31 * result + (zavrsena != null ? zavrsena.hashCode() : 0);
        result = 31 * result + (predmet != null ? predmet.hashCode() : 0);
        result = 31 * result + (uniqueId != null ? uniqueId.hashCode() : 0);
        result = 31 * result + akademskaGodina;
        result = 31 * result + studij;
        result = 31 * result + semestar;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + labgrupa;
        return result;
    }
}
