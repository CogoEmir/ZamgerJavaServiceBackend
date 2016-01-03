package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@javax.persistence.Table(name = "zavrsni", schema = "zamger", catalog = "")
public class ZavrsniEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String naslov;

    @Basic
    @javax.persistence.Column(name = "naslov")
    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    private String podnaslov;

    @Basic
    @javax.persistence.Column(name = "podnaslov")
    public String getPodnaslov() {
        return podnaslov;
    }

    public void setPodnaslov(String podnaslov) {
        this.podnaslov = podnaslov;
    }

    private int predmet;

    @Basic
    @javax.persistence.Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    private int radNaPredmetu;

    @Basic
    @javax.persistence.Column(name = "rad_na_predmetu")
    public int getRadNaPredmetu() {
        return radNaPredmetu;
    }

    public void setRadNaPredmetu(int radNaPredmetu) {
        this.radNaPredmetu = radNaPredmetu;
    }

    private String akademskaGodina;

    @Basic
    @javax.persistence.Column(name = "akademska_godina")
    public String getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(String akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    private String kratkiPregled;

    @Basic
    @javax.persistence.Column(name = "kratki_pregled")
    public String getKratkiPregled() {
        return kratkiPregled;
    }

    public void setKratkiPregled(String kratkiPregled) {
        this.kratkiPregled = kratkiPregled;
    }

    private String literatura;

    @Basic
    @javax.persistence.Column(name = "literatura")
    public String getLiteratura() {
        return literatura;
    }

    public void setLiteratura(String literatura) {
        this.literatura = literatura;
    }

    private String sazetak;

    @Basic
    @javax.persistence.Column(name = "sazetak")
    public String getSazetak() {
        return sazetak;
    }

    public void setSazetak(String sazetak) {
        this.sazetak = sazetak;
    }

    private String summary;

    @Basic
    @javax.persistence.Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    private int mentor;

    @Basic
    @javax.persistence.Column(name = "mentor")
    public int getMentor() {
        return mentor;
    }

    public void setMentor(int mentor) {
        this.mentor = mentor;
    }

    private int student;

    @Basic
    @javax.persistence.Column(name = "student")
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    private byte kandidatPotvrdjen;

    @Basic
    @javax.persistence.Column(name = "kandidat_potvrdjen")
    public byte getKandidatPotvrdjen() {
        return kandidatPotvrdjen;
    }

    public void setKandidatPotvrdjen(byte kandidatPotvrdjen) {
        this.kandidatPotvrdjen = kandidatPotvrdjen;
    }

    private String biljeska;

    @Basic
    @javax.persistence.Column(name = "biljeska")
    public String getBiljeska() {
        return biljeska;
    }

    public void setBiljeska(String biljeska) {
        this.biljeska = biljeska;
    }

    private int predsjednikKomisije;

    @Basic
    @javax.persistence.Column(name = "predsjednik_komisije")
    public int getPredsjednikKomisije() {
        return predsjednikKomisije;
    }

    public void setPredsjednikKomisije(int predsjednikKomisije) {
        this.predsjednikKomisije = predsjednikKomisije;
    }

    private int clanKomisije;

    @Basic
    @javax.persistence.Column(name = "clan_komisije")
    public int getClanKomisije() {
        return clanKomisije;
    }

    public void setClanKomisije(int clanKomisije) {
        this.clanKomisije = clanKomisije;
    }

    private Date terminOdbrane;

    @Basic
    @javax.persistence.Column(name = "termin_odbrane")
    public Date getTerminOdbrane() {
        return terminOdbrane;
    }

    public void setTerminOdbrane(Date terminOdbrane) {
        this.terminOdbrane = terminOdbrane;
    }

    private int konacnaOcjena;

    @Basic
    @javax.persistence.Column(name = "konacna_ocjena")
    public int getKonacnaOcjena() {
        return konacnaOcjena;
    }

    public void setKonacnaOcjena(int konacnaOcjena) {
        this.konacnaOcjena = konacnaOcjena;
    }

    private String brojDiplome;

    @Basic
    @javax.persistence.Column(name = "broj_diplome")
    public String getBrojDiplome() {
        return brojDiplome;
    }

    public void setBrojDiplome(String brojDiplome) {
        this.brojDiplome = brojDiplome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZavrsniEntity that = (ZavrsniEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (radNaPredmetu != that.radNaPredmetu) return false;
        if (mentor != that.mentor) return false;
        if (student != that.student) return false;
        if (kandidatPotvrdjen != that.kandidatPotvrdjen) return false;
        if (predsjednikKomisije != that.predsjednikKomisije) return false;
        if (clanKomisije != that.clanKomisije) return false;
        if (konacnaOcjena != that.konacnaOcjena) return false;
        if (naslov != null ? !naslov.equals(that.naslov) : that.naslov != null) return false;
        if (podnaslov != null ? !podnaslov.equals(that.podnaslov) : that.podnaslov != null) return false;
        if (akademskaGodina != null ? !akademskaGodina.equals(that.akademskaGodina) : that.akademskaGodina != null)
            return false;
        if (kratkiPregled != null ? !kratkiPregled.equals(that.kratkiPregled) : that.kratkiPregled != null)
            return false;
        if (literatura != null ? !literatura.equals(that.literatura) : that.literatura != null) return false;
        if (sazetak != null ? !sazetak.equals(that.sazetak) : that.sazetak != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (biljeska != null ? !biljeska.equals(that.biljeska) : that.biljeska != null) return false;
        if (terminOdbrane != null ? !terminOdbrane.equals(that.terminOdbrane) : that.terminOdbrane != null)
            return false;
        if (brojDiplome != null ? !brojDiplome.equals(that.brojDiplome) : that.brojDiplome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naslov != null ? naslov.hashCode() : 0);
        result = 31 * result + (podnaslov != null ? podnaslov.hashCode() : 0);
        result = 31 * result + predmet;
        result = 31 * result + radNaPredmetu;
        result = 31 * result + (akademskaGodina != null ? akademskaGodina.hashCode() : 0);
        result = 31 * result + (kratkiPregled != null ? kratkiPregled.hashCode() : 0);
        result = 31 * result + (literatura != null ? literatura.hashCode() : 0);
        result = 31 * result + (sazetak != null ? sazetak.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + mentor;
        result = 31 * result + student;
        result = 31 * result + (int) kandidatPotvrdjen;
        result = 31 * result + (biljeska != null ? biljeska.hashCode() : 0);
        result = 31 * result + predsjednikKomisije;
        result = 31 * result + clanKomisije;
        result = 31 * result + (terminOdbrane != null ? terminOdbrane.hashCode() : 0);
        result = 31 * result + konacnaOcjena;
        result = 31 * result + (brojDiplome != null ? brojDiplome.hashCode() : 0);
        return result;
    }
}
