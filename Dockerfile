FROM amazoncorretto:21-alpine-jdk
LABEL maiantainer="sushil.madwani@gmail.com"
# Maven build stage
WORKDIR /app
# Build springboot app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -Dmaven.test.skip
ENTRYPOINT ["java","-XX:MaxHeapSize=500m","-jar","/app/footballjourney.jar"]

