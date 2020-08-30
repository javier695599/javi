FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER jcallejotelco@gmail.com
ADD jboss-service-spring-boot-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]