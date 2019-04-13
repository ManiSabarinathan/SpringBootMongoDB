A Sample application to fetch the data MongoDB

Step-1: Mongo Configuration in java 
        @Configuration
        @EnableMongoConfiguration
        Create a default record through CommandLineRunner

Step-2: Create a Document Class(POJO)
        @Document
        public class User {
		
	}

Step-3: Create a Repository class
        public interface UserRepository extends MongoRepository<Users,Ingeger> {
	}

Step-4: update appliation.properties for MongoDB connection details
        spring.data.mongodb.hostname=<<localhost>>
        spring.data.mongodb.port=27017
	spring.data.mongodb.repositories.enabled=true
	#To change the server port
	server.port=8089

Step-5: Create a RESTController REST API call to fetch/update the data through Repository class

 