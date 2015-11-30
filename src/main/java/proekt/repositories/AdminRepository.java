package proekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proekt.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	public Admin findByUsernameAndPassword(String username,String password);

}
