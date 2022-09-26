package GarageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan(basePackages = "services")
@SpringBootApplication
public class AmericanGarageAppApplication {

    public static void main(String[] args) {
        //SpringApplication.run(AmericanGarageAppApplication.class, args);

        ApplicationContext context = SpringApplication.run(AmericanGarageAppApplication.class, args);

    }

}
