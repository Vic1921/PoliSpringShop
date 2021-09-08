package ro.hibyte.polispringshop.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import ro.hibyte.polispringshop.domain.enums.ShirtSize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class AwayShirt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private double price;

    @NotNull
    private String ModelName;

    @NotNull
    private ShirtSize size;

    //todo: add list of owners

}
