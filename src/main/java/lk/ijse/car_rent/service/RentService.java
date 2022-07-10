package lk.ijse.car_rent.service;


import lk.ijse.car_rent.dto.RentDTO;

import java.util.List;

public interface RentService {
    void saveRent(RentDTO dto);
    void deleteRent(String rId);
    void updateRent(RentDTO dto);
    void  searchRent(String rId);
    List<RentDTO> getAllRents();

}
