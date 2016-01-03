package ba.unsa.etf.zamger.dao;

import ba.unsa.etf.zamger.persistence.OsobaEntity;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Transactional
public interface PersonDao extends CrudRepository<OsobaEntity, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public OsobaEntity findByIme(String ime);

}