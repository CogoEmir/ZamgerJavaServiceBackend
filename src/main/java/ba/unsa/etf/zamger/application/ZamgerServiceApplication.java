package ba.unsa.etf.zamger.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "ba.unsa.etf.zamger.application","ba.unsa.etf.zamger.serviceresources"})
public class ZamgerServiceApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ZamgerServiceApplication.class, args);
    }
}
