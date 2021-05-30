package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.UsersService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.dataAccess.abstracts.UsersDao;
import kodlamaio.hrmsApp.entities.concretes.Users;


@Service
public class UsersManager implements UsersService {
	private UsersDao userdao;
	@Autowired
	public UsersManager(UsersDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public DataResult<List<Users>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Users>>
		(this.userdao.findAll(),"Kullanıcılar listelendi");
	}

	@Override
	public Result add(Users users) {
		this.userdao.save(users);
		// TODO Auto-generated method stub
		return new SuccessResult("yeni kullanıcı eklendi");
	}

}
