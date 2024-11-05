package lk.ijse.bo.custom;

import lk.ijse.DTO.UserDTO;
import lk.ijse.bo.SuperBO;
import lk.ijse.entity.User;

import java.io.IOException;
import java.util.List;

public interface UserBO extends SuperBO {
    List<User> getAllUser() throws IOException;

    boolean updateUser(User entity) throws IOException;

    boolean saveUser(UserDTO entity) throws IOException;

    boolean deleteUser(int id) throws IOException;


    List<User> SearchUID(int uid) throws IOException;

    public String generateNewUserID();
}
