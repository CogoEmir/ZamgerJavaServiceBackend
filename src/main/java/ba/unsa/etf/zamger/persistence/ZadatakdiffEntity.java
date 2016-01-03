package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zadatakdiff", schema = "zamger", catalog = "")
public class ZadatakdiffEntity {
    private long zadatak;
    private String diff;

    @Id
    @Column(name = "zadatak")
    public long getZadatak() {
        return zadatak;
    }

    public void setZadatak(long zadatak) {
        this.zadatak = zadatak;
    }

    @Basic
    @Column(name = "diff")
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZadatakdiffEntity that = (ZadatakdiffEntity) o;

        if (zadatak != that.zadatak) return false;
        if (diff != null ? !diff.equals(that.diff) : that.diff != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (zadatak ^ (zadatak >>> 32));
        result = 31 * result + (diff != null ? diff.hashCode() : 0);
        return result;
    }
}
