package proekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proekt.models.Pin;

@Repository
public interface PinRepository extends JpaRepository<Pin, Long>{

}
