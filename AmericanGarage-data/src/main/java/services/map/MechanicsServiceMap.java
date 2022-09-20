package services.map;

import model.Mechanics;
import services.CrudService;

import java.util.Set;

public class MechanicsServiceMap extends AbstractMapService<Mechanics, Long> implements CrudService<Mechanics, Long> {
    @Override
    public Mechanics save(Mechanics object) {
        return super.save(object.getId(), object);
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
