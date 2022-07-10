package lk.ijse.car_rent.service;



import lk.ijse.car_rent.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void deleteDriver( String id);
    void updateDamage(DriverDTO dto);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDrivers();


}
