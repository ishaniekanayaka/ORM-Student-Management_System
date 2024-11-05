package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.entity.User;

import java.io.IOException;
import java.util.List;

public interface UserDAO extends CrudDAO<User> {
    List<User> getaAll() throws IOException;

    boolean delete(int entity) throws IOException;

    List<User> SearchUID(int uid) throws IOException;
}
