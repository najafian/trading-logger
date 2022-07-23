FROM openjdk:11
VOLUME /tmp
ADD target/logger-1.0.0.jar logger.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","logger.jar"]