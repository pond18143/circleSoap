
package serviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceclient package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _CircleArea_QNAME = new QName("http://services/", "circleArea");
    private final static QName _CircleAreaResponse_QNAME = new QName("http://services/", "circleAreaResponse");
    private final static QName _CircumFerence_QNAME = new QName("http://services/", "circumFerence");
    private final static QName _CircumFerenceResponse_QNAME = new QName("http://services/", "circumFerenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CircleArea }
     * 
     */
    public CircleArea createCircleArea() {
        return new CircleArea();
    }

    /**
     * Create an instance of {@link CircleAreaResponse }
     * 
     */
    public CircleAreaResponse createCircleAreaResponse() {
        return new CircleAreaResponse();
    }

    /**
     * Create an instance of {@link CircumFerence }
     * 
     */
    public CircumFerence createCircumFerence() {
        return new CircumFerence();
    }

    /**
     * Create an instance of {@link CircumFerenceResponse }
     * 
     */
    public CircumFerenceResponse createCircumFerenceResponse() {
        return new CircumFerenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircleArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circleArea")
    public JAXBElement<CircleArea> createCircleArea(CircleArea value) {
        return new JAXBElement<CircleArea>(_CircleArea_QNAME, CircleArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircleAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circleAreaResponse")
    public JAXBElement<CircleAreaResponse> createCircleAreaResponse(CircleAreaResponse value) {
        return new JAXBElement<CircleAreaResponse>(_CircleAreaResponse_QNAME, CircleAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumFerence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircumFerence }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circumFerence")
    public JAXBElement<CircumFerence> createCircumFerence(CircumFerence value) {
        return new JAXBElement<CircumFerence>(_CircumFerence_QNAME, CircumFerence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumFerenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircumFerenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circumFerenceResponse")
    public JAXBElement<CircumFerenceResponse> createCircumFerenceResponse(CircumFerenceResponse value) {
        return new JAXBElement<CircumFerenceResponse>(_CircumFerenceResponse_QNAME, CircumFerenceResponse.class, null, value);
    }

}
