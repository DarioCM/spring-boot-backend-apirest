FROM openjdk:17.0.2

WORKDIR /app

COPY build/libs/spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar"]