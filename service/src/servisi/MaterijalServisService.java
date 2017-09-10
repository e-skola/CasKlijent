
package servisi;

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
@WebServiceClient(name = "MaterijalServisService", targetNamespace = "http://servisi/", wsdlLocation = "http://127.0.0.1:5001/Cas?wsdl")
public class MaterijalServisService
    extends Service
{

    private final static URL MATERIJALSERVISSERVICE_WSDL_LOCATION;
    private final static WebServiceException MATERIJALSERVISSERVICE_EXCEPTION;
    private final static QName MATERIJALSERVISSERVICE_QNAME = new QName("http://servisi/", "MaterijalServisService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:5001/Cas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATERIJALSERVISSERVICE_WSDL_LOCATION = url;
        MATERIJALSERVISSERVICE_EXCEPTION = e;
    }

    public MaterijalServisService() {
        super(__getWsdlLocation(), MATERIJALSERVISSERVICE_QNAME);
    }

    public MaterijalServisService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MATERIJALSERVISSERVICE_QNAME, features);
    }

    public MaterijalServisService(URL wsdlLocation) {
        super(wsdlLocation, MATERIJALSERVISSERVICE_QNAME);
    }

    public MaterijalServisService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MATERIJALSERVISSERVICE_QNAME, features);
    }

    public MaterijalServisService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MaterijalServisService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IMaterijalServis
     */
    @WebEndpoint(name = "MaterijalServisPort")
    public IMaterijalServis getMaterijalServisPort() {
        return super.getPort(new QName("http://servisi/", "MaterijalServisPort"), IMaterijalServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMaterijalServis
     */
    @WebEndpoint(name = "MaterijalServisPort")
    public IMaterijalServis getMaterijalServisPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servisi/", "MaterijalServisPort"), IMaterijalServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATERIJALSERVISSERVICE_EXCEPTION!= null) {
            throw MATERIJALSERVISSERVICE_EXCEPTION;
        }
        return MATERIJALSERVISSERVICE_WSDL_LOCATION;
    }

}
