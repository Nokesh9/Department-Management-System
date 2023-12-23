# Department-Management-System
Simple CRUD application using #spring-boot,#mysql
REQUIREMENTS: 
-JAVA 17 
-SPRING TOOL SUITE IDE 
-POSTMAN 
 
Steps for implementing Basic Spring REST API Service : 
Initializing the Spring Boot Application : 
➢	The first thing you should do is familiarize yourself with the basics of Spring and set up a Spring Boot application.  
➢	Open Google chrome or any other browser and type https://start.spring.io/  and browse then the following page will be displayed 
➢	Then choose lang, and Add Dependencies as shown below 
 
  
 
➢	Select the project as Maven and language as java and go with the springboot version 3.2.0 then name your project metadata as you like and do the packaging with jar(Java ARcheive) file and with the java version 
17. 
➢	Then you need to add some dependencies that are needed for our project. 
➢	As we can see the there is a Generate button in the above  picture. Click on that Generate button then a Department file will be downloaded automatically. 
➢	Then extract that Department zip file 
➢	After Extracting the zip file a file folder will be generated and in that folder there are some files like pom.xml , src , gitignore file ,mvnw files etc.Then go the folder path and remove the particular path present in it . 
  
➢	Remove that particular path and type cmd(command prompt). 
  
➢	After clicking enter you will able to see a command prompt window with that respective path. 
➢	Then type code . command then you will be able to see the vscode(Visual Studio Code) window with Department folder creation with that particular files. 
➢	After that I created a Model folder  and Controller folder inside the java/com/example/curdDemo and inside that Model folder I createdDepartmentEntity.java and inside that Controller folder I created DepartmentController.java file and inside the Repository and Service folder 
I created RepositoryDepartment.java and DepartmentService 
  
 Model class: 
In Spring MVC, the model works a container that contains the data of the application. Here, a data can be in any form such as objects, strings, information from the database, etc. 
Controller class: 
 In Spring Boot, the controller class is responsible for processing incoming REST API requests, preparing a model, and returning the view to be rendered as a response. The controller classes in Spring are annotated either by the @Controller or the @RestController annotation. 
Annotations used in TutorialController.java :  
In Spring Boot, are @RestController, @RequestMapping, and @GetMapping annotations commonly used for building RESTful APIs. Here's an explanation of each: 
@RestController: 
➢	The @RestController annotation is a specialized version of the  @Controller  annotation. It is used to indicate that the class defines a RESTful API endpoint. 
➢	When you annotate a class with @RestController, it implies that every method inside the class is treated as a controller method and returns the response in a format suitable for RESTful services (typically JSON). 
@RequestMapping: 
➢	The @RequestMapping annotation is used to map web requests to specific methods in a controller class. It can be applied at the class level and/or method level. 
➢	It allows you to define the base URI for all the methods in the class and then further refine the URI for each method. 
➢	It can specify the HTTP method (GET, POST, PUT, DELETE) and other request parameters. 
@GetMapping: 
➢	The @GetMapping annotation is a specialized version of 
@RequestMapping focused on HTTP GET requests. It is a shortcut for @RequestMapping(method = RequestMethod.GET). 
➢	It simplifies the code by making it more concise when you're dealing specifically with GET requests. 
➢	Here I used only @RestController,@RequestMapping,and @GetMapping annotations and by using the vendorId I will retrieve the details. 
➢	This code appears to be a Java class representing a RESTful API for managing cloud vendor details using the Spring Framework's @RestController and @RequestMapping annotations. 
➢	Then after run the application. As default the application will run on port 8080 in Apache Tomcat server. 
➢  
@PostMapping:
  
 
➢	. Create a newrequest file in ****** and name it as Put .Then the details are  updated. 
 
 
 
 
 
 @GetMapping : 
  
 
@PutMapping : 
  
 
 
@DeleteMapping : 
 
  
 
 
 
 
    .….THANK YOU….. 
 
