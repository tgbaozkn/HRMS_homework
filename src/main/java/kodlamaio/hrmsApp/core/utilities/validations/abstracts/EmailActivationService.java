package kodlamaio.hrmsApp.core.utilities.validations.abstracts;

import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.Users;

public interface EmailActivationService {
	Result Control(Users user);
	boolean checkIfRealEmail(String email);
}