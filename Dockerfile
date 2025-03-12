# Use a Java 17 base image (or Java 22 if you're certain you need it)
FROM openjdk:17-jdk-slim as build

# Set the working directory
WORKDIR /app

# Copy the Gradle wrapper and other necessary files
COPY gradle/ gradle/
COPY build.gradle settings.gradle /app/

# Copy the whole project
COPY . /app/

# Make sure Gradle wrapper is executable
RUN chmod +x gradlew

# Build the application
RUN ./gradlew clean build -x test

# Use a Java 17 runtime image to run the app
FROM openjdk:17-jre-slim

# Copy the built JAR from the previous stage
COPY --from=build /app/build/libs/*.jar /app/app.jar

# Expose the application port (default Spring Boot port is 8080)
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "/app/app.jar"]
