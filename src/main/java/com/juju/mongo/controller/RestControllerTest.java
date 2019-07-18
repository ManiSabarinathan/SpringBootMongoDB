package com.juju.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juju.mongo.Service.UserService;
import com.juju.mongo.document.Users;

@RestController
public class RestControllerTest {

		@Autowired
		UserService userservice;
		
		@GetMapping("/name/{username}")
		public Users getUserByName(@PathVariable String username) {
			return userservice.findByName(username);
		}
		
		@GetMapping(value = "/name/ignorecase/{name}")
		public Users getUserIgnoreCase(@PathVariable String name) {
			return userservice.findByNameContainingIgnoreCase(name);
		}
		
		@PostMapping("/adduser")
		public Users addUser(@RequestBody Users user) {
			return userservice.addUser(user);
		}
		
		@PutMapping("/updateuser")
		public Users updateUser(@RequestBody Users user){
		 return userservice.updateUser(user);
		}
		
		@DeleteMapping("/deleteuser/{id}")
		public String deleteUser(@PathVariable int id){
		  userservice.deleteUser(id);
		  return "Successfully deleted the user by ID:: " + id;
		}
		
		
}
