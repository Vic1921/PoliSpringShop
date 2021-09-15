package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}
