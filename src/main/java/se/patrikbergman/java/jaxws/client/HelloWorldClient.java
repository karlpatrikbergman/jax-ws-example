package se.patrikbergman.java.jaxws.client;
 
import se.patrikbergman.java.jaxws.logging.JaxWsHandlerResolver;
import se.patrikbergman.java.jaxws.ws.Time;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient{
 
	public static void main(String[] args) throws Exception {
 
		URL url = new URL("http://localhost:9999/ws/time?wsdl");
 
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.jaxws.java.patrikbergman.se/", "TimeImplService");
        Service service = Service.create(url, qname);
        service.setHandlerResolver(new JaxWsHandlerResolver());
        Time hello = service.getPort(Time.class);
        System.out.println(hello.getCurrentTime());
 
    }
 
}