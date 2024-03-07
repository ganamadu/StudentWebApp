FROM openjdk:17
ADD target/StudentWebApp-0.0.1-SNAPSHOT.jar StudentWebApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar","StudentWebApp-0.0.1-SNAPSHOT.jar"]