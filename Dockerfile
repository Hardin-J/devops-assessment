FROM openjdk:18
WORKDIR /app
COPY ./target/Api-0.0.1-SNAPSHOT.jar /app
EXPOSE 1200
CMD ["java", "-jar", "Api-0.0.1-SNAPSHOT.jar"]