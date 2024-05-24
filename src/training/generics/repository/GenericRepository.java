package training.generics.repository;

import java.util.List;

public interface GenericRepository <T>{

    public T getById(long id);

    public List<T> listAll();

}
