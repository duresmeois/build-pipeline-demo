FROM openjdk:11
ARG COMMIT_ID

COPY build/libs/*jar  app.jar

ENV COMMIT_ID ${COMMIT_ID}
ENTRYPOINT ["java","-jar","/app.jar"]
