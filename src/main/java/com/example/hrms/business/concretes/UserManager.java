package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.dataAccess.abstracts.UserDao;
import com.example.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		 this.userDao.save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.userDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
