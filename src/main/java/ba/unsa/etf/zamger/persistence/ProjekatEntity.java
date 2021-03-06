package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "projekat", schema = "zamger", catalog = "")
public class ProjekatEntity {
    private int id;
    private String naziv;
    private int predmet;
    private int akademskaGodina;
    private String opis;
    private String biljeska;
    private Timestamp vrijeme;

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
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "biljeska")
    public String getBiljeska() {
        return biljeska;
    }

    public void setBiljeska(String biljeska) {
        this.biljeska = biljeska;
    }

    @Basic
    @Column(name = "vrijeme")
    public Timestamp getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Timestamp vrijeme) {
        this.vrijeme = vrijeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjekatEntity that = (ProjekatEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (biljeska != null ? !biljeska.equals(that.biljeska) : that.biljeska != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (biljeska != null ? biljeska.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        return result;
    }
}
