package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "komponenta", schema = "zamger", catalog = "")
public class KomponentaEntity {
    private int id;
    private String naziv;
    private String guiNaziv;
    private String kratkiGuiNaziv;
    private int tipkomponente;
    private double maxbodova;
    private double prolaz;
    private String opcija;
    private byte uslov;

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
    @Column(name = "gui_naziv")
    public String getGuiNaziv() {
        return guiNaziv;
    }

    public void setGuiNaziv(String guiNaziv) {
        this.guiNaziv = guiNaziv;
    }

    @Basic
    @Column(name = "kratki_gui_naziv")
    public String getKratkiGuiNaziv() {
        return kratkiGuiNaziv;
    }

    public void setKratkiGuiNaziv(String kratkiGuiNaziv) {
        this.kratkiGuiNaziv = kratkiGuiNaziv;
    }

    @Basic
    @Column(name = "tipkomponente")
    public int getTipkomponente() {
        return tipkomponente;
    }

    public void setTipkomponente(int tipkomponente) {
        this.tipkomponente = tipkomponente;
    }

    @Basic
    @Column(name = "maxbodova")
    public double getMaxbodova() {
        return maxbodova;
    }

    public void setMaxbodova(double maxbodova) {
        this.maxbodova = maxbodova;
    }

    @Basic
    @Column(name = "prolaz")
    public double getProlaz() {
        return prolaz;
    }

    public void setProlaz(double prolaz) {
        this.prolaz = prolaz;
    }

    @Basic
    @Column(name = "opcija")
    public String getOpcija() {
        return opcija;
    }

    public void setOpcija(String opcija) {
        this.opcija = opcija;
    }

    @Basic
    @Column(name = "uslov")
    public byte getUslov() {
        return uslov;
    }

    public void setUslov(byte uslov) {
        this.uslov = uslov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KomponentaEntity that = (KomponentaEntity) o;

        if (id != that.id) return false;
        if (tipkomponente != that.tipkomponente) return false;
        if (Double.compare(that.maxbodova, maxbodova) != 0) return false;
        if (Double.compare(that.prolaz, prolaz) != 0) return false;
        if (uslov != that.uslov) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (guiNaziv != null ? !guiNaziv.equals(that.guiNaziv) : that.guiNaziv != null) return false;
        if (kratkiGuiNaziv != null ? !kratkiGuiNaziv.equals(that.kratkiGuiNaziv) : that.kratkiGuiNaziv != null)
            return false;
        if (opcija != null ? !opcija.equals(that.opcija) : that.opcija != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (guiNaziv != null ? guiNaziv.hashCode() : 0);
        result = 31 * result + (kratkiGuiNaziv != null ? kratkiGuiNaziv.hashCode() : 0);
        result = 31 * result + tipkomponente;
        temp = Double.doubleToLongBits(maxbodova);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(prolaz);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (opcija != null ? opcija.hashCode() : 0);
        result = 31 * result + (int) uslov;
        return result;
    }
}
