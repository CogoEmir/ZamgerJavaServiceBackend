package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zadaca", schema = "zamger", catalog = "")
public class ZadacaEntity {
    private int id;
    private String naziv;
    private int predmet;
    private int akademskaGodina;
    private byte zadataka;
    private double bodova;
    private Date rok;
    private byte aktivna;
    private int programskijezik;
    private byte automatskoTestiranje;
    private byte attachment;
    private String dozvoljeneEkstenzije;
    private String postavkaZadace;
    private int komponenta;
    private Timestamp vrijemeobjave;

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
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
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
    @Column(name = "zadataka")
    public byte getZadataka() {
        return zadataka;
    }

    public void setZadataka(byte zadataka) {
        this.zadataka = zadataka;
    }

    @Basic
    @Column(name = "bodova")
    public double getBodova() {
        return bodova;
    }

    public void setBodova(double bodova) {
        this.bodova = bodova;
    }

    @Basic
    @Column(name = "rok")
    public Date getRok() {
        return rok;
    }

    public void setRok(Date rok) {
        this.rok = rok;
    }

    @Basic
    @Column(name = "aktivna")
    public byte getAktivna() {
        return aktivna;
    }

    public void setAktivna(byte aktivna) {
        this.aktivna = aktivna;
    }

    @Basic
    @Column(name = "programskijezik")
    public int getProgramskijezik() {
        return programskijezik;
    }

    public void setProgramskijezik(int programskijezik) {
        this.programskijezik = programskijezik;
    }

    @Basic
    @Column(name = "automatsko_testiranje")
    public byte getAutomatskoTestiranje() {
        return automatskoTestiranje;
    }

    public void setAutomatskoTestiranje(byte automatskoTestiranje) {
        this.automatskoTestiranje = automatskoTestiranje;
    }

    @Basic
    @Column(name = "attachment")
    public byte getAttachment() {
        return attachment;
    }

    public void setAttachment(byte attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "dozvoljene_ekstenzije")
    public String getDozvoljeneEkstenzije() {
        return dozvoljeneEkstenzije;
    }

    public void setDozvoljeneEkstenzije(String dozvoljeneEkstenzije) {
        this.dozvoljeneEkstenzije = dozvoljeneEkstenzije;
    }

    @Basic
    @Column(name = "postavka_zadace")
    public String getPostavkaZadace() {
        return postavkaZadace;
    }

    public void setPostavkaZadace(String postavkaZadace) {
        this.postavkaZadace = postavkaZadace;
    }

    @Basic
    @Column(name = "komponenta")
    public int getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(int komponenta) {
        this.komponenta = komponenta;
    }

    @Basic
    @Column(name = "vrijemeobjave")
    public Timestamp getVrijemeobjave() {
        return vrijemeobjave;
    }

    public void setVrijemeobjave(Timestamp vrijemeobjave) {
        this.vrijemeobjave = vrijemeobjave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZadacaEntity that = (ZadacaEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (zadataka != that.zadataka) return false;
        if (Double.compare(that.bodova, bodova) != 0) return false;
        if (aktivna != that.aktivna) return false;
        if (programskijezik != that.programskijezik) return false;
        if (automatskoTestiranje != that.automatskoTestiranje) return false;
        if (attachment != that.attachment) return false;
        if (komponenta != that.komponenta) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (rok != null ? !rok.equals(that.rok) : that.rok != null) return false;
        if (dozvoljeneEkstenzije != null ? !dozvoljeneEkstenzije.equals(that.dozvoljeneEkstenzije) : that.dozvoljeneEkstenzije != null)
            return false;
        if (postavkaZadace != null ? !postavkaZadace.equals(that.postavkaZadace) : that.postavkaZadace != null)
            return false;
        if (vrijemeobjave != null ? !vrijemeobjave.equals(that.vrijemeobjave) : that.vrijemeobjave != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + (int) zadataka;
        temp = Double.doubleToLongBits(bodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (rok != null ? rok.hashCode() : 0);
        result = 31 * result + (int) aktivna;
        result = 31 * result + programskijezik;
        result = 31 * result + (int) automatskoTestiranje;
        result = 31 * result + (int) attachment;
        result = 31 * result + (dozvoljeneEkstenzije != null ? dozvoljeneEkstenzije.hashCode() : 0);
        result = 31 * result + (postavkaZadace != null ? postavkaZadace.hashCode() : 0);
        result = 31 * result + komponenta;
        result = 31 * result + (vrijemeobjave != null ? vrijemeobjave.hashCode() : 0);
        return result;
    }
}
