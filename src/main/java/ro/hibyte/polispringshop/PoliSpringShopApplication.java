package ro.hibyte.polispringshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PoliSpringShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliSpringShopApplication.class, args);
    }

}
