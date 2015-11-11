To generate JAX-WS portable artifacts:

in project root, run:
mvn build

in directory target/classes, run:
wsgen -keep -cp . se.patrikbergman.java.jaxws.ws.TimeImpl

in same directory, move generated java-files to the right package:
mv se/patrikbergman/java/jaxws/ws/jaxws/GetCurrentTime.java se/patrikbergman/java/jaxws/ws/jaxws/GetCurrentTimeResponse.java ../../src/main/java/se/patrikbergman/java/jaxws/ws/jaxws/
