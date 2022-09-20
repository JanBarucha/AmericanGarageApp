package services;

import model.Car;
import model.CarOwner;

import java.util.Set;

public interface CarOwnerService extends CrudService<CarOwner, Long>{

    CarOwner findByLastName(String lastName);


}
