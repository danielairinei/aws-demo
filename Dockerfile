FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar ./demo-aws.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-aws.jar"]