package lk.ijse.car_rent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Reserv {
    @Id
    private String reservId;
    private String uId;
    private String vId;
    private String dId;
    private double resDate;
    private double resTime;
    private double pickupDate;
    private double returnDate;
}
