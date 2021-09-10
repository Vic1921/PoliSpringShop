package ro.hibyte.polispringshop.services;

import ro.hibyte.polispringshop.domain.Ball;
import ro.hibyte.polispringshop.repositories.BallRepository;

import java.util.ArrayList;
import java.util.List;

public class BallServiceImpl implements BallService {

    private BallRepository ballRepository;

    public BallServiceImpl(BallRepository ballRepository) {
        this.ballRepository = ballRepository;
    }

    @Override
    public List<Ball> getAllBalls() {
        return new ArrayList<>(ballRepository.findAll());
    }
}
