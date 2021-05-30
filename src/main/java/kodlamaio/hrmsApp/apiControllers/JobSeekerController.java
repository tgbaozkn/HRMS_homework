package kodlamaio.hrmsApp.apiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.JobSeekersService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.entities.concretes.JobSeekers;



@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
	private JobSeekersService jobseekerService; //aslında burada productmanager var
	public JobSeekerController(JobSeekersService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}

	@GetMapping("/getall")//bu controllerın sonuna bunu da koyarsak getall fonksiyonuna erişir.
	public DataResult<List<JobSeekers>> getAll(){
		return this.jobseekerService.getAll();
		
	}
	
	 @PostMapping("/add")
	    public Result add(@RequestBody JobSeekers jobseeker) {
		 Result result = jobseekerService.add(jobseeker);
	        if (!result.isSuccess()){
	            return new ErrorResult(result.getMessage());
	        }
	        return new SuccessResult(result.getMessage());
	    }


}
