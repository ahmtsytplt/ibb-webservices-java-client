
package org.mesutormanli.ibbwsclient.iett.sefergerceklesme;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SeferGerceklesmeSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SeferGerceklesmeSoap {


    /**
     * 
     * @return
     *     returns org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihXMLResponse.GetBozukSatihXMLResult
     */
    @WebMethod(operationName = "GetBozukSatih_XML", action = "http://tempuri.org/GetBozukSatih_XML")
    @WebResult(name = "GetBozukSatih_XMLResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBozukSatih_XML", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihXML")
    @ResponseWrapper(localName = "GetBozukSatih_XMLResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihXMLResponse")
    public org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihXMLResponse.GetBozukSatihXMLResult getBozukSatihXML();

    /**
     * 
     * @param saat
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBozukSatih_json", action = "http://tempuri.org/GetBozukSatih_json")
    @WebResult(name = "GetBozukSatih_jsonResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBozukSatih_json", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihJson")
    @ResponseWrapper(localName = "GetBozukSatih_jsonResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetBozukSatihJsonResponse")
    public String getBozukSatihJson(
        @WebParam(name = "saat", targetNamespace = "http://tempuri.org/")
        int saat);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetFiloAracKonum_json", action = "http://tempuri.org/GetFiloAracKonum_json")
    @WebResult(name = "GetFiloAracKonum_jsonResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFiloAracKonum_json", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetFiloAracKonumJson")
    @ResponseWrapper(localName = "GetFiloAracKonum_jsonResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetFiloAracKonumJsonResponse")
    public String getFiloAracKonumJson();

    /**
     * 
     * @param tarih
     * @return
     *     returns org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult
     */
    @WebMethod(operationName = "GetKazaLokasyon_XML", action = "http://tempuri.org/GetKazaLokasyon_XML")
    @WebResult(name = "GetKazaLokasyon_XMLResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetKazaLokasyon_XML", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonXML")
    @ResponseWrapper(localName = "GetKazaLokasyon_XMLResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonXMLResponse")
    public org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult getKazaLokasyonXML(
        @WebParam(name = "Tarih", targetNamespace = "http://tempuri.org/")
        String tarih);

    /**
     * 
     * @param tarih
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetKazaLokasyon_json", action = "http://tempuri.org/GetKazaLokasyon_json")
    @WebResult(name = "GetKazaLokasyon_jsonResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetKazaLokasyon_json", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonJson")
    @ResponseWrapper(localName = "GetKazaLokasyon_jsonResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.sefergerceklesme.GetKazaLokasyonJsonResponse")
    public String getKazaLokasyonJson(
        @WebParam(name = "Tarih", targetNamespace = "http://tempuri.org/")
        String tarih);

}
