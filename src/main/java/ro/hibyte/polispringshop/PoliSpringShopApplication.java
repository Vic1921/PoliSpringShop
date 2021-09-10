package ro.hibyte.polispringshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories("ro.hibyte.polispringshop.repositories")
public class PoliSpringShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliSpringShopApplication.class, args);
    }

}
