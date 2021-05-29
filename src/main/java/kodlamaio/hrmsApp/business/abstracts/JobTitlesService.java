package kodlamaio.hrmsApp.business.abstracts;

import java.util.List;

import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;

import kodlamaio.hrmsApp.entities.concretes.JobTitles;

public interface JobTitlesService {
	DataResult<List<JobTitles>> getAll();
	Result add(JobTitles jobTitles);
	Result delete(JobTitles jobTitles);
	Result update(JobTitles jobTitles);

}
