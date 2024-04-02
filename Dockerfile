FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
#COPY . .
RUN mvn -f /home/app/pom.xml clean package
COPY target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]

#FROM eclipse-temurin:21-jdk-jammy
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
##RUN ./mvnw dependency:resolve
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]
#CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]

#
#

## Use a MySQL base image
#FROM mysql:latest
## Add a database
#ENV MYSQL_DATABASE senior_mmet_db

# Usa una imagen de Java como base
#FROM bjdelacruz/amazoncorretto-20.0.1-gradle-8.2.1
##
### Establece el directorio de trabajo en la imagen
#WORKDIR /app
##
#COPY . /app
##RUN ./mvnw clean package
#COPY target/seniormeet.jar app.jar
####RUN mvn clean clean
#CMD ["java", "-jar", "target/app.jar"]

#FROM mysql:8.0
#ENV MYSQL_ROOT_PASSWORD admin
#ENV MYSQL_DATABASE senior_meet_db

# docker build --tag sm_image .
# docker run -d --name mysql-cont -e MYSQL_ROOT_PASSWORD=admin -p 3307:3307 mysql:latest
# docker run --name sm_container -p 8080:8080 sm_image
# docker run -d --name sm-container --network="container:mysql-cont" sm_image

# docker start sm_container
# docker logs -f sm_container

# docker network create sm-net
# docker run -d --name sm-mysql-container -e MYSQL_ROOT_PASSWORD=admin -p 3307:3307 --network=sm-net mysql:latest
# docker build -t sm-image .
# docker run -d --name sm-java-app-container --network=sm-net --network="container:sm-mysql-container" sm-image