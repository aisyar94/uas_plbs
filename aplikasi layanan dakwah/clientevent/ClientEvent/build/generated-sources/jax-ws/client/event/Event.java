
package client.event;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Event", targetNamespace = "http://event.server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Event {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://event.server/", className = "client.event.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://event.server/", className = "client.event.DeleteResponse")
    @Action(input = "http://event.server/Event/deleteRequest", output = "http://event.server/Event/deleteResponse")
    public String delete(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @param description
     * @param location
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEvent", targetNamespace = "http://event.server/", className = "client.event.UpdateEvent")
    @ResponseWrapper(localName = "updateEventResponse", targetNamespace = "http://event.server/", className = "client.event.UpdateEventResponse")
    @Action(input = "http://event.server/Event/updateEventRequest", output = "http://event.server/Event/updateEventResponse")
    public String updateEvent(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "location", targetNamespace = "")
        String location,
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEvent", targetNamespace = "http://event.server/", className = "client.event.GetEvent")
    @ResponseWrapper(localName = "getEventResponse", targetNamespace = "http://event.server/", className = "client.event.GetEventResponse")
    @Action(input = "http://event.server/Event/getEventRequest", output = "http://event.server/Event/getEventResponse")
    public List<Object> getEvent();

    /**
     * 
     * @param name
     * @param description
     * @param location
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEvent", targetNamespace = "http://event.server/", className = "client.event.AddEvent")
    @ResponseWrapper(localName = "addEventResponse", targetNamespace = "http://event.server/", className = "client.event.AddEventResponse")
    @Action(input = "http://event.server/Event/addEventRequest", output = "http://event.server/Event/addEventResponse")
    public String addEvent(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "location", targetNamespace = "")
        String location);

}
