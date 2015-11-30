package proekt.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proekt.models.Admin;
import proekt.repositories.AdminRepository;
import proekt.services.AdminService;
@Service
public class AdminServiceImpl extends BaseEntityCrudServiceImpl<Admin, AdminRepository> implements AdminService {

	
	@Autowired
	AdminRepository repository;
	@Override
	protected AdminRepository getRepository() {
		return repository;
	}
	@Override
	public Admin proveriAcc(Admin admin) {
		Admin user = repository.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		return user;
	}

}
