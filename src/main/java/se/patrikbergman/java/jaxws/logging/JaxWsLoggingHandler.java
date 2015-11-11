package se.patrikbergman.java.jaxws.logging;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.util.Set;

public class JaxWsLoggingHandler implements SOAPHandler<SOAPMessageContext> {

    public void close(MessageContext arg0) {
    }

    public boolean handleFault(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        try {
            message.writeTo(System.out);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean handleMessage(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        boolean isOutboundMessage = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (isOutboundMessage) {
            System.out.println("OUTBOUND MESSAGE\n");

        } else {
            System.out.println("INBOUND MESSAGE\n");
        }
        try {
            message.writeTo(System.out);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public Set<QName> getHeaders() {
        return null;
    }

}