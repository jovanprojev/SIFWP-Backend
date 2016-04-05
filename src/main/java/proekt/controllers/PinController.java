package proekt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proekt.models.Pin;
import proekt.services.PinService;

@RestController
@RequestMapping("rest/pin")
public class PinController extends CrudResource<Pin, PinService> {

	@Autowired
	PinService pinService;

	@Override
	public PinService getService() {
		return pinService;
	}

	@RequestMapping(value = "/addPins", method = RequestMethod.POST, produces = "application/json")
	public boolean addPins(@RequestParam("notificationId") Long notificationId, @RequestBody List<Pin> pins) {
		return pinService.create(notificationId, pins);
	}
	
	@RequestMapping(value = "/getPins", method = RequestMethod.GET, produces = "application/json")
	public List<Pin> getPins(@RequestParam("time")Integer minutes) {
		return pinService.findPinsByTime(minutes);
	}
}
