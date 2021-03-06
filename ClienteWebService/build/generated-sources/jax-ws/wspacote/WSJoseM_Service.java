
package wspacote;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSJoseM", targetNamespace = "http://wsPacote/", wsdlLocation = "http://localhost:8080/WebService/WSJoseM?WSDL")
public class WSJoseM_Service
    extends Service
{

    private final static URL WSJOSEM_WSDL_LOCATION;
    private final static WebServiceException WSJOSEM_EXCEPTION;
    private final static QName WSJOSEM_QNAME = new QName("http://wsPacote/", "WSJoseM");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebService/WSJoseM?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSJOSEM_WSDL_LOCATION = url;
        WSJOSEM_EXCEPTION = e;
    }

    public WSJoseM_Service() {
        super(__getWsdlLocation(), WSJOSEM_QNAME);
    }

    public WSJoseM_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSJOSEM_QNAME, features);
    }

    public WSJoseM_Service(URL wsdlLocation) {
        super(wsdlLocation, WSJOSEM_QNAME);
    }

    public WSJoseM_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSJOSEM_QNAME, features);
    }

    public WSJoseM_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSJoseM_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSJoseM
     */
    @WebEndpoint(name = "WSJoseMPort")
    public WSJoseM getWSJoseMPort() {
        return super.getPort(new QName("http://wsPacote/", "WSJoseMPort"), WSJoseM.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSJoseM
     */
    @WebEndpoint(name = "WSJoseMPort")
    public WSJoseM getWSJoseMPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsPacote/", "WSJoseMPort"), WSJoseM.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSJOSEM_EXCEPTION!= null) {
            throw WSJOSEM_EXCEPTION;
        }
        return WSJOSEM_WSDL_LOCATION;
    }

}
