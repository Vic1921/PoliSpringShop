package ro.hibyte.polispringshop.services;

import ro.hibyte.polispringshop.domain.HomeShirt;
import ro.hibyte.polispringshop.repositories.HomeShirtRepository;

import java.util.ArrayList;
import java.util.List;

public class HomeShirtServiceImpl implements HomeShirtService {

    private HomeShirtRepository homeShirtRepository;

    public HomeShirtServiceImpl(HomeShirtRepository homeShortRepository) {
        this.homeShirtRepository = homeShortRepository;
    }

    @Override
    public List<HomeShirt> getAllHomeShirts() {
        return new ArrayList<>(homeShirtRepository.findAll());
    }
}
