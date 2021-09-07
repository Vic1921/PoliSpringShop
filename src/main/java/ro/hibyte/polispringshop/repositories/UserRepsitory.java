package ro.hibyte.polispringshop.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.hibyte.polispringshop.domain.User;

import java.util.UUID;

public interface UserRepsitory extends CrudRepository<User, UUID> {
}
