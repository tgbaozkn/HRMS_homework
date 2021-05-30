package kodlamaio.hrmsApp.core.utilities.validations.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.constants.Messages;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.core.utilities.validations.abstracts.EmailActivationService;
import kodlamaio.hrmsApp.entities.concretes.Users;
@Service
public class EmailActivationManager implements EmailActivationService {
	private static final String EMAIL_PATTERN = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public Result Control(Users user) {
		// TODO Auto-generated method stub
		 return new SuccessResult(Messages.Verified);
	}

	@Override
	public boolean checkIfRealEmail(String email) {
		// TODO Auto-generated method stub
		
		 Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
         return pattern.matcher(email).find();
	}

}
