package GarageApp.model.services.map;

import GarageApp.model.Car;
import org.springframework.stereotype.Service;
import GarageApp.model.services.CarService;

import java.util.Set;
@Service
public class CarServiceMap extends AbstractMapService<Car,Long> implements CarService {
    @Override
    public Car save(Car object) {
        return super.save(object);
    }

    @Override
    public Car findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Car> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Car object) {
        super.delete(object);
    }
}
