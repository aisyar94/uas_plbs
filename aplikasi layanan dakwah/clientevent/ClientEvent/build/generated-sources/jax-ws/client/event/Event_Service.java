
package client.event;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Event", targetNamespace = "http://event.server/", wsdlLocation = "http://localhost:8080/Dakwah/Event?wsdl")
public class Event_Service
    extends Service
{

    private final static URL EVENT_WSDL_LOCATION;
    private final static WebServiceException EVENT_EXCEPTION;
    private final static QName EVENT_QNAME = new QName("http://event.server/", "Event");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Dakwah/Event?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EVENT_WSDL_LOCATION = url;
        EVENT_EXCEPTION = e;
    }

    public Event_Service() {
        super(__getWsdlLocation(), EVENT_QNAME);
    }

    public Event_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EVENT_QNAME, features);
    }

    public Event_Service(URL wsdlLocation) {
        super(wsdlLocation, EVENT_QNAME);
    }

    public Event_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EVENT_QNAME, features);
    }

    public Event_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Event_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Event
     */
    @WebEndpoint(name = "EventPort")
    public Event getEventPort() {
        return super.getPort(new QName("http://event.server/", "EventPort"), Event.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Event
     */
    @WebEndpoint(name = "EventPort")
    public Event getEventPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://event.server/", "EventPort"), Event.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EVENT_EXCEPTION!= null) {
            throw EVENT_EXCEPTION;
        }
        return EVENT_WSDL_LOCATION;
    }

}
