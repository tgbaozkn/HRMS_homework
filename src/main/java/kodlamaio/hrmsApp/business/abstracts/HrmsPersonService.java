package kodlamaio.hrmsApp.business.abstracts;

import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.HrmsPerson;

public interface HrmsPersonService {
	Result confirm(HrmsPerson hrmsPerson);

}
