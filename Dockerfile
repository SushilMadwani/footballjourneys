#Download base image maven
FROM maven:3.9.9-amazoncorretto-17-alpine AS maven_builder

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
FROM eclipse-temurin:17.0.15_6-jdk
COPY --from=maven_builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-XX:MaxHeapSize=850m", "-jar","app.jar"]



