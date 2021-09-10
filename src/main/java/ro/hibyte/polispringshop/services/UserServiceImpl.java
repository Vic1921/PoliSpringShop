package ro.hibyte.polispringshop.services;

import ro.hibyte.polispringshop.domain.User;
import ro.hibyte.polispringshop.repositories.UserRepsitory;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepsitory userRepsitory;

    public UserServiceImpl(UserRepsitory userRepsitory) {
        this.userRepsitory = userRepsitory;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userRepsitory.findAll());
    }
}
