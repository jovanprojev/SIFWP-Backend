package proekt.services;

import proekt.models.Admin;

public interface AdminService extends BaseEntityCrudService<Admin> {

	public Admin proveriAcc(Admin admin);
}
