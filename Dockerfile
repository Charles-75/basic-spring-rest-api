FROM openjdk:11
ADD ./target/docker-spring-boot-api-rest.jar docker-spring-boot-api-rest.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-spring-boot-api-rest.jar"]


