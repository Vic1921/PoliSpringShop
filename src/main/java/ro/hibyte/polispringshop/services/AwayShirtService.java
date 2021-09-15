package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.AwayShirt;

import java.util.List;

public interface AwayShirtService {

    List<AwayShirt> getAllAwayShirts();
}
