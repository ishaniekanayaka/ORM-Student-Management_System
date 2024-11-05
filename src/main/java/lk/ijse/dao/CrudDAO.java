package lk.ijse.dao;


import java.io.IOException;

public interface CrudDAO<T> extends SuperDAO{

    boolean save(T entity) throws IOException;
    boolean update(T entity) throws IOException;
    boolean delete(int id) throws IOException;

}
