package proekt.services;

import java.util.List;


import proekt.models.Notification;

public interface NotificationService extends BaseEntityCrudService<Notification> {


	public List<Notification> findNotificationService(String start, String end);
}
