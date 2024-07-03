# Etapa de compilación
FROM maven:3.8.5-openjdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM openjdk:11-jdk-slim
COPY --from=build /target/sanapet-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
