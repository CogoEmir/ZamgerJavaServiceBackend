package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "studentski_modul", schema = "zamger", catalog = "")
public class StudentskiModulEntity {
    private int id;
    private String modul;
    private String guiNaziv;
    private byte noviProzor;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "modul")
    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    @Basic
    @Column(name = "gui_naziv")
    public String getGuiNaziv() {
        return guiNaziv;
    }

    public void setGuiNaziv(String guiNaziv) {
        this.guiNaziv = guiNaziv;
    }

    @Basic
    @Column(name = "novi_prozor")
    public byte getNoviProzor() {
        return noviProzor;
    }

    public void setNoviProzor(byte noviProzor) {
        this.noviProzor = noviProzor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentskiModulEntity that = (StudentskiModulEntity) o;

        if (id != that.id) return false;
        if (noviProzor != that.noviProzor) return false;
        if (modul != null ? !modul.equals(that.modul) : that.modul != null) return false;
        if (guiNaziv != null ? !guiNaziv.equals(that.guiNaziv) : that.guiNaziv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modul != null ? modul.hashCode() : 0);
        result = 31 * result + (guiNaziv != null ? guiNaziv.hashCode() : 0);
        result = 31 * result + (int) noviProzor;
        return result;
    }
}
