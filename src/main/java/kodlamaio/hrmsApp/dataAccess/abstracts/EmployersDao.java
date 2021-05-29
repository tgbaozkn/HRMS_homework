package kodlamaio.hrmsApp.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.*;
public interface EmployersDao extends JpaRepository<Employers,Integer>{

}
