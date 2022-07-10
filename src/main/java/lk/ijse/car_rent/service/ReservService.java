package lk.ijse.car_rent.service;



import lk.ijse.car_rent.dto.ReservDTO;

import java.util.List;

public interface ReservService {
    void saveReserv(ReservDTO dto);
    void deleteReserv(String reservId);
    void updateReserv(ReservDTO dto);
    void  searchReserv(String reservId);
    List<ReservDTO> getAllReservs();


}
