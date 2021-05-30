package kodlamaio.hrmsApp.core.utilities.validations.concretes;

import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.constants.Messages;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.core.utilities.validations.abstracts.MernisActivationService;
import kodlamaio.hrmsApp.entities.concretes.JobSeekers;
import tr.gov.nvi.tckimlik.WS.*;
@Service
public class MernisActivationManager implements MernisActivationService{

	@Override
	public Result checkIfRealPerson(JobSeekers jobSeeker) throws Exception {
		
	     KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy();
	     boolean result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalId()),
	                jobSeeker.getFirstName().toUpperCase(new Locale("tr")),
	                jobSeeker.getSurname().toUpperCase(new Locale("tr")),
	                jobSeeker.getBirthDate());
	     if (!result){
	            return new ErrorResult(Messages.NotValidUser);
	        }
	     return new SuccessResult(Messages.ValidUser);
	}

	

}
