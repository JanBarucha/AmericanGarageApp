package GarageApp.model.services;

import GarageApp.model.CarOwner;
import org.springframework.stereotype.Service;

@Service
public interface CarOwnerService extends CrudService<CarOwner, Long>{

    CarOwner findByLastName(String lastName);


}
