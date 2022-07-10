package lk.ijse.car_rent.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class DamageDTO {
    private String damId;
    private String vId;
    private double fee;
    private String reason;

}
