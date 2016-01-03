package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "moodle_predmet_rss", schema = "zamger", catalog = "")
public class MoodlePredmetRssEntity {
    private int id;
    private int vrstanovosti;
    private int moodleId;
    private String sadrzaj;
    private long vrijemePromjene;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vrstanovosti")
    public int getVrstanovosti() {
        return vrstanovosti;
    }

    public void setVrstanovosti(int vrstanovosti) {
        this.vrstanovosti = vrstanovosti;
    }

    @Basic
    @Column(name = "moodle_id")
    public int getMoodleId() {
        return moodleId;
    }

    public void setMoodleId(int moodleId) {
        this.moodleId = moodleId;
    }

    @Basic
    @Column(name = "sadrzaj")
    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    @Basic
    @Column(name = "vrijeme_promjene")
    public long getVrijemePromjene() {
        return vrijemePromjene;
    }

    public void setVrijemePromjene(long vrijemePromjene) {
        this.vrijemePromjene = vrijemePromjene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoodlePredmetRssEntity that = (MoodlePredmetRssEntity) o;

        if (id != that.id) return false;
        if (vrstanovosti != that.vrstanovosti) return false;
        if (moodleId != that.moodleId) return false;
        if (vrijemePromjene != that.vrijemePromjene) return false;
        if (sadrzaj != null ? !sadrzaj.equals(that.sadrzaj) : that.sadrzaj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + vrstanovosti;
        result = 31 * result + moodleId;
        result = 31 * result + (sadrzaj != null ? sadrzaj.hashCode() : 0);
        result = 31 * result + (int) (vrijemePromjene ^ (vrijemePromjene >>> 32));
        return result;
    }
}
