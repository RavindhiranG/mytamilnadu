FROM eclipse-temurin:17
COPY target/mytamilnaduapp.jar mytamilnaduapp.jar
CMD [ "java","-jar","mytamilnaduapp.jar" ]