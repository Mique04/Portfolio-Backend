from openjdk:17-jdk-alpine
maintainer Miqueas
copy target/Portfolio-Web-0.0.1-SNAPSHOT.jar backend.jar
entrypoint ["java","-jar","/backend.jar"]