package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.hibyte.polispringshop.domain.Ball;

public interface BallRepository extends CrudRepository<Ball, Long> {
}
