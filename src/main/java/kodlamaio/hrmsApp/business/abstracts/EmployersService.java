package kodlamaio.hrmsApp.business.abstracts;

import java.util.List;

import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.Employers;


public interface EmployersService {
	DataResult<List<Employers>> getAll();
	Result add(Employers employer);
	Result delete(Employers employer);
	Result update(Employers employer);

}
