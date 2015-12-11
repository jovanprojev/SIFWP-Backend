package proekt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proekt.models.Notification;
import proekt.models.Relation;
import proekt.repositories.NotificationRepository;
import proekt.repositories.RelationRepository;
import proekt.services.NotificationService;

@Service
public class NotificationServiceImpl extends BaseEntityCrudServiceImpl<Notification, NotificationRepository>
		implements NotificationService {

	@Autowired
	NotificationRepository repository;
	@Autowired
	RelationRepository relationRepository;

	@Override
	protected NotificationRepository getRepository() {
		return repository;
	}

	@Override
	public List<Notification> findNotificationService(String start, String end) {
		Relation firstRelation = relationRepository.findBystartDestinationAndEndDestination(start, end);
		Relation secoundRelation = relationRepository.findBystartDestinationAndEndDestination(end, start);
		List<Notification> result = repository.findByRelation(firstRelation);
		result.addAll(repository.findByRelation(secoundRelation));
		return result;
	}

	@Override
	public Notification likeNotificationService(Notification notification) {
		notification.setLikes(notification.getLikes()+1);
		return repository.save(notification); 
	}

	@Override
	public Notification dislikeNotificationService(Notification notification) {
		notification.setDislikes(notification.getDislikes()+1);
		return repository.save(notification);
	}

}
