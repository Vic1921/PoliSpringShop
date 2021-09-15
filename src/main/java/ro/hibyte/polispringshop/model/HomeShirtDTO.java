package ro.hibyte.polispringshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.hibyte.polispringshop.domain.enums.ShirtSize;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeShirtDTO {

    private double price;
    private String ModelName;
    private ShirtSize size;
}
