package GarageApp.model.services.map;

import GarageApp.model.Mechanics;
import GarageApp.model.services.MechanicsService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class MechanicsServiceMap extends AbstractMapService<Mechanics, Long> implements MechanicsService {
    @Override
    public Mechanics save(Mechanics object) {
        return super.save(object);
    }

    @Override
    public Mechanics findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Mechanics> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Mechanics object) {
        super.delete(object);
    }
}
