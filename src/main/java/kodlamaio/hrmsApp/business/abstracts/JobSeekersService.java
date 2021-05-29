package kodlamaio.hrmsApp.business.abstracts;

import java.util.List;

import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;

import kodlamaio.hrmsApp.entities.concretes.JobSeekers;

public interface JobSeekersService {
	DataResult<List<JobSeekers>> getAll();
	Result add(JobSeekers jobSeekers);
	Result delete(JobSeekers jobSeekers);
	Result update(JobSeekers jobSeekers);

}
