package lk.ijse.car_rent.service;



import lk.ijse.car_rent.dto.DamageDTO;

import java.util.List;

public interface DamageService {
    void saveDamage(DamageDTO dto);
    void deleteDamage(String damId);
    void updateDamage(DamageDTO dto);
    DamageDTO searchDamage(String damId);
    List<DamageDTO> getAllDamages();


}
