
FROM openjdk:18-jdk-alpine
ARG JAR_FILE=webapp-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]