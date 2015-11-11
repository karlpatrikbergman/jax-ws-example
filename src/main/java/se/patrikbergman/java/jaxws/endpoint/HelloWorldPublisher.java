package se.patrikbergman.java.jaxws.endpoint;
 
import se.patrikbergman.java.jaxws.ws.TimeImpl;

import javax.xml.ws.Endpoint;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/time", new TimeImpl());
    }
 
}