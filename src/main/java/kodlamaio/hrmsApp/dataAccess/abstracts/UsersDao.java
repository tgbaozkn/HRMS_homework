package kodlamaio.hrmsApp.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.*;
public interface UsersDao extends JpaRepository<Users,Integer>{
	List<Users> findByEmail(String email);

}
