package services.map;

import model.CarOwner;
import services.CrudService;

import java.util.Set;

public class CarOwnerMap extends AbstractMapService<CarOwner, Long> implements CrudService<CarOwner, Long> {
    @Override
    public CarOwner save(CarOwner object) {
        return super.save(object.getId(), object);
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
}
