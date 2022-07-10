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

public class Rent {
    @Id
    private String rId;
    private String uId;
    private String vId;
    private double payment;
    private String distance ;
    private double refund;
    private double date;
}
