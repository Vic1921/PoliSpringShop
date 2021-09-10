package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.AwayShirt;
import ro.hibyte.polispringshop.repositories.AwayShirtRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AwayShirtServiceImpl implements AwayShirtService {

    private final AwayShirtRepository awayShirtRepository;

    public AwayShirtServiceImpl(AwayShirtRepository awayShirtRepository) {
        this.awayShirtRepository = awayShirtRepository;
    }


    @Override
    public List<AwayShirt> getAllAwayShirts() {
        return new ArrayList<>(awayShirtRepository.findAll());
    }
}
