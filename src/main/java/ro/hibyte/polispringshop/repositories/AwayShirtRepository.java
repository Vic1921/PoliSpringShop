package ro.hibyte.polispringshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.AwayShirt;

@Repository
public interface AwayShirtRepository extends CrudRepository<AwayShirt, Long>, JpaRepository<AwayShirt, Long> {
}
