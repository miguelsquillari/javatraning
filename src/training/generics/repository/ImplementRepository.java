package training.generics.repository;

import training.shared.model.Persona;

import java.util.List;

public class ImplementRepository implements GenericRepository<Persona> {
    @Override
    public Persona getById(long id) {
        return null;
    }

    @Override
    public List<Persona> listAll() {
        return null;
    }
}
