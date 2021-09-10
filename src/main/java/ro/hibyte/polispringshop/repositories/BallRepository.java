package ro.hibyte.polispringshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.Ball;

@Repository
public interface BallRepository extends CrudRepository<Ball, Long>, JpaRepository<Ball, Long> {
}
