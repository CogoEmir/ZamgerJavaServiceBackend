package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "moodle_predmet_id", schema = "zamger", catalog = "")
public class MoodlePredmetIdEntity {
    private int predmet;
    private int akademskaGodina;
    private int moodleId;

    @Basic
    @Column(name = "predmet")
    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    @Basic
    @Column(name = "akademska_godina")
    public int getAkademskaGodina() {
        return akademskaGodina;
    }

    public void setAkademskaGodina(int akademskaGodina) {
        this.akademskaGodina = akademskaGodina;
    }

    @Basic
    @Id
    @Column(name = "moodle_id")
    public int getMoodleId() {
        return moodleId;
    }

    public void setMoodleId(int moodleId) {
        this.moodleId = moodleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoodlePredmetIdEntity that = (MoodlePredmetIdEntity) o;

        if (predmet != that.predmet) return false;
        if (akademskaGodina != that.akademskaGodina) return false;
        if (moodleId != that.moodleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = predmet;
        result = 31 * result + akademskaGodina;
        result = 31 * result + moodleId;
        return result;
    }
}
