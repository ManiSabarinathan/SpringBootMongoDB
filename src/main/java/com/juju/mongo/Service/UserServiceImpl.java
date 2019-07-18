package com.juju.mongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.juju.mongo.document.Users;
import com.juju.mongo.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Users findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public Users findByNameContainingIgnoreCase(String name){
		return userRepository.findByNameContainingIgnoreCase(name);
	}

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}	
	
	@Override
	public Users addUser(Users user) {
		return userRepository.save(user);
	}
	
	@Override
	public Users updateUser(Users user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
