FROM openjdk:8-jdk-alpine

ARG JAR=app.jar
COPY ${JAR} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]