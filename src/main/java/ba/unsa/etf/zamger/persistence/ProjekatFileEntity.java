package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "projekat_file", schema = "zamger", catalog = "")
public class ProjekatFileEntity {
    private int id;
    private String filename;
    private Timestamp vrijeme;
    private byte revizija;
    private int osoba;
    private int projekat;
    private int file;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
    @Column(name = "revizija")
    public byte getRevizija() {
        return revizija;
    }

    public void setRevizija(byte revizija) {
        this.revizija = revizija;
    }

    @Basic
    @Column(name = "osoba")
    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }

    @Basic
    @Column(name = "projekat")
    public int getProjekat() {
        return projekat;
    }

    public void setProjekat(int projekat) {
        this.projekat = projekat;
    }

    @Basic
    @Column(name = "file")
    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjekatFileEntity that = (ProjekatFileEntity) o;

        if (id != that.id) return false;
        if (revizija != that.revizija) return false;
        if (osoba != that.osoba) return false;
        if (projekat != that.projekat) return false;
        if (file != that.file) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (vrijeme != null ? !vrijeme.equals(that.vrijeme) : that.vrijeme != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (vrijeme != null ? vrijeme.hashCode() : 0);
        result = 31 * result + (int) revizija;
        result = 31 * result + osoba;
        result = 31 * result + projekat;
        result = 31 * result + file;
        return result;
    }
}
