package ro.hibyte.polispringshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.Ball;
import ro.hibyte.polispringshop.domain.MemberCard;

@Repository
public interface MemberCardRepository extends CrudRepository<MemberCard, Long>, JpaRepository<MemberCard, Long> {
}
