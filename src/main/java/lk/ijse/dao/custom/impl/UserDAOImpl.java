package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.UserDAO;
import lk.ijse.entity.User;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public List<User> getaAll() throws IOException {
        return List.of();
    }

    @Override
    public boolean save(User entity) throws IOException {
        return false;
    }

    @Override
    public boolean update(User entity) throws IOException {
        return false;
    }

    @Override
    public boolean delete(int entity) throws IOException {
        return false;
    }

    @Override
    public List<User> SearchUID(int uid) throws IOException {
        return List.of();
    }

    public void saveUser(User user){
        Transaction transaction = null;
        try (Session session = FactoryConfiguration.getFactoryConfiguration().getSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Roll back if there was an error
            }
            e.printStackTrace(); // Consider logging this instead of printing
        }
    }
}
