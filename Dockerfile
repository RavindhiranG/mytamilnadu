FROM eclipse-temurin:17
COPY target/mytamilnadu.jar mytamilnadu.jar
CMD [ "java","-jar","mytamilnadu.jar" ]