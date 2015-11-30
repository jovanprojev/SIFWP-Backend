package proekt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import proekt.models.Admin;
import proekt.services.AdminService;

@RestController
@RequestMapping(value = "/rest")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public Admin importEntities(@RequestBody Admin admin) {
		Admin proveriAcc = service.proveriAcc(admin);
		return proveriAcc;
	}

}
