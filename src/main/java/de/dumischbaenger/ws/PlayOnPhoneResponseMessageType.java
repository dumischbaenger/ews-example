
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PlayOnPhoneResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlayOnPhoneResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneCallId" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneCallIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayOnPhoneResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "phoneCallId"
})
public class PlayOnPhoneResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "PhoneCallId")
    protected PhoneCallIdType phoneCallId;

    /**
     * Ruft den Wert der phoneCallId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallIdType }
     *     
     */
    public PhoneCallIdType getPhoneCallId() {
        return phoneCallId;
    }

    /**
     * Legt den Wert der phoneCallId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallIdType }
     *     
     */
    public void setPhoneCallId(PhoneCallIdType value) {
        this.phoneCallId = value;
    }

}
