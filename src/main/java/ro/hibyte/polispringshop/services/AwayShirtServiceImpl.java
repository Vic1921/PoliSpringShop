package ro.hibyte.polispringshop.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.AwayShirt;
import ro.hibyte.polispringshop.repositories.AwayShirtRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AwayShirtServiceImpl implements AwayShirtService {

    @Autowired
    private final AwayShirtRepository awayShirtRepository;

    @Override
    public List<AwayShirt> getAllAwayShirts() {
        return new ArrayList<>(awayShirtRepository.findAll());
    }
}
