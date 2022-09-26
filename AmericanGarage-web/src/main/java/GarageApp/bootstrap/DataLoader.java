package GarageApp.bootstrap;

import GarageApp.model.CarOwner;
import GarageApp.model.Mechanics;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import GarageApp.model.services.CarOwnerService;
import GarageApp.model.services.MechanicsService;

// Spring Boot specific way to load data
@Component
public class DataLoader implements CommandLineRunner {

    private final CarOwnerService carOwnerService;
    private final MechanicsService mechanicsService;

    public DataLoader(CarOwnerService carOwnerService, MechanicsService mechanicsService) {
        this.carOwnerService = carOwnerService;
        this.mechanicsService = mechanicsService;
    }

    @Override
    public void run(String... args) throws Exception {
        CarOwner carOwner1 = new CarOwner();
        carOwner1.setId(1L);
        carOwner1.setFirstName("Jan");
        carOwner1.setLastName("Kowalski");

        carOwnerService.save(carOwner1);
        //carOwnerService.findAll().forEach(k-> System.out.println(k.getFirstName()));
        System.out.println("Car owner");

        Mechanics mechanics1 = new Mechanics();
        mechanics1.setId(1L);
        mechanics1.setFirstName("Juri");
        mechanics1.setLastName("Dudus");


        mechanicsService.save(mechanics1);
        System.out.println("Loaded mechanics");
    }
}
