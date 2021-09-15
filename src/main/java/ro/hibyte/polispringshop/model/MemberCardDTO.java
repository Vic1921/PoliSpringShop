package ro.hibyte.polispringshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.hibyte.polispringshop.domain.enums.CardType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberCardDTO {

    private double price;
    private CardType cardType;

}
