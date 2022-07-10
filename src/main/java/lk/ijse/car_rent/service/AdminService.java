package lk.ijse.car_rent.service;


import lk.ijse.car_rent.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void deleteAdmin(String id);
    void updateAdmin(AdminDTO dto);
    AdminDTO searchAdmin(String id);
    List<AdminDTO> getAllAdmin();


}
