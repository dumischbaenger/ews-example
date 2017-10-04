
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetPhoneCallInformationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneCallInformationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneCallInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneCallInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPhoneCallInformationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "phoneCallInformation"
})
public class GetPhoneCallInformationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "PhoneCallInformation")
    protected PhoneCallInformationType phoneCallInformation;

    /**
     * Ruft den Wert der phoneCallInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallInformationType }
     *     
     */
    public PhoneCallInformationType getPhoneCallInformation() {
        return phoneCallInformation;
    }

    /**
     * Legt den Wert der phoneCallInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallInformationType }
     *     
     */
    public void setPhoneCallInformation(PhoneCallInformationType value) {
        this.phoneCallInformation = value;
    }

}
