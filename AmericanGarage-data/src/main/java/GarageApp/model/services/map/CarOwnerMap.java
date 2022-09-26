package GarageApp.model.services.map;

import GarageApp.model.CarOwner;
import org.springframework.stereotype.Service;
import GarageApp.model.services.CarOwnerService;

import java.util.Set;
@Service
public class CarOwnerMap extends AbstractMapService<CarOwner, Long> implements CarOwnerService {
    @Override
    public CarOwner save(CarOwner object) {
        return super.save(object);
    }

    @Override
    public CarOwner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<CarOwner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(CarOwner object) {
        super.delete(object);
    }

    @Override
    public CarOwner findByLastName(String lastName) {
        return null;
    }
}
