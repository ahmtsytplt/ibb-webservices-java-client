
package org.mesutormanli.ibbwsclient.iett.ibb;

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
@WebService(name = "ibbSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IbbSoap {


    /**
     * 
     * @param hatKodu
     * @return
     *     returns org.mesutormanli.ibbwsclient.iett.ibb.DurakDetayGYYResponse.DurakDetayGYYResult
     */
    @WebMethod(operationName = "DurakDetay_GYY", action = "http://tempuri.org/DurakDetay_GYY")
    @WebResult(name = "DurakDetay_GYYResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DurakDetay_GYY", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.ibb.DurakDetayGYY")
    @ResponseWrapper(localName = "DurakDetay_GYYResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.ibb.DurakDetayGYYResponse")
    public org.mesutormanli.ibbwsclient.iett.ibb.DurakDetayGYYResponse.DurakDetayGYYResult durakDetayGYY(
        @WebParam(name = "hat_kodu", targetNamespace = "http://tempuri.org/")
        String hatKodu);

    /**
     * 
     * @param hatKodu
     * @return
     *     returns org.mesutormanli.ibbwsclient.iett.ibb.HatServisiGYYResponse.HatServisiGYYResult
     */
    @WebMethod(operationName = "HatServisi_GYY", action = "http://tempuri.org/HatServisi_GYY")
    @WebResult(name = "HatServisi_GYYResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HatServisi_GYY", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.ibb.HatServisiGYY")
    @ResponseWrapper(localName = "HatServisi_GYYResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.iett.ibb.HatServisiGYYResponse")
    public org.mesutormanli.ibbwsclient.iett.ibb.HatServisiGYYResponse.HatServisiGYYResult hatServisiGYY(
        @WebParam(name = "hat_kodu", targetNamespace = "http://tempuri.org/")
        String hatKodu);

}
