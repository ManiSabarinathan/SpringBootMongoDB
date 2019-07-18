package com.juju.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.juju.mongo.document.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, Integer>{
	@Query("{'name' : ?0 }")
	public Users findByName(String name);
	
	public Users findByNameContainingIgnoreCase(String name);
}
