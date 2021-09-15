package ro.hibyte.polispringshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BallDTO {

    private double price;
    private String name;
    private int size;

}
