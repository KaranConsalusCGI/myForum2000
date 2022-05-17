FROM maven:latest AS maven
WORKDIR /back
COPY . .
RUN mvn clean install

FROM openjdk:13-jdk-alpine
VOLUME /tmp
VOLUME /upload
COPY ./target/back-0.0.1-SNAPSHOT.jar back.jar
ENTRYPOINT ["java","-jar","back.jar"]
