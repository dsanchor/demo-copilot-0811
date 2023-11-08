# Use OpenJDK 17 as base
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/demo0811-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

# Specify the startup command
CMD ["java", "-jar", "app.jar"]
