
package se.patrikbergman.java.jaxws.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCurrentTimeResponse", namespace = "http://ws.jaxws.java.patrikbergman.se/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentTimeResponse", namespace = "http://ws.jaxws.java.patrikbergman.se/")
public class GetCurrentTimeResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    public String getReturn() {
        return this._return;
    }

    public void setReturn(String _return) {
        this._return = _return;
    }

}
