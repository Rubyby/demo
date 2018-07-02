FROM openjdk:9

COPY ./build/libs/*.jar demo.jar

ENTRYPOINT ["java","-Djavasecurity.egd-file:/dev/./urandom","-jar","/demo.jar"]

