
package org.mesutormanli.ibbwsclient.iett.hatdurakguzergah;

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
@WebServiceClient(name = "WebService1", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://api.ibb.gov.tr/iett/UlasimAnaVeri/HatDurakGuzergah.asmx?wsdl")
public class WebService1
    extends Service
{

    private final static URL WEBSERVICE1_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICE1_EXCEPTION;
    private final static QName WEBSERVICE1_QNAME = new QName("http://tempuri.org/", "WebService1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://api.ibb.gov.tr/iett/UlasimAnaVeri/HatDurakGuzergah.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICE1_WSDL_LOCATION = url;
        WEBSERVICE1_EXCEPTION = e;
    }

    public WebService1() {
        super(__getWsdlLocation(), WEBSERVICE1_QNAME);
    }

    public WebService1(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICE1_QNAME, features);
    }

    public WebService1(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICE1_QNAME);
    }

    public WebService1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICE1_QNAME, features);
    }

    public WebService1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebService1Soap
     */
    @WebEndpoint(name = "WebService1Soap")
    public WebService1Soap getWebService1Soap() {
        return super.getPort(new QName("http://tempuri.org/", "WebService1Soap"), WebService1Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns WebService1Soap
     */
    @WebEndpoint(name = "WebService1Soap")
    public WebService1Soap getWebService1Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WebService1Soap"), WebService1Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICE1_EXCEPTION!= null) {
            throw WEBSERVICE1_EXCEPTION;
        }
        return WEBSERVICE1_WSDL_LOCATION;
    }

}
