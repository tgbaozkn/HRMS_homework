package kodlamaio.hrmsApp.core.utilities.validations.abstracts;

import kodlamaio.hrmsApp.entities.concretes.Users;

public interface CheckbyHrmsPersonService {
	
		public boolean isValid(Users user);
		public void message(String message);
		
	
}
