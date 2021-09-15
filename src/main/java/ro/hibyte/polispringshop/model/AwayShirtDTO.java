package ro.hibyte.polispringshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.hibyte.polispringshop.domain.enums.ShirtSize;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwayShirtDTO {

    private double price;
    private String modelName;
    private ShirtSize size;

}
