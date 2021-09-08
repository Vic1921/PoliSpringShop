package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.HomeShirt;

@Repository
public interface HomeShortRepository extends CrudRepository<HomeShirt, Long> {
}
