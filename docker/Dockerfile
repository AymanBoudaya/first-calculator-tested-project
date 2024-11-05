# Use a Maven image for building the application
FROM maven:3.8.8-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the Maven project files and build the project
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Use a lightweight JRE image to run the application
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the built JAR file from the Maven container
COPY --from=build /app/target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]