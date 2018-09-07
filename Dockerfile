FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER nestor.morocco@gmail.com
COPY target/saludo-eureka-naming-server-0.0.1-SNAPSHOT.jar /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/saludo-eureka-naming-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761

