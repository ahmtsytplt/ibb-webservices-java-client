
package org.mesutormanli.ibbwsclient.iett.ibb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hat_kodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hatKodu"
})
@XmlRootElement(name = "DurakDetay_GYY")
public class DurakDetayGYY {

    @XmlElement(name = "hat_kodu")
    protected String hatKodu;

    /**
     * Gets the value of the hatKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHatKodu() {
        return hatKodu;
    }

    /**
     * Sets the value of the hatKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHatKodu(String value) {
        this.hatKodu = value;
    }

}