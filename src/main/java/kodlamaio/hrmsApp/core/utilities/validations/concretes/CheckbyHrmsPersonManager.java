package kodlamaio.hrmsApp.core.utilities.validations.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.core.utilities.validations.abstracts.CheckbyHrmsPersonService;
import kodlamaio.hrmsApp.entities.concretes.Users;
@Service
public class CheckbyHrmsPersonManager implements CheckbyHrmsPersonService {

	@Override
	public boolean isValid(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void message(String message) {
		// TODO Auto-generated method stub
		
	}

}
