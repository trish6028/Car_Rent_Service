package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ReservDTO {
    private String reservId;
    private String uId;
    private String vId;
    private String dId;
    private double resDate;
    private double resTime;
    private double pickupDate;
    private double returnDate;
}
