# Use a concrete, known base image
FROM openjdk:17.0.1-jdk-slim
# Create app dir
WORKDIR /app
# Copy the built jar into the image
COPY target/StudentWebApp-0.0.1-SNAPSHOT.jar ./StudentWebApp-0.0.1-SNAPSHOT.jar
# Expose port (optional, for documentation)
EXPOSE 8080
# Run the jar
ENTRYPOINT ["java", "-jar", "StudentWebApp-0.0.1-SNAPSHOT.jar"]