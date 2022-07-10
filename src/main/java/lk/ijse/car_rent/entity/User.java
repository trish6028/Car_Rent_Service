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

public class User {
    @Id
    private String uId;
    private String name;
    private String address;
    private String contact ;
    private String email;

}
