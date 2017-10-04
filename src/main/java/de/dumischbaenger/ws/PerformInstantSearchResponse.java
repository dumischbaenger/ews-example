
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PerformInstantSearchResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PerformInstantSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payload" type="{http://schemas.microsoft.com/exchange/services/2006/types}InstantSearchPayloadType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformInstantSearchResponse", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "payload"
})
public class PerformInstantSearchResponse
    extends ResponseMessageType
{

    @XmlElement(name = "Payload")
    protected InstantSearchPayloadType payload;

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InstantSearchPayloadType }
     *     
     */
    public InstantSearchPayloadType getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantSearchPayloadType }
     *     
     */
    public void setPayload(InstantSearchPayloadType value) {
        this.payload = value;
    }

}
