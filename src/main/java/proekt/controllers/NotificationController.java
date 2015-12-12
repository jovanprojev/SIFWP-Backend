package proekt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proekt.models.Notification;
import proekt.models.Relation;
import proekt.services.NotificationService;

@RestController
@RequestMapping("rest/notifications")
public class NotificationController extends CrudResource<Notification, NotificationService> {

	@Autowired
	NotificationService notificationService;

	@Override
	public NotificationService getService() {
		return notificationService;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json")
	public List<Notification> findNotification(@RequestBody Relation relation) {
		return notificationService.findNotificationService(relation.getStartDestination(),
				relation.getEndDestination());
	}

	@RequestMapping(value = "/like", method = RequestMethod.POST, produces = "application/json")
	public Notification likeNotification(@RequestParam(value = "id") Long id) {
		return notificationService.likeNotificationService(id);
	}

	@RequestMapping(value = "/dislike", method = RequestMethod.POST, produces = "application/json")
	public Notification dislikeNotification(@RequestParam(value = "id") Long id) {
		return notificationService.dislikeNotificationService(id);
	}

}
