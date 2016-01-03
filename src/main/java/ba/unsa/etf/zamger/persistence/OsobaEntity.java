package ba.unsa.etf.zamger.persistence;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@javax.persistence.Table(name = "osoba", schema = "zamger", catalog = "")
public class OsobaEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String ime;

    @Basic
    @javax.persistence.Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    private String prezime;

    @Basic
    @javax.persistence.Column(name = "prezime")
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    private String imeoca;

    @Basic
    @javax.persistence.Column(name = "imeoca")
    public String getImeoca() {
        return imeoca;
    }

    public void setImeoca(String imeoca) {
        this.imeoca = imeoca;
    }

    private String prezimeoca;

    @Basic
    @javax.persistence.Column(name = "prezimeoca")
    public String getPrezimeoca() {
        return prezimeoca;
    }

    public void setPrezimeoca(String prezimeoca) {
        this.prezimeoca = prezimeoca;
    }

    private String imemajke;

    @Basic
    @javax.persistence.Column(name = "imemajke")
    public String getImemajke() {
        return imemajke;
    }

    public void setImemajke(String imemajke) {
        this.imemajke = imemajke;
    }

    private String prezimemajke;

    @Basic
    @javax.persistence.Column(name = "prezimemajke")
    public String getPrezimemajke() {
        return prezimemajke;
    }

    public void setPrezimemajke(String prezimemajke) {
        this.prezimemajke = prezimemajke;
    }

    private String spol;

    @Basic
    @javax.persistence.Column(name = "spol")
    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    private String brindexa;

    @Basic
    @javax.persistence.Column(name = "brindexa")
    public String getBrindexa() {
        return brindexa;
    }

    public void setBrindexa(String brindexa) {
        this.brindexa = brindexa;
    }

    private Date datumRodjenja;

    @Basic
    @javax.persistence.Column(name = "datum_rodjenja")
    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    private Integer mjestoRodjenja;

    @Basic
    @javax.persistence.Column(name = "mjesto_rodjenja")
    public Integer getMjestoRodjenja() {
        return mjestoRodjenja;
    }

    public void setMjestoRodjenja(Integer mjestoRodjenja) {
        this.mjestoRodjenja = mjestoRodjenja;
    }

    private Integer nacionalnost;

    @Basic
    @javax.persistence.Column(name = "nacionalnost")
    public Integer getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(Integer nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    private Integer drzavljanstvo;

    @Basic
    @javax.persistence.Column(name = "drzavljanstvo")
    public Integer getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(Integer drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }

    private byte borackeKategorije;

    @Basic
    @javax.persistence.Column(name = "boracke_kategorije")
    public byte getBorackeKategorije() {
        return borackeKategorije;
    }

    public void setBorackeKategorije(byte borackeKategorije) {
        this.borackeKategorije = borackeKategorije;
    }

    private String jmbg;

    @Basic
    @javax.persistence.Column(name = "jmbg")
    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    private String adresa;

    @Basic
    @javax.persistence.Column(name = "adresa")
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    private Integer adresaMjesto;

    @Basic
    @javax.persistence.Column(name = "adresa_mjesto")
    public Integer getAdresaMjesto() {
        return adresaMjesto;
    }

    public void setAdresaMjesto(Integer adresaMjesto) {
        this.adresaMjesto = adresaMjesto;
    }

    private String telefon;

    @Basic
    @javax.persistence.Column(name = "telefon")
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    private Integer kanton;

    @Basic
    @javax.persistence.Column(name = "kanton")
    public Integer getKanton() {
        return kanton;
    }

    public void setKanton(Integer kanton) {
        this.kanton = kanton;
    }

    private byte trebaBrisati;

    @Basic
    @javax.persistence.Column(name = "treba_brisati")
    public byte getTrebaBrisati() {
        return trebaBrisati;
    }

    public void setTrebaBrisati(byte trebaBrisati) {
        this.trebaBrisati = trebaBrisati;
    }

    private int fkAkademskoZvanje;

    @Basic
    @javax.persistence.Column(name = "fk_akademsko_zvanje")
    public int getFkAkademskoZvanje() {
        return fkAkademskoZvanje;
    }

    public void setFkAkademskoZvanje(int fkAkademskoZvanje) {
        this.fkAkademskoZvanje = fkAkademskoZvanje;
    }

    private int fkNaucniStepen;

    @Basic
    @javax.persistence.Column(name = "fk_naucni_stepen")
    public int getFkNaucniStepen() {
        return fkNaucniStepen;
    }

    public void setFkNaucniStepen(int fkNaucniStepen) {
        this.fkNaucniStepen = fkNaucniStepen;
    }

    private String slika;

    @Basic
    @javax.persistence.Column(name = "slika")
    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    private String djevojackoPrezime;

    @Basic
    @javax.persistence.Column(name = "djevojacko_prezime")
    public String getDjevojackoPrezime() {
        return djevojackoPrezime;
    }

    public void setDjevojackoPrezime(String djevojackoPrezime) {
        this.djevojackoPrezime = djevojackoPrezime;
    }

    private int maternjiJezik;

    @Basic
    @javax.persistence.Column(name = "maternji_jezik")
    public int getMaternjiJezik() {
        return maternjiJezik;
    }

    public void setMaternjiJezik(int maternjiJezik) {
        this.maternjiJezik = maternjiJezik;
    }

    private int vozackaDozvola;

    @Basic
    @javax.persistence.Column(name = "vozacka_dozvola")
    public int getVozackaDozvola() {
        return vozackaDozvola;
    }

    public void setVozackaDozvola(int vozackaDozvola) {
        this.vozackaDozvola = vozackaDozvola;
    }

    private int nacinStanovanja;

    @Basic
    @javax.persistence.Column(name = "nacin_stanovanja")
    public int getNacinStanovanja() {
        return nacinStanovanja;
    }

    public void setNacinStanovanja(int nacinStanovanja) {
        this.nacinStanovanja = nacinStanovanja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OsobaEntity that = (OsobaEntity) o;

        if (id != that.id) return false;
        if (borackeKategorije != that.borackeKategorije) return false;
        if (trebaBrisati != that.trebaBrisati) return false;
        if (fkAkademskoZvanje != that.fkAkademskoZvanje) return false;
        if (fkNaucniStepen != that.fkNaucniStepen) return false;
        if (maternjiJezik != that.maternjiJezik) return false;
        if (vozackaDozvola != that.vozackaDozvola) return false;
        if (nacinStanovanja != that.nacinStanovanja) return false;
        if (ime != null ? !ime.equals(that.ime) : that.ime != null) return false;
        if (prezime != null ? !prezime.equals(that.prezime) : that.prezime != null) return false;
        if (imeoca != null ? !imeoca.equals(that.imeoca) : that.imeoca != null) return false;
        if (prezimeoca != null ? !prezimeoca.equals(that.prezimeoca) : that.prezimeoca != null) return false;
        if (imemajke != null ? !imemajke.equals(that.imemajke) : that.imemajke != null) return false;
        if (prezimemajke != null ? !prezimemajke.equals(that.prezimemajke) : that.prezimemajke != null) return false;
        if (spol != null ? !spol.equals(that.spol) : that.spol != null) return false;
        if (brindexa != null ? !brindexa.equals(that.brindexa) : that.brindexa != null) return false;
        if (datumRodjenja != null ? !datumRodjenja.equals(that.datumRodjenja) : that.datumRodjenja != null)
            return false;
        if (mjestoRodjenja != null ? !mjestoRodjenja.equals(that.mjestoRodjenja) : that.mjestoRodjenja != null)
            return false;
        if (nacionalnost != null ? !nacionalnost.equals(that.nacionalnost) : that.nacionalnost != null) return false;
        if (drzavljanstvo != null ? !drzavljanstvo.equals(that.drzavljanstvo) : that.drzavljanstvo != null)
            return false;
        if (jmbg != null ? !jmbg.equals(that.jmbg) : that.jmbg != null) return false;
        if (adresa != null ? !adresa.equals(that.adresa) : that.adresa != null) return false;
        if (adresaMjesto != null ? !adresaMjesto.equals(that.adresaMjesto) : that.adresaMjesto != null) return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (kanton != null ? !kanton.equals(that.kanton) : that.kanton != null) return false;
        if (slika != null ? !slika.equals(that.slika) : that.slika != null) return false;
        if (djevojackoPrezime != null ? !djevojackoPrezime.equals(that.djevojackoPrezime) : that.djevojackoPrezime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ime != null ? ime.hashCode() : 0);
        result = 31 * result + (prezime != null ? prezime.hashCode() : 0);
        result = 31 * result + (imeoca != null ? imeoca.hashCode() : 0);
        result = 31 * result + (prezimeoca != null ? prezimeoca.hashCode() : 0);
        result = 31 * result + (imemajke != null ? imemajke.hashCode() : 0);
        result = 31 * result + (prezimemajke != null ? prezimemajke.hashCode() : 0);
        result = 31 * result + (spol != null ? spol.hashCode() : 0);
        result = 31 * result + (brindexa != null ? brindexa.hashCode() : 0);
        result = 31 * result + (datumRodjenja != null ? datumRodjenja.hashCode() : 0);
        result = 31 * result + (mjestoRodjenja != null ? mjestoRodjenja.hashCode() : 0);
        result = 31 * result + (nacionalnost != null ? nacionalnost.hashCode() : 0);
        result = 31 * result + (drzavljanstvo != null ? drzavljanstvo.hashCode() : 0);
        result = 31 * result + (int) borackeKategorije;
        result = 31 * result + (jmbg != null ? jmbg.hashCode() : 0);
        result = 31 * result + (adresa != null ? adresa.hashCode() : 0);
        result = 31 * result + (adresaMjesto != null ? adresaMjesto.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (kanton != null ? kanton.hashCode() : 0);
        result = 31 * result + (int) trebaBrisati;
        result = 31 * result + fkAkademskoZvanje;
        result = 31 * result + fkNaucniStepen;
        result = 31 * result + (slika != null ? slika.hashCode() : 0);
        result = 31 * result + (djevojackoPrezime != null ? djevojackoPrezime.hashCode() : 0);
        result = 31 * result + maternjiJezik;
        result = 31 * result + vozackaDozvola;
        result = 31 * result + nacinStanovanja;
        return result;
    }
}
