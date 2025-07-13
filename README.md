# footballjourneys

## Running with Docker

This project uses Java 17 (Eclipse Temurin) and Maven for building a Spring Boot application. You can run the application using Docker Compose, which will build the image and start the service.

- **Java version:** 17 (Eclipse Temurin)
- **Exposed port:** 8080 (Spring Boot default)
- **No required environment variables** are specified by default.

### Build and Run

```sh
docker compose up --build
```

This will build the application and start the `java-app` service, exposing it on [http://localhost:8080](http://localhost:8080).

No additional configuration is required. If you need to set environment variables, you can uncomment the `env_file` line in the `docker-compose.yaml` and provide a `.env` file.
