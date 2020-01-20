
package org.mesutormanli.ibbwsclient.iett.ibb;

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
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ibb", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://api.ibb.gov.tr/iett/ibb/ibb.asmx?wsdl")
public class Ibb
    extends Service
{

    private final static URL IBB_WSDL_LOCATION;
    private final static WebServiceException IBB_EXCEPTION;
    private final static QName IBB_QNAME = new QName("http://tempuri.org/", "ibb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://api.ibb.gov.tr/iett/ibb/ibb.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IBB_WSDL_LOCATION = url;
        IBB_EXCEPTION = e;
    }

    public Ibb() {
        super(__getWsdlLocation(), IBB_QNAME);
    }

    public Ibb(WebServiceFeature... features) {
        super(__getWsdlLocation(), IBB_QNAME, features);
    }

    public Ibb(URL wsdlLocation) {
        super(wsdlLocation, IBB_QNAME);
    }

    public Ibb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IBB_QNAME, features);
    }

    public Ibb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Ibb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IbbSoap
     */
    @WebEndpoint(name = "ibbSoap")
    public IbbSoap getIbbSoap() {
        return super.getPort(new QName("http://tempuri.org/", "ibbSoap"), IbbSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns IbbSoap
     */
    @WebEndpoint(name = "ibbSoap")
    public IbbSoap getIbbSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ibbSoap"), IbbSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IBB_EXCEPTION!= null) {
            throw IBB_EXCEPTION;
        }
        return IBB_WSDL_LOCATION;
    }

}
