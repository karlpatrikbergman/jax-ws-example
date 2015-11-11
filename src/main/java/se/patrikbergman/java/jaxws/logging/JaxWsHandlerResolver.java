package se.patrikbergman.java.jaxws.logging;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class JaxWsHandlerResolver implements HandlerResolver {

    @SuppressWarnings("rawtypes")
    public List<Handler> getHandlerChain(PortInfo arg0) {
        List<Handler> hchain = new ArrayList<Handler>();
        hchain.add(new JaxWsLoggingHandler());
        return hchain;
    }

}
