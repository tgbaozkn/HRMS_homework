package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.EmployersService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrmsApp.entities.concretes.Employers;



@Service 
public class EmployersManager implements EmployersService{
	private EmployersDao employersDao;
	@Autowired 
	public EmployersManager(EmployersDao employersDao)
	{
		super();
		this.employersDao =employersDao;
		
	}
	@Override
	public DataResult<List<Employers>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Employers employer) {
		// TODO Auto-generated method stub
		this.employersDao.save(employer);
		// TODO Auto-generated method stub
		return new SuccessDataResult("Ürün eklendi");
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

}
