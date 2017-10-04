
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DisconnectPhoneCallType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DisconnectPhoneCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneCallId" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneCallIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisconnectPhoneCallType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "phoneCallId"
})
public class DisconnectPhoneCallType
    extends BaseRequestType
{

    @XmlElement(name = "PhoneCallId", required = true)
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
