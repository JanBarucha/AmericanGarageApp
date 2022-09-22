package web.bootstrap;

import model.Car;
import model.CarOwner;
import model.Mechanics;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.CarOwnerService;
import services.CarService;
import services.MechanicsService;
import services.map.CarOwnerMap;
import services.map.CarServiceMap;
import services.map.MechanicsServiceMap;

// Spring Boot specific way to load data
@Component
public class DataLoader implements CommandLineRunner {

    private final CarOwnerService carOwnerService;
    private final MechanicsService mechanicsService;

    public DataLoader(){
        carOwnerService = new CarOwnerMap();
        mechanicsService = new MechanicsServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {
        CarOwner carOwner1 = new CarOwner();
        carOwner1.setId(1L);
        carOwner1.setFirstName("Jan");
        carOwner1.setLastName("Kowalski");

        carOwnerService.save(carOwner1);
        System.out.println("Car owner");

        Mechanics mechanics1 = new Mechanics();
        mechanics1.setId(1L);
        mechanics1.setFirstName("Juri");
        mechanics1.setLastName("Dudus");

        mechanicsService.save(mechanics1);
        System.out.println("Loaded mechanics");
    }
}
