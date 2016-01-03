package ba.unsa.etf.zamger.serviceresources;

import ba.unsa.etf.zamger.dao.PersonDao;
import ba.unsa.etf.zamger.persistence.OsobaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@Controller
public class PersonController {
    /**
     * GET /create  --> Create a new user and save it in the database.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        String userId = "";
        try {
            OsobaEntity user = new OsobaEntity();
            user.setAdresa(email);
            user.setIme(name);
            userDao.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

/*
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            OsobaEntity user = new OsobaEntity(id);
            userDao.delete(user);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "User succesfully deleted!";
    }
*/
    @RequestMapping("/get-by-ime")
    @ResponseBody
    public String getByIme(String ime) {
        String userId = "";
        try {
            OsobaEntity user = userDao.findByIme(ime);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }

/*
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String email, String name) {
        try {
            OsobaEntity user = userDao.findOne(id);
            user.setEmail(email);
            user.setName(name);
            userDao.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }
*/
    // Private fields

    @Autowired
    private PersonDao userDao;

}
