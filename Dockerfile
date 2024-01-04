FROM lolhens/baseimage-openjre
ADD /target/SpringBoot-Demo.jar SpringBoot-Demo.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","SpringBoot-Demo.jar"]
