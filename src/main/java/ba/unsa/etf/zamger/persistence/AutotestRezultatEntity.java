package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "autotest_rezultat", schema = "zamger", catalog = "")
@IdClass(AutotestRezultatEntityPK.class)
public class AutotestRezultatEntity {
    private int autotest;
    private int student;
    private String izlazPrograma;
    private String status;
    private String nalaz;
    private Timestamp vrijeme;
    private int trajanje;
    private String testniSistem;

    @Id
    @Column(name = "autotest")
    public int getAutotest() {
        return autotest;
    }

    public void setAutotest(int autotest) {
        this.autotest = autotest;
    }

    @Id
    @Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Basic
    @Column(name = "izlaz_programa")
    public String getIzlazPrograma() {
        return izlazPrograma;
    }

    public void setIzlazPrograma(String izlazPrograma) {
        this.izlazPrograma = izlazPrograma;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "nalaz")
    public String getNalaz() {
        return nalaz;
    }

    public void setNalaz(String nalaz) {
        this.nalaz = nalaz;
    }

    @Basic
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Basic
    @Column(name = "trajanje")
    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    @Basic
    @Column(name = "testni_sistem")
    public String getTestniSistem() {
        return testniSistem;
    }

    public void setTestniSistem(String testniSistem) {
        this.testniSistem = testniSistem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutotestRezultatEntity that = (AutotestRezultatEntity) o;

        if (autotest != that.autotest) return false;
        if (student != that.student) return false;
        if (trajanje != that.trajanje) return false;
        if (izlazPrograma != null ? !izlazPrograma.equals(that.izlazPrograma) : that.izlazPrograma != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (nalaz != null ? !nalaz.equals(that.nalaz) : that.nalaz != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;
        if (testniSistem != null ? !testniSistem.equals(that.testniSistem) : that.testniSistem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autotest;
        result = 31 * result + student;
        result = 31 * result + (izlazPrograma != null ? izlazPrograma.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (nalaz != null ? nalaz.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + trajanje;
        result = 31 * result + (testniSistem != null ? testniSistem.hashCode() : 0);
        return result;
    }
}
