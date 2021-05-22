package com.example.hrms.business.abstracts;
import java.util.List;
import java.util.Optional;

import com.example.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	void save(JobTitle jobTitle);
    List<JobTitle> findAll();
    Optional<JobTitle> findOneByTitle(String title);

}
