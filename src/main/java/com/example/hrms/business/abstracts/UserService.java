package com.example.hrms.business.abstracts;

import java.util.List;


import com.example.hrms.entities.concretes.User;



public interface UserService {
	void save(User user);
	void delete(User user);
    List<User> getAll();
    
}
