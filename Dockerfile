FROM java:8

EXPOSE 8080
ADD target/dockerj8.jar dockerj8.jar

ENTRYPOINT ["java", "-jar", "dockerj8.jar"]