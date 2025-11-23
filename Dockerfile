# Build stage
FROM eclipse-temurin:21-jre-alpine AS builder
WORKDIR /app
COPY build/libs/*.jar app.jar

# Production stage
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=builder /app/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]