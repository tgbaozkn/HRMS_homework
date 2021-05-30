package kodlamaio.hrmsApp.apiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.JobTitlesService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
	private JobTitlesService jobtitlesService; //aslında burada productmanager var
	public JobTitlesController(JobTitlesService jobtitlesService) {
		super();
		this.jobtitlesService = jobtitlesService;
	}

	@GetMapping("/getall")//bu controllerın sonuna bunu da koyarsak getall fonksiyonuna erişir.
	public DataResult<List<JobTitles>> getAll(){
		return this.jobtitlesService.getAll();
		
	}
	 @PostMapping("/add")
	    public Result add(@RequestBody JobTitles jobtitle) {
		 Result result = jobtitlesService.add(jobtitle);
	        if (!result.isSuccess()){
	            return new ErrorResult(result.getMessage());
	        }
	        return new SuccessResult(result.getMessage());
	    }

}

