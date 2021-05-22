package com.example.hrms.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.entities.concretes.User;



@RestController
@RequestMapping(path = "api/users")
public class UsersController {
	@Autowired
	 private final UserService userService;

	    public UsersController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping(path = "getall")
	    public List<User> getAll(){
	        return this.userService.getAll();
	    }

}
