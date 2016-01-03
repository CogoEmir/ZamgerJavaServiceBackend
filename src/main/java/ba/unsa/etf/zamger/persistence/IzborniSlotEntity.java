package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "izborni_slot", schema = "zamger", catalog = "")
@IdClass(IzborniSlotEntityPK.class)
public class IzborniSlotEntity {
    private int id;
    private int predmet;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IzborniSlotEntity that = (IzborniSlotEntity) o;

        if (id != that.id) return false;
        if (predmet != that.predmet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + predmet;
        return result;
    }
}
