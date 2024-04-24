FROM openjdk:17-jdk-alpine
COPY /target/*.jar demo-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-app.jar"]