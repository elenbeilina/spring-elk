FROM openjdk:17-jdk-alpine
COPY /target/spring-elk-*.jar spring-elk-*.jar
ENTRYPOINT ["java","-Dspring.profiles.active=logs","-jar","/spring-elk-*.jar"]