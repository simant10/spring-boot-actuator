### 1. What is Spring-Boot actuator ?
>Spring boot actuator is a sub project of spring boot framwork. 
>It includes number of aditional feature that helps us to monitor and manage the Spring Application.
>By default we can use two(/health and /info) end points, if we want to use all endpoint of actuator then we need to do some configuration.

### 2. How can we use actuator ?
> Add actuator starter Maven Dependency into pom file
> $${\color{green} spring-boot-starter-actuator}$$
> Add the below into application.property file
> $${\color{green}management.endpoints.web.exposure.include=.*}$$
### 3. Below are the endpoints of actuator ?
| 	Id	 | 	Usages	 | 	
| 	:-----:	 | 	:-----:	 | 
| 	/beans 	| 	returns all available beans in our BeanFactory. 	|  
| 	/info 	| 	returns general information. It might be custom data, build information or details about the latest commit	| 	 
| 	/loggers | 	enables us to query and modify the logging level of our application	| 	
| 	/env 	| 	returns the current environment properties. Additionally, we can retrieve single properties.	| 
| 	/health	| 	summarizes the health status of our application	| 	 

### 4. Integration of actuator ?
#### 4.1 Go to start.sprint.io website and provide the below dependency 
>![image](https://github.com/user-attachments/assets/4df7b965-b7b1-4678-92b0-5e5fd621ed88)
#### 4.2 CLick on generate Icon and extract the project
#### 4.3 Import project into your IDE
#### 4.4 Build your project
> ![image](https://github.com/user-attachments/assets/2c464142-86d0-4a97-8dd3-85ea5087f75e)
#### 4.5 By default enabled endpoints
>  $${\color{green}http://localhost:8080/actuator}$$
> ![image](https://github.com/user-attachments/assets/e725f802-ddc8-4c8d-9878-7362dfd2aa1e)
#### 4.6 We can see all endpoints by doing the below config into application.properties file
>$${\color{green} management.endpoints.web.exposure.include=*}$$
>
>![image](https://github.com/user-attachments/assets/cd0aec18-6f16-4646-a4b2-12408495840a)
>
>![image](https://github.com/user-attachments/assets/d6806414-f439-4072-9a82-09dac3d6c813)







   
 
