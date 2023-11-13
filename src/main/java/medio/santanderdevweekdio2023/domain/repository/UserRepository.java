package medio.santanderdevweekdio2023.domain.repository;

import medio.santanderdevweekdio2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
