package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "ispit_termin", schema = "zamger", catalog = "")
public class IspitTerminEntity {
    private int id;
    private Date datumvrijeme;
    private int maxstudenata;
    private Date deadline;
    private int ispit;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datumvrijeme")
    public Date getDatumvrijeme() {
        return datumvrijeme;
    }

    public void setDatumvrijeme(Date datumvrijeme) {
        this.datumvrijeme = datumvrijeme;
    }

    @Basic
    @Column(name = "maxstudenata")
    public int getMaxstudenata() {
        return maxstudenata;
    }

    public void setMaxstudenata(int maxstudenata) {
        this.maxstudenata = maxstudenata;
    }

    @Basic
    @Column(name = "deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "ispit")
    public int getIspit() {
        return ispit;
    }

    public void setIspit(int ispit) {
        this.ispit = ispit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IspitTerminEntity that = (IspitTerminEntity) o;

        if (id != that.id) return false;
        if (maxstudenata != that.maxstudenata) return false;
        if (ispit != that.ispit) return false;
        if (datumvrijeme != null ? !datumvrijeme.equals(that.datumvrijeme) : that.datumvrijeme != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (datumvrijeme != null ? datumvrijeme.hashCode() : 0);
        result = 31 * result + maxstudenata;
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + ispit;
        return result;
    }
}
