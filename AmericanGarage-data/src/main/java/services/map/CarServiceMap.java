package services.map;

import model.Car;
import services.CrudService;

import java.util.Set;

public class CarServiceMap extends AbstractMapService<Car,Long> implements CrudService<Car, Long> {
    @Override
    public Car save(Car object) {
        return super.save(object.getId(), object);
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
