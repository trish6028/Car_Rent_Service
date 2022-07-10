package lk.ijse.car_rent.service;

import lk.ijse.car_rent.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO dto);
    void deleteVehicle(String vId);
    void updateVehicle(VehicleDTO dto);
    void  searchVehicle(String vId);
    List<VehicleDTO> getAllVehicles();

}
