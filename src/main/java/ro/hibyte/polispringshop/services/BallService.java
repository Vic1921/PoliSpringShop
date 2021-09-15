package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.Ball;

import java.util.List;

public interface BallService {
    List<Ball> getAllBalls();
}
