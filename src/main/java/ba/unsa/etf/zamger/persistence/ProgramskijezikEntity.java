package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "programskijezik", schema = "zamger", catalog = "")
public class ProgramskijezikEntity {
    private int id;
    private String naziv;
    private String geshi;
    private String ekstenzija;
    private String ace;
    private String kompajler;
    private String opcijeKompajlera;
    private String opcijeKompajleraDebug;
    private String debugger;
    private String profiler;
    private String opcijeProfilera;

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
    @Column(name = "geshi")
    public String getGeshi() {
        return geshi;
    }

    public void setGeshi(String geshi) {
        this.geshi = geshi;
    }

    @Basic
    @Column(name = "ekstenzija")
    public String getEkstenzija() {
        return ekstenzija;
    }

    public void setEkstenzija(String ekstenzija) {
        this.ekstenzija = ekstenzija;
    }

    @Basic
    @Column(name = "ace")
    public String getAce() {
        return ace;
    }

    public void setAce(String ace) {
        this.ace = ace;
    }

    @Basic
    @Column(name = "kompajler")
    public String getKompajler() {
        return kompajler;
    }

    public void setKompajler(String kompajler) {
        this.kompajler = kompajler;
    }

    @Basic
    @Column(name = "opcije_kompajlera")
    public String getOpcijeKompajlera() {
        return opcijeKompajlera;
    }

    public void setOpcijeKompajlera(String opcijeKompajlera) {
        this.opcijeKompajlera = opcijeKompajlera;
    }

    @Basic
    @Column(name = "opcije_kompajlera_debug")
    public String getOpcijeKompajleraDebug() {
        return opcijeKompajleraDebug;
    }

    public void setOpcijeKompajleraDebug(String opcijeKompajleraDebug) {
        this.opcijeKompajleraDebug = opcijeKompajleraDebug;
    }

    @Basic
    @Column(name = "debugger")
    public String getDebugger() {
        return debugger;
    }

    public void setDebugger(String debugger) {
        this.debugger = debugger;
    }

    @Basic
    @Column(name = "profiler")
    public String getProfiler() {
        return profiler;
    }

    public void setProfiler(String profiler) {
        this.profiler = profiler;
    }

    @Basic
    @Column(name = "opcije_profilera")
    public String getOpcijeProfilera() {
        return opcijeProfilera;
    }

    public void setOpcijeProfilera(String opcijeProfilera) {
        this.opcijeProfilera = opcijeProfilera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgramskijezikEntity that = (ProgramskijezikEntity) o;

        if (id != that.id) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (geshi != null ? !geshi.equals(that.geshi) : that.geshi != null) return false;
        if (ekstenzija != null ? !ekstenzija.equals(that.ekstenzija) : that.ekstenzija != null) return false;
        if (ace != null ? !ace.equals(that.ace) : that.ace != null) return false;
        if (kompajler != null ? !kompajler.equals(that.kompajler) : that.kompajler != null) return false;
        if (opcijeKompajlera != null ? !opcijeKompajlera.equals(that.opcijeKompajlera) : that.opcijeKompajlera != null)
            return false;
        if (opcijeKompajleraDebug != null ? !opcijeKompajleraDebug.equals(that.opcijeKompajleraDebug) : that.opcijeKompajleraDebug != null)
            return false;
        if (debugger != null ? !debugger.equals(that.debugger) : that.debugger != null) return false;
        if (profiler != null ? !profiler.equals(that.profiler) : that.profiler != null) return false;
        if (opcijeProfilera != null ? !opcijeProfilera.equals(that.opcijeProfilera) : that.opcijeProfilera != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (geshi != null ? geshi.hashCode() : 0);
        result = 31 * result + (ekstenzija != null ? ekstenzija.hashCode() : 0);
        result = 31 * result + (ace != null ? ace.hashCode() : 0);
        result = 31 * result + (kompajler != null ? kompajler.hashCode() : 0);
        result = 31 * result + (opcijeKompajlera != null ? opcijeKompajlera.hashCode() : 0);
        result = 31 * result + (opcijeKompajleraDebug != null ? opcijeKompajleraDebug.hashCode() : 0);
        result = 31 * result + (debugger != null ? debugger.hashCode() : 0);
        result = 31 * result + (profiler != null ? profiler.hashCode() : 0);
        result = 31 * result + (opcijeProfilera != null ? opcijeProfilera.hashCode() : 0);
        return result;
    }
}
