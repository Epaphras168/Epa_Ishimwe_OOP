# Use Java 23 image from Eclipse Temurin
FROM eclipse-temurin:23-jdk

WORKDIR /app

# Copy the compiled JAR
COPY out/artifacts/Advanced_Motor_Vehicle_Insurance_jar/Advanced_Motor_Vehicle_Insurance.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
