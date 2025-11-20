FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080

COPY --from=builder /app/target/gestao-vagas-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]