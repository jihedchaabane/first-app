FROM openjdk:21
EXPOSE 8080
ADD target/first-app-0.0.1-SNAPSHOT.jar first-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "first-app-0.0.1-SNAPSHOT.jar"]