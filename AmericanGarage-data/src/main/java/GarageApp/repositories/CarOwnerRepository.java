package GarageApp.repositories;

import GarageApp.model.CarOwner;
import org.springframework.data.repository.CrudRepository;

public interface CarOwnerRepository extends CrudRepository<CarOwner,Long> {
}
