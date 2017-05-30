FROM openjdk:latest

ADD target/ipservice-boot-docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8090
CMD /usr/bin/java -Xmx400m -Xms400m -jar ipservice-boot-docker-0.0.1-SNAPSHOT.jar

