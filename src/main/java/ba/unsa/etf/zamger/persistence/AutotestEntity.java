package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "autotest", schema = "zamger", catalog = "")
public class AutotestEntity {
    private int id;
    private int zadaca;
    private int zadatak;
    private String kod;
    private String rezultat;
    private String altRezultat;
    private byte fuzzy;
    private String globalScope;
    private String pozicijaGlobala;
    private String stdin;
    private byte partialMatch;
    private byte aktivan;
    private byte sakriven;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zadaca")
    public int getZadaca() {
        return zadaca;
    }

    public void setZadaca(int zadaca) {
        this.zadaca = zadaca;
    }

    @Basic
    @Column(name = "zadatak")
    public int getZadatak() {
        return zadatak;
    }

    public void setZadatak(int zadatak) {
        this.zadatak = zadatak;
    }

    @Basic
    @Column(name = "kod")
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Basic
    @Column(name = "rezultat")
    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    @Basic
    @Column(name = "alt_rezultat")
    public String getAltRezultat() {
        return altRezultat;
    }

    public void setAltRezultat(String altRezultat) {
        this.altRezultat = altRezultat;
    }

    @Basic
    @Column(name = "fuzzy")
    public byte getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(byte fuzzy) {
        this.fuzzy = fuzzy;
    }

    @Basic
    @Column(name = "global_scope")
    public String getGlobalScope() {
        return globalScope;
    }

    public void setGlobalScope(String globalScope) {
        this.globalScope = globalScope;
    }

    @Basic
    @Column(name = "pozicija_globala")
    public String getPozicijaGlobala() {
        return pozicijaGlobala;
    }

    public void setPozicijaGlobala(String pozicijaGlobala) {
        this.pozicijaGlobala = pozicijaGlobala;
    }

    @Basic
    @Column(name = "stdin")
    public String getStdin() {
        return stdin;
    }

    public void setStdin(String stdin) {
        this.stdin = stdin;
    }

    @Basic
    @Column(name = "partial_match")
    public byte getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(byte partialMatch) {
        this.partialMatch = partialMatch;
    }

    @Basic
    @Column(name = "aktivan")
    public byte getAktivan() {
        return aktivan;
    }

    public void setAktivan(byte aktivan) {
        this.aktivan = aktivan;
    }

    @Basic
    @Column(name = "sakriven")
    public byte getSakriven() {
        return sakriven;
    }

    public void setSakriven(byte sakriven) {
        this.sakriven = sakriven;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutotestEntity that = (AutotestEntity) o;

        if (id != that.id) return false;
        if (zadaca != that.zadaca) return false;
        if (zadatak != that.zadatak) return false;
        if (fuzzy != that.fuzzy) return false;
        if (partialMatch != that.partialMatch) return false;
        if (aktivan != that.aktivan) return false;
        if (sakriven != that.sakriven) return false;
        if (kod != null ? !kod.equals(that.kod) : that.kod != null) return false;
        if (rezultat != null ? !rezultat.equals(that.rezultat) : that.rezultat != null) return false;
        if (altRezultat != null ? !altRezultat.equals(that.altRezultat) : that.altRezultat != null) return false;
        if (globalScope != null ? !globalScope.equals(that.globalScope) : that.globalScope != null) return false;
        if (pozicijaGlobala != null ? !pozicijaGlobala.equals(that.pozicijaGlobala) : that.pozicijaGlobala != null)
            return false;
        if (stdin != null ? !stdin.equals(that.stdin) : that.stdin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + zadaca;
        result = 31 * result + zadatak;
        result = 31 * result + (kod != null ? kod.hashCode() : 0);
        result = 31 * result + (rezultat != null ? rezultat.hashCode() : 0);
        result = 31 * result + (altRezultat != null ? altRezultat.hashCode() : 0);
        result = 31 * result + (int) fuzzy;
        result = 31 * result + (globalScope != null ? globalScope.hashCode() : 0);
        result = 31 * result + (pozicijaGlobala != null ? pozicijaGlobala.hashCode() : 0);
        result = 31 * result + (stdin != null ? stdin.hashCode() : 0);
        result = 31 * result + (int) partialMatch;
        result = 31 * result + (int) aktivan;
        result = 31 * result + (int) sakriven;
        return result;
    }
}
