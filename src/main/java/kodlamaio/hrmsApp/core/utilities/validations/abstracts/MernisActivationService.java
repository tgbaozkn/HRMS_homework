package kodlamaio.hrmsApp.core.utilities.validations.abstracts;

import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.JobSeekers;

public interface MernisActivationService {
	
	Result checkIfRealPerson(JobSeekers jobSeeker) throws Exception;
	

}
