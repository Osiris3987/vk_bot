FROM maven:3.8.5-openjdk-17 AS builder
COPY ./ ./
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
COPY --from=builder target/vk_bot-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]