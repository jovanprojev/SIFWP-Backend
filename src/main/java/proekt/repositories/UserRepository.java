package proekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proekt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
