# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the maven wrapper files
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy the rest of your source code
COPY src ./src

# --- THIS IS THE "CODE BUILD" STEP ---
# Package the application into a JAR file
RUN ./mvnw package -DskipTests

# Expose the port the app runs on
EXPOSE 8080

# Define the command to run your app
ENTRYPOINT ["java", "-jar", "target/kaiburr-0.0.1-SNAPSHOT.jar"]