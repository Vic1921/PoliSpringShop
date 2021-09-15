package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.HomeShirt;

import java.util.List;

public interface HomeShirtService {

    List<HomeShirt> getAllHomeShirts();
}
