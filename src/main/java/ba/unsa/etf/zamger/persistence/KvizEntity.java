package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "kviz", schema = "zamger", catalog = "")
public class KvizEntity {
    private int id;
    private String naziv;
    private int predmet;
    private int akademskaGodina;
    private Date vrijemePocetak;
    private Date vrijemeKraj;
    private int labgrupa;
    private String ipAdrese;
    private double prolazBodova;
    private int brojPitanja;
    private int trajanjeKviza;
    private byte aktivan;

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
    @Column(name = "vrijeme_pocetak")
    public Date getVrijemePocetak() {
        return vrijemePocetak;
    }

    public void setVrijemePocetak(Date vrijemePocetak) {
        this.vrijemePocetak = vrijemePocetak;
    }

    @Basic
    @Column(name = "vrijeme_kraj")
    public Date getVrijemeKraj() {
        return vrijemeKraj;
    }

    public void setVrijemeKraj(Date vrijemeKraj) {
        this.vrijemeKraj = vrijemeKraj;
    }

    @Basic
    @Column(name = "labgrupa")
    public int getLabgrupa() {
        return labgrupa;
    }

    public void setLabgrupa(int labgrupa) {
        this.labgrupa = labgrupa;
    }

    @Basic
    @Column(name = "ip_adrese")
    public String getIpAdrese() {
        return ipAdrese;
    }

    public void setIpAdrese(String ipAdrese) {
        this.ipAdrese = ipAdrese;
    }

    @Basic
    @Column(name = "prolaz_bodova")
    public double getProlazBodova() {
        return prolazBodova;
    }

    public void setProlazBodova(double prolazBodova) {
        this.prolazBodova = prolazBodova;
    }

    @Basic
    @Column(name = "broj_pitanja")
    public int getBrojPitanja() {
        return brojPitanja;
    }

    public void setBrojPitanja(int brojPitanja) {
        this.brojPitanja = brojPitanja;
    }

    @Basic
    @Column(name = "trajanje_kviza")
    public int getTrajanjeKviza() {
        return trajanjeKviza;
    }

    public void setTrajanjeKviza(int trajanjeKviza) {
        this.trajanjeKviza = trajanjeKviza;
    }

    @Basic
    @Column(name = "aktivan")
    public byte getAktivan() {
        return aktivan;
    }

    public void setAktivan(byte aktivan) {
        this.aktivan = aktivan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KvizEntity that = (KvizEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (labgrupa != that.labgrupa) return false;
        if (Double.compare(that.prolazBodova, prolazBodova) != 0) return false;
        if (brojPitanja != that.brojPitanja) return false;
        if (trajanjeKviza != that.trajanjeKviza) return false;
        if (aktivan != that.aktivan) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (vrijemePocetak != null ? !vrijemePocetak.equals(that.vrijemePocetak) : that.vrijemePocetak != null)
            return false;
        if (vrijemeKraj != null ? !vrijemeKraj.equals(that.vrijemeKraj) : that.vrijemeKraj != null) return false;
        if (ipAdrese != null ? !ipAdrese.equals(that.ipAdrese) : that.ipAdrese != null) return false;

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
        result = 31 * result + (vrijemePocetak != null ? vrijemePocetak.hashCode() : 0);
        result = 31 * result + (vrijemeKraj != null ? vrijemeKraj.hashCode() : 0);
        result = 31 * result + labgrupa;
        result = 31 * result + (ipAdrese != null ? ipAdrese.hashCode() : 0);
        temp = Double.doubleToLongBits(prolazBodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + brojPitanja;
        result = 31 * result + trajanjeKviza;
        result = 31 * result + (int) aktivan;
        return result;
    }
}
