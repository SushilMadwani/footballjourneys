FROM amazoncorretto:21-alpine-jdk
LABEL maiantainer="sushil.madwani@gmail.com"
COPY target/footballjourney-0.0.1-SNAPSHOT.jsr app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]
