package proekt.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proekt.models.Notification;
import proekt.models.Relation;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

	public List<Notification> findByRelationOrderByDateDesc(Relation relation);
	
	public Notification findById(Long id);
	
	public List<Notification> findByDateGreaterThan(Date date);
}
