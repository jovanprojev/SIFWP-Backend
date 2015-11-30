package proekt.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proekt.models.User;
import proekt.repositories.UserRepository;
import proekt.services.UserService;

@Service
public class UserServiceImpl extends BaseEntityCrudServiceImpl<User, UserRepository> implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	protected UserRepository getRepository() {
		return repository;
	}

}
