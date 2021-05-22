package com.example.hrms.apiControllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.hrms.business.abstracts.JobTitleService;
import com.example.hrms.entities.concretes.JobTitle;

import java.util.List;


@RestController
@RequestMapping(path = "api/job-titles")
public class JobTitlesController {
	@Autowired
	 private final JobTitleService jobTitleService;

	    public JobTitlesController(JobTitleService jobTitleService) {
	        this.jobTitleService = jobTitleService;
	    }

	    @GetMapping(path = "getall")
	    public List<JobTitle> getAll(){
	        return this.jobTitleService.findAll();
	    }

}
