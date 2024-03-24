package br.com.eterniaserver.bddia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BDDIAApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BDDIAApplication.class, args);
    }

}
