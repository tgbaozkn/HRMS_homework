package kodlamaio.hrmsApp.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.*;

public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer>{
	List<JobSeekers> findByNationalityId(String nationalId);
}
