package kodlamaio.hrmsApp.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.EmployersService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.entities.concretes.Employers;




@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	@Autowired
	private EmployersService employerService; //aslında burada productmanager var
	public EmployerController(EmployersService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")//bu controllerın sonuna bunu da koyarsak getall fonksiyonuna erişir.
	public DataResult<List<Employers>> getAll(){
		return this.employerService.getAll();
		
	}
}
