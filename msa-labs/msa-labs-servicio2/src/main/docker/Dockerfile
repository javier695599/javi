FROM frolvlad/alpine-java:jdk8-slim
MAINTAINER jcallejom@yahoo.es
ADD msa-labs-servicio2-service-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]	