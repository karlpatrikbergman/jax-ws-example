package se.patrikbergman.java.jaxws.ws;

import javax.jws.WebService;
import java.time.LocalTime;

//Service Implementation
@WebService(endpointInterface = "se.patrikbergman.java.jaxws.ws.Time")
public class TimeImpl implements Time {
	public String getCurrentTime() {
        return LocalTime.now().toString();
	}
}