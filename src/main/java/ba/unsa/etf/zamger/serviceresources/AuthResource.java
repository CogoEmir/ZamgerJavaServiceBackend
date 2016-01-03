package ba.unsa.etf.zamger.serviceresources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@RestController
public class AuthResource {
    @RequestMapping("/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
