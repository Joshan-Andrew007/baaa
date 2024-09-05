FROM openjdk:21
COPY ./target/userr.jar userr.jar
CMD ["java","-jar","userr.jar"]