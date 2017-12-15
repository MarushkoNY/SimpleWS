
package serverws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DataWS", targetNamespace = "http://serverWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataWS {


    /**
     * 
     * @return
     *     returns serverws.DataEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getData", targetNamespace = "http://serverWS/", className = "serverws.GetData")
    @ResponseWrapper(localName = "getDataResponse", targetNamespace = "http://serverWS/", className = "serverws.GetDataResponse")
    @Action(input = "http://serverWS/DataWS/getDataRequest", output = "http://serverWS/DataWS/getDataResponse")
    public DataEntity getData();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "printMessage", targetNamespace = "http://serverWS/", className = "serverws.PrintMessage")
    @ResponseWrapper(localName = "printMessageResponse", targetNamespace = "http://serverWS/", className = "serverws.PrintMessageResponse")
    @Action(input = "http://serverWS/DataWS/printMessageRequest", output = "http://serverWS/DataWS/printMessageResponse")
    public void printMessage();

}