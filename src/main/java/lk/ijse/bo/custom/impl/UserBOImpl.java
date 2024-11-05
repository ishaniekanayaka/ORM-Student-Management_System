package lk.ijse.bo.custom.impl;

import lk.ijse.DTO.UserDTO;
import lk.ijse.bo.custom.UserBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.entity.User;

import java.io.IOException;
import java.util.List;

public class UserBOImpl implements UserBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.USER);

    @Override
    public List<User> getAllUser() throws IOException {
        return List.of();
    }

    @Override
    public boolean updateUser(User entity) throws IOException {
        return false;
    }

    @Override
    public boolean saveUser(UserDTO userDTO) throws IOException {
        User user = new User(userDTO.getId(), userDTO.getUserName(), userDTO.getPassword(), userDTO.getRole());
        return userDAO.save(user);
    }

    @Override
    public boolean deleteUser(int id) throws IOException {
        return false;
    }

    @Override
    public List<User> SearchUID(int uid) throws IOException {
        return List.of();
    }

    @Override
    public String generateNewUserID() {
        return null;
    }

    /*public String generateNewUserID() {
        return null;
    }*/
}
