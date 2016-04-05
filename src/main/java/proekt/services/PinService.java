package proekt.services;

import java.util.List;

import proekt.models.Pin;

public interface PinService extends BaseEntityCrudService<Pin> {

	boolean create(Long notificationId, List<Pin> pins);

	List<Pin> findPinsByTime (Integer time);
}
