package com.juju.mongo.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.juju.mongo.document.Users;

public interface UserService  {
	public Users findByName(String name);
	public Users findByNameContainingIgnoreCase(String name);
	public List<Users> findAll();

	public Users addUser(Users user);
	public Users updateUser(Users user);
	public void  deleteUser(int id);
}
