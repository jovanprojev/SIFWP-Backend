package proekt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proekt.models.User;
import proekt.services.UserService;

@RestController
@RequestMapping("rest/users")
public class UserController extends CrudResource<User, UserService> {

	@Autowired
	UserService userService;

	@Override
	public UserService getService() {
		return userService;
	}

}
