package medio.santanderdevweekdio2023.service;

import medio.santanderdevweekdio2023.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
