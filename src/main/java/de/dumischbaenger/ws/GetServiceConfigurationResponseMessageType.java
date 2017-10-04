
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetServiceConfigurationResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetServiceConfigurationResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessages" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfServiceConfigurationResponseMessageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceConfigurationResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessages"
})
public class GetServiceConfigurationResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ResponseMessages")
    protected ArrayOfServiceConfigurationResponseMessageType responseMessages;

    /**
     * Ruft den Wert der responseMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceConfigurationResponseMessageType }
     *     
     */
    public ArrayOfServiceConfigurationResponseMessageType getResponseMessages() {
        return responseMessages;
    }

    /**
     * Legt den Wert der responseMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceConfigurationResponseMessageType }
     *     
     */
    public void setResponseMessages(ArrayOfServiceConfigurationResponseMessageType value) {
        this.responseMessages = value;
    }

}
