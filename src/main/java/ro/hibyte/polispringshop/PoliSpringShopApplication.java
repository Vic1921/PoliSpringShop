package ro.hibyte.polispringshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories("ro.hibyte.polispringshop.*")
@EntityScan("ro.hibyte.polispringshop.*")
@ComponentScan(basePackages = { "ro.hibyte.polispringshop.*" })
public class PoliSpringShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliSpringShopApplication.class, args);
    }

}
