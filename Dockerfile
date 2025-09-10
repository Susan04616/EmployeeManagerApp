FROM openjdk:17
COPY . /app
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "target/employee-manager-app.jar"]
