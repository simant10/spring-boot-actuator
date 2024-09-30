### 1. What is Spring-Boot actuator ?
>Spring boot actuator is a sub project of spring boot framwork. 
>It includes number of aditional feature that helps us to monitor and manage the Spring Application.
>By default we can use two(/health and /info) end points, if we want to use all endpoint of actuator then we need to do some configuration.

### 1. How can we use actuator ?
> Add actuator starter Maven Dependency into pom file
> $${\color{green} spring-boot-starter-actuator}$$
> Add the below into application.property file
> $${\color{green}management.endpoints.web.exposure.include=.*}$$
### 1. Below are the endpoints of actuator ?
| 	Id	 | 	Usages	 | 	
| 	:-----:	 | 	:-----:	 | 
| 	/beans 	| 	returns all available beans in our BeanFactory. 	|  
| 	/info 	| 	returns general information. It might be custom data, build information or details about the latest commit	| 	 
| 	/loggers | 	enables us to query and modify the logging level of our application	| 	
| 	/env 	| 	returns the current environment properties. Additionally, we can retrieve single properties.	| 
| 	/health	| 	summarizes the health status of our application	| 	 

 
   
 
