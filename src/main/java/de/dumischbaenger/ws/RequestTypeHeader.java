
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RequestTypeHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestTypeHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestType" type="{http://schemas.microsoft.com/exchange/services/2006/types}AvailabilityProxyRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestTypeHeader", propOrder = {
    "requestType"
})
public class RequestTypeHeader {

    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected AvailabilityProxyRequestType requestType;

    /**
     * Ruft den Wert der requestType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityProxyRequestType }
     *     
     */
    public AvailabilityProxyRequestType getRequestType() {
        return requestType;
    }

    /**
     * Legt den Wert der requestType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityProxyRequestType }
     *     
     */
    public void setRequestType(AvailabilityProxyRequestType value) {
        this.requestType = value;
    }

}
