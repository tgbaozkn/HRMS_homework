package com.example.hrms.business.concretes;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobTitleService;
import com.example.hrms.dataAccess.abstracts.JobTitleDao;
import com.example.hrms.entities.concretes.JobTitle;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleManager implements JobTitleService {
	
	 private JobTitleDao jobTitleDao;

	    public JobTitleManager(JobTitleDao jobTitleDao) {
	        this.jobTitleDao = jobTitleDao;
	    }


	    @Override
	    public void save(JobTitle jobTitle) {
	        this.jobTitleDao.save(jobTitle);
	    }

	    @Override
	    public List<JobTitle> findAll() {
	        return this.jobTitleDao.findAll();
	    }

	    @Override
	    public Optional<JobTitle> findOneByTitle(String title) {
	        return this.jobTitleDao.findOneByTitle(title);
	    }
}
