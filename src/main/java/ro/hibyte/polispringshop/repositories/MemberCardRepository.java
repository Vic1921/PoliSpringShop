package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.MemberCard;

@Repository
public interface MemberCardRepository extends CrudRepository<MemberCard, Long> {
}
