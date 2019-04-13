package com.juju.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juju.mongo.document.Users;
import com.juju.mongo.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	
}
