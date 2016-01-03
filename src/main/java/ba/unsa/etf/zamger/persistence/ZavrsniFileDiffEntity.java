package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "zavrsni_file_diff", schema = "zamger", catalog = "")
public class ZavrsniFileDiffEntity {
    private int file;
    private String diff;

    @Id
    @Column(name = "file")
    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
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

        ZavrsniFileDiffEntity that = (ZavrsniFileDiffEntity) o;

        if (file != that.file) return false;
        if (diff != null ? !diff.equals(that.diff) : that.diff != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file;
        result = 31 * result + (diff != null ? diff.hashCode() : 0);
        return result;
    }
}
