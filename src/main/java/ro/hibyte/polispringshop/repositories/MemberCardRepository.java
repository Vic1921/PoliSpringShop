package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.hibyte.polispringshop.domain.MemberCard;

public interface MemberCardRepository extends CrudRepository<MemberCard, Long> {
}
