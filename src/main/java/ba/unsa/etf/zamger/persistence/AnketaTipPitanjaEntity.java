package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "anketa_tip_pitanja", schema = "zamger", catalog = "")
public class AnketaTipPitanjaEntity {
    private int id;
    private String tip;
    private String postojiIzbor;
    private String tabelaOdgovora;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tip")
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Basic
    @Column(name = "postoji_izbor")
    public String getPostojiIzbor() {
        return postojiIzbor;
    }

    public void setPostojiIzbor(String postojiIzbor) {
        this.postojiIzbor = postojiIzbor;
    }

    @Basic
    @Column(name = "tabela_odgovora")
    public String getTabelaOdgovora() {
        return tabelaOdgovora;
    }

    public void setTabelaOdgovora(String tabelaOdgovora) {
        this.tabelaOdgovora = tabelaOdgovora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnketaTipPitanjaEntity that = (AnketaTipPitanjaEntity) o;

        if (id != that.id) return false;
        if (tip != null ? !tip.equals(that.tip) : that.tip != null) return false;
        if (postojiIzbor != null ? !postojiIzbor.equals(that.postojiIzbor) : that.postojiIzbor != null) return false;
        if (tabelaOdgovora != null ? !tabelaOdgovora.equals(that.tabelaOdgovora) : that.tabelaOdgovora != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tip != null ? tip.hashCode() : 0);
        result = 31 * result + (postojiIzbor != null ? postojiIzbor.hashCode() : 0);
        result = 31 * result + (tabelaOdgovora != null ? tabelaOdgovora.hashCode() : 0);
        return result;
    }
}
