
package mypackage;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BanqueServiceService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8085/BanqueService?wsdl")
public class BanqueServiceService
    extends Service
{

    private final static URL BANQUESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BANQUESERVICESERVICE_EXCEPTION;
    private final static QName BANQUESERVICESERVICE_QNAME = new QName("http://service/", "BanqueServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/BanqueService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUESERVICESERVICE_WSDL_LOCATION = url;
        BANQUESERVICESERVICE_EXCEPTION = e;
    }

    public BanqueServiceService() {
        super(__getWsdlLocation(), BANQUESERVICESERVICE_QNAME);
    }

    public BanqueServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUESERVICESERVICE_QNAME, features);
    }

    public BanqueServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANQUESERVICESERVICE_QNAME);
    }

    public BanqueServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUESERVICESERVICE_QNAME, features);
    }

    public BanqueServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://service/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUESERVICESERVICE_EXCEPTION!= null) {
            throw BANQUESERVICESERVICE_EXCEPTION;
        }
        return BANQUESERVICESERVICE_WSDL_LOCATION;
    }

}
