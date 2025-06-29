#Download base image maven
FROM maven:3.9.7-eclipse-temurin-22-alpine AS maven_builder

# LABEL about the custom image
LABEL maintainer="smadwani@equinix.com"
LABEL description="docker image for Subscription Service"

# Maven build stage
WORKDIR /app

# Build springboot app
COPY pom.xml .
COPY src ./src

RUN mvn clean package -Dmaven.test.skip

# build JRE run image
FROM eclipse-temurin:22.0.1_8-jdk-alpine
COPY --from=maven_builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-XX:MaxHeapSize=850m", "-jar","app.jar"]



