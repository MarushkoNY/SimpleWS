
package serverws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrintMessageResponse_QNAME = new QName("http://serverWS/", "printMessageResponse");
    private final static QName _GetData_QNAME = new QName("http://serverWS/", "getData");
    private final static QName _PrintMessage_QNAME = new QName("http://serverWS/", "printMessage");
    private final static QName _GetDataResponse_QNAME = new QName("http://serverWS/", "getDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link PrintMessageResponse }
     * 
     */
    public PrintMessageResponse createPrintMessageResponse() {
        return new PrintMessageResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link PrintMessage }
     * 
     */
    public PrintMessage createPrintMessage() {
        return new PrintMessage();
    }

    /**
     * Create an instance of {@link DataEntity }
     * 
     */
    public DataEntity createDataEntity() {
        return new DataEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverWS/", name = "printMessageResponse")
    public JAXBElement<PrintMessageResponse> createPrintMessageResponse(PrintMessageResponse value) {
        return new JAXBElement<PrintMessageResponse>(_PrintMessageResponse_QNAME, PrintMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverWS/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverWS/", name = "printMessage")
    public JAXBElement<PrintMessage> createPrintMessage(PrintMessage value) {
        return new JAXBElement<PrintMessage>(_PrintMessage_QNAME, PrintMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverWS/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

}
