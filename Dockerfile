FROM openjdk:latest

WORKDIR /app

COPY target/music.be-1.0-SNAPSHOT.jar music.be-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/app/music.be-1.0-SNAPSHOT.jar"]