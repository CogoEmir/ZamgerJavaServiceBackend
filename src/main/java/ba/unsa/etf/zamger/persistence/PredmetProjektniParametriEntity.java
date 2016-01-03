package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "predmet_projektni_parametri", schema = "zamger", catalog = "")
@IdClass(PredmetProjektniParametriEntityPK.class)
public class PredmetProjektniParametriEntity {
    private int predmet;
    private int akademskaGodina;
    private byte minTimova;
    private byte maxTimova;
    private byte minClanovaTima;
    private byte maxClanovaTima;
    private byte zakljucaniProjekti;

    @Id
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Id
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Column(name = "min_timova")
    public byte getMinTimova() {
        return minTimova;
    }

    public void setMinTimova(byte minTimova) {
        this.minTimova = minTimova;
    }

    @Basic
    @Column(name = "max_timova")
    public byte getMaxTimova() {
        return maxTimova;
    }

    public void setMaxTimova(byte maxTimova) {
        this.maxTimova = maxTimova;
    }

    @Basic
    @Column(name = "min_clanova_tima")
    public byte getMinClanovaTima() {
        return minClanovaTima;
    }

    public void setMinClanovaTima(byte minClanovaTima) {
        this.minClanovaTima = minClanovaTima;
    }

    @Basic
    @Column(name = "max_clanova_tima")
    public byte getMaxClanovaTima() {
        return maxClanovaTima;
    }

    public void setMaxClanovaTima(byte maxClanovaTima) {
        this.maxClanovaTima = maxClanovaTima;
    }

    @Basic
    @Column(name = "zakljucani_projekti")
    public byte getZakljucaniProjekti() {
        return zakljucaniProjekti;
    }

    public void setZakljucaniProjekti(byte zakljucaniProjekti) {
        this.zakljucaniProjekti = zakljucaniProjekti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredmetProjektniParametriEntity that = (PredmetProjektniParametriEntity) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (minTimova != that.minTimova) return false;
        if (maxTimova != that.maxTimova) return false;
        if (minClanovaTima != that.minClanovaTima) return false;
        if (maxClanovaTima != that.maxClanovaTima) return false;
        if (zakljucaniProjekti != that.zakljucaniProjekti) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + (int) minTimova;
        result = 31 * result + (int) maxTimova;
        result = 31 * result + (int) minClanovaTima;
        result = 31 * result + (int) maxClanovaTima;
        result = 31 * result + (int) zakljucaniProjekti;
        return result;
    }
}
