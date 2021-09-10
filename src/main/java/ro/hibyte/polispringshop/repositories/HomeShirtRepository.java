package ro.hibyte.polispringshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.HomeShirt;

@Repository
public interface HomeShirtRepository extends CrudRepository<HomeShirt, Long>, JpaRepository<HomeShirt, Long> {
}
