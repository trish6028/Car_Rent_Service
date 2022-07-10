package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class DriverDTO {
    private String id;
    private String name;
    private String address;
    private String contact ;
    private int licence;
    private int NIC;
    private String dImg;
}
