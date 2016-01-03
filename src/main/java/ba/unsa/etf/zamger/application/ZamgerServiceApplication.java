package ba.unsa.etf.zamger.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

/**
 * Created by CogoEmir on 1/3/2016.
 */
@SpringBootApplication
@EnableJpaRepositories("ba.unsa.etf.zamger.dao")
@EntityScan(basePackages = "ba.unsa.etf.zamger.persistence")
@ComponentScan(basePackages = {"ba.unsa.etf.zamger.dao,ba.unsa.etf.zamger.application","ba.unsa.etf.zamger.serviceresources"})
public class ZamgerServiceApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ZamgerServiceApplication.class, args);
    }
}
