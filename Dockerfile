#FROM gradle:jdk17 as gradleimage
#COPY . /home/gradle/source
#WORKDIR /home/gradle/source
#RUN gradle build

#FROM openjdk:17.0.2
#WORKDIR /app
#CMD ["./gradlew", "clean", "bootJar"]
#COPY --from=gradleimage /home/gradle/source/build/libs/spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar /app/
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar"]


FROM openjdk:17.0.2
WORKDIR /spring-boot-backend-apirest
CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]