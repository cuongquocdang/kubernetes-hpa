FROM amd64/eclipse-temurin:17-jdk
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "/application.jar"]
