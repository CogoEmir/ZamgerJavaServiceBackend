package ba.unsa.etf.zamger.persistence;

import javax.persistence.*;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Entity
@Table(name = "bb_post_text", schema = "zamger", catalog = "")
public class BbPostTextEntity {
    private int post;
    private String tekst;

    @Id
    @Column(name = "post")
    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    @Basic
    @Column(name = "tekst")
    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BbPostTextEntity that = (BbPostTextEntity) o;

        if (post != that.post) return false;
        if (tekst != null ? !tekst.equals(that.tekst) : that.tekst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = post;
        result = 31 * result + (tekst != null ? tekst.hashCode() : 0);
        return result;
    }
}
