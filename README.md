# Basic Spring Boot API Rest

This basic spring-boot API uses the following tools :
* Spring Boot 2.1
* JDK 11
* Apache Maven 3.6
* MariaDB 10.2

## Installation 

In order to develop with docker, you first need to install docker on your computer. This installation process depends on your OS. 
For linux, it's pretty easy as docker needs to run on top of a linux kernel.  
For Windows, you could install and use it thanks to a VM virtualbox which will use a linux VM to run it, https://docs.docker.com/toolbox/overview/ for instance.

Go to the project's root directory, use `mvn install` to download and install all project's dependencies and `mvn package` after that to build the jar file (make sure that the jar is inside the target folder, ROOT_DIRECTORY/target/your_jar.jar). 
If you don't have maven, you should download it here : https://maven.apache.org/download.cgi.  

### Docker usage

Still in the project's root, execute `docker-compose up` to run the docker-compose.yml file and launch the containers (spring-boot application, mariaDB and phpMyAdmin link together). You should change the environment's variables in the docker-compose.yml file before. 

The Rest API will be available on port 8080 and phpMyAdmin on port 8081. 

The development process is described below :
* Develop with your favorite IDE
* `mvn package` in the root's directory to build the current jar project
* `docker-compose up` to run the containers 

### Development 

Start the WAMP server and be sure that MariaDB is running on port 3007 (if it's not, you can change the port in the application.properties spring file). You can use a different solution than WAMP server for windows to run MariaDB, but it's more complicated as you will need to install it by hand.  
Then, build and run the Spring Boot application with your IDE (IntelliJ IDEA or Eclipse I recommend). 
