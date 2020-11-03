FROM openjdk:11
ADD target/spring-boot-app.jar spring-boot-app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","spring-boot-app.jar"]