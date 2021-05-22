package com.example.hrms.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CandidatesService;
import com.example.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

	private CandidatesService candidateService;

	@Autowired
	public CandidatesController(CandidatesService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	@GetMapping("/getall")
	public List<Candidates> getAll(){
		return this.candidateService.getAll();
	}
}