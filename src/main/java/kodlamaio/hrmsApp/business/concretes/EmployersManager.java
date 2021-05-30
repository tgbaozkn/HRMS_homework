package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.EmployersService;
import kodlamaio.hrmsApp.business.constants.Messages;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.validations.abstracts.EmailActivationService;
import kodlamaio.hrmsApp.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrmsApp.dataAccess.abstracts.UsersDao;
import kodlamaio.hrmsApp.entities.concretes.Employers;



@Service 
public class EmployersManager implements EmployersService{
	private EmployersDao employersDao;
	private EmailActivationService emailActivationService;
	private UsersDao userDao;
	@Autowired 
	public EmployersManager(EmployersDao employersDao, EmailActivationService emailActivationService,UsersDao userDao)
	{
		super();
		this.employersDao =employersDao;
		this.emailActivationService = emailActivationService;
		this.userDao = userDao;
		
	}
	@Override
	public DataResult<List<Employers>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"İş verenler listelendi");
	}

	@Override
	public Result add(Employers employer) {
		// TODO Auto-generated method stub
		Result result = emailActivationService.Control(employer.getUser());
		 if (!result.isSuccess()){
	            return new ErrorResult(result.getMessage());
	        }
	    

	     if(userDao.findByEmail(employer.getUser().getEmail()).stream().count() != 0){
	            return new ErrorResult(Messages.EmailUsing);
	        }

		this.employersDao.save(employer);
		// TODO Auto-generated method stub
		return new SuccessDataResult("İş veren eklendi");
	}

	@Override
	public Result delete(Employers employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Employers employer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<Employers>> findByNameIs(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
