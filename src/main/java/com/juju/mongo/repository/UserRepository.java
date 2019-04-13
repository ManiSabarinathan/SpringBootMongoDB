package com.juju.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.juju.mongo.document.Users;

public interface UserRepository extends MongoRepository<Users,Integer> {

}
