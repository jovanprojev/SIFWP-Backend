package proekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proekt.models.Relation;

@Repository
public interface RelationRepository extends JpaRepository<Relation, Long> {
	
	public Relation findBystartDestinationAndEndDestination(String start,String end);
}
