package kodlamaio.hrmsApp.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.*;

public interface JobTitleDao extends JpaRepository<JobTitles,Integer>{
	List<JobTitles> findByJobName(String jobname);
}
