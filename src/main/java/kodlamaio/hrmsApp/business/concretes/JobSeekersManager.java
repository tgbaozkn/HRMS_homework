package kodlamaio.hrmsApp.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrmsApp.business.abstracts.JobSeekersService;
import kodlamaio.hrmsApp.business.constants.Messages;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.core.utilities.validations.abstracts.EmailActivationService;
import kodlamaio.hrmsApp.core.utilities.validations.abstracts.MernisActivationService;
import kodlamaio.hrmsApp.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrmsApp.dataAccess.abstracts.UsersDao;
import kodlamaio.hrmsApp.entities.concretes.JobSeekers;


public class JobSeekersManager implements JobSeekersService

{
	private JobSeekersDao jobseekersDao;	
	private EmailActivationService emailActivationService;
	private UsersDao userDao;
	private MernisActivationService mernisActivationService;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobseekersDao,
			EmailActivationService emailActivationService,
			UsersDao usersDao,
			MernisActivationService mernisActivationService) {
		this.jobseekersDao = jobseekersDao;
		this.emailActivationService = emailActivationService;
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<JobSeekers>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekers>>
		(this.jobseekersDao.findAll(),"İş arayanlar listelendi");
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		try {
			Result result_two = mernisActivationService.checkIfRealPerson(jobSeekers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Result result = emailActivationService.Control(jobSeekers.getUser());
		Result result_three = isJobSeekerAppropriate(jobSeekers);
		 if(!result_three.isSuccess()){
	            return new ErrorResult(result.getMessage());
	        }
		
		 if (!result.isSuccess()){
	            return new ErrorResult(result.getMessage());
	        }
	    
		 jobseekersDao.save(jobSeekers);
		 
	    
		// TODO Auto-generated method stub
		return new SuccessResult(Messages.UserAdded);
	}

	@Override
	public Result delete(JobSeekers jobSeekers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobSeekers jobSeekers) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 private Result isJobSeekerAppropriate(JobSeekers jobSeeker){

	        if(jobSeeker.getUser().getEmail() == null){
	            return new ErrorResult(Messages.MailCanNotBeNull);
	        }
	        if(jobSeeker.getUser().getPassword() == null){
	            return new ErrorResult(Messages.PasswordCanNotBeNull);
	        }
	        if(jobSeeker.getFirstName() == null || jobSeeker.getSurname() == null){
	            return new ErrorResult(Messages.NameCanNotBeNull);
	        }
	        if(String.valueOf(jobSeeker.getNationalId()).length() != 11){
	            return new ErrorResult(Messages.NationalityIdIncorrect);
	        }
	        if(jobSeeker.getBirthDate() <= 1900 || jobSeeker.getBirthDate() > LocalDate.now().getYear()){
	            return new ErrorResult(Messages.BirthYearIncorrect);
	        }
	        if(userDao.findByEmail(jobSeeker.getUser().getEmail()).stream().count() != 0){
	            return new ErrorResult(Messages.EmailUsing);
	        }
	        if(jobseekersDao.findByNationalityId(jobSeeker.getNationalId()).stream().count() != 0){
	            return new ErrorResult(Messages.NationalityIdUsing);
	        }

	        return new SuccessResult(Messages.JobSeekerAppropriate);

	    }

}
