package proekt.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proekt.models.Notification;
import proekt.models.Pin;
import proekt.repositories.NotificationRepository;
import proekt.repositories.PinRepository;
import proekt.services.PinService;

@Service
public class PinServiceImpl extends BaseEntityCrudServiceImpl<Pin, PinRepository> implements PinService {

	@Autowired
	PinRepository repository;

	@Autowired
	NotificationRepository notificationRepository;

	@Override
	protected PinRepository getRepository() {
		return repository;
	}

	@Override
	public boolean create(Long notificationId, List<Pin> pins) {
		try {
			Notification notification = notificationRepository.findById(notificationId);
			for (Pin pin : pins) {
				Pin temporary = repository.save(pin);
				notification.addPin(temporary);
			}
			notificationRepository.save(notification);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public List<Pin> findPinsByTime(Integer time) {
		Date now = new Date();
		long miliseconds = time*60*1000;
		long require = now.getTime()-miliseconds;
		Date nov = new Date(require);
		System.out.println(nov);
		List<Notification> site = notificationRepository.findByDateGreaterThan(nov);
		List<Pin> result = new ArrayList<Pin>();
		for (Notification notification : site) {
			result.addAll(notification.getPins());
		}
		return result;
	}

}
