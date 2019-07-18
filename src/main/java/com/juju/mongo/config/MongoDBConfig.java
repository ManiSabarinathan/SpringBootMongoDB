package com.juju.mongo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import com.juju.mongo.document.Users;
import com.juju.mongo.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		/*
		 * return new CommandLineRunner() {
		 * 
		 * @Override public void run(String... args) throws Exception {
		 * userRepository.save(new Users(1000, "Juju", 10000L)); userRepository.save(new
		 * Users(2000, "Papu", 2000L)); userRepository.save(new Users(3000, "Saba",
		 * 500L)); } };
		 */
		return string -> {
			userRepository.save(new Users(1000, "Juju", 10000L));
			userRepository.save(new Users(2000, "Papu", 2000L));
			userRepository.save(new Users(3000, "Saba", 500L));
		};

	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
