# Basic Spring Boot API Rest

This basic spring-boot API uses the following tools :
* Spring Boot 2.1
* JDK 11
* Apache Maven 3.6
* MariaDB 10.2

## Docker development 

### Installation

In order to develop with docker, you first need to install docker on your computer. This installation process depends on your OS. 
For linux, it's pretty easy as docker needs to run on top of a linux kernel.  
For Windows, you could install and use it thanks to a VM virtualbox which will use a linux VM to run it, https://docs.docker.com/toolbox/overview/ for instance.

Go to the project's root directory, use `mvn install` to download and install all project's dependencies and `mvn package` after that to build the jar file.  
If you don't have maven, you should download it here : https://maven.apache.org/download.cgi.  

### Development

Still in the project's root, execute `docker-compose up` to run the docker-compose.yml file and launch the containers (spring-boot application, mariaDB and phpMyAdmin link together).  

The Rest API will be available on port 8080 and phpMyAdmin on port 8081 

