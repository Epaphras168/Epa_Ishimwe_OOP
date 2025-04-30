# Use Java 23 image from Eclipse Temurin
FROM eclipse-temurin:23-jdk

WORKDIR /app

# Copy the compiled JAR
COPY out/artifacts/Stock_Management_System_jar/Stock_Management_System.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
