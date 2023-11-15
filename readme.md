## Springboot API Rest 
### Stack
* Java 17
* Springboot 2.7.17
* MySQL Database

### Maven Dependencies
* JavaWeb
* MySQL Driver
* Spring Data JPA


### App structure
```bash
├───.mvn
│   └───wrapper
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───api
│   │   │           └───crud
│   │   │               ├───controllers
│   │   │               ├───models
│   │   │               ├───repositories
│   │   │               └───services
│   │   └───resources
│   └───test
│       └───java
│           └───com
│               └───api
│                   └───crud
└───test-classes
        └───com
            └───api
                └───crud
```

### Notes: 
* 1º define the model
* 2º define the repository and configure the database access. I'm using Spring Data JPA
* 3º define the service and its methods (verbs GET, POST, etc)
* 4º setup the controller for each endpoint

#### Annotations
* `@SpringBootApplication` define the entry point
* `@Repository` Define classes with database access
* `@Autowired` for dependecy injections
* `@RestController` define the RESTful manager class
* `@RequestMapping("/end-point")` asociates controller methods with the end points
* `@GetMapping`, `@PostMapping`. etc: maps HTTP requests based on the HTTP method defined (Get, Post, Put, Delete, etc)
* `@Entity` Define a database table object
* `@Table` Define the database table name object 
* `@Column` Define details for the column in the table


### Upcoming updates:
* Create a new endpoint
* Try lombok library to avoid getters and setters
* Dockerize app