package ba.unsa.etf.zamger.serviceresources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CogoEmir on 12/30/2015.
 */

@RestController
public class StartTestHello {
    @RequestMapping("/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
