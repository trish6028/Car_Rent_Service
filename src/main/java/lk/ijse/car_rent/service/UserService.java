package lk.ijse.car_rent.service;


import lk.ijse.car_rent.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);
    void deleteUser(String uId);
    void updateUser(UserDTO dto);
    void  searchUser(String uId);
    List<UserDTO> getAllUsers();

}
