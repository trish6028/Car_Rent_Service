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

public class Driver {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact ;
    private int licence;
    private int NIC;
    private String dImg;

}
