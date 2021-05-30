package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import kodlamaio.hrmsApp.business.abstracts.JobTitlesService;
import kodlamaio.hrmsApp.business.constants.Messages;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrmsApp.entities.concretes.Employers;
import kodlamaio.hrmsApp.entities.concretes.JobTitles;

public class JobTitlesManager implements JobTitlesService {
	private JobTitleDao jobTitleDao;

	@Override
	public DataResult<List<JobTitles>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobTitles>>
		(this.jobTitleDao.findAll(),"Meslekler listelendi");
	}

	@Override
	public Result add(JobTitles jobTitles) {
		if(jobTitleDao.findByJobName(jobTitles.getJobName()).stream().count() != 0){
            return new ErrorResult("Bu Adda Meslek Pozisyonu mevcuttur.");
        }
		this.jobTitleDao.save(jobTitles);
		// TODO Auto-generated method stub
		return new SuccessDataResult("Meslek eklendi");
	}

	@Override
	public Result delete(JobTitles jobTitles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobTitles jobTitles) {
		// TODO Auto-generated method stub
		return null;
	}

}
