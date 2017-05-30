FROM openjdk:latest

ADD target/ipclient-boot-docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8090
CMD /usr/bin/java -Xmx400m -Xms400m -jar ipclient-boot-docker-0.0.1-SNAPSHOT.jar

