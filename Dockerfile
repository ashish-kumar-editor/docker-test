FROM eclipse-temurin:17-jdk

COPY target/docker-app.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-app.jar"]