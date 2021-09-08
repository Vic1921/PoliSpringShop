package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.hibyte.polispringshop.domain.User;

import java.util.UUID;

@Repository
public interface UserRepsitory extends CrudRepository<User, UUID> {
}
