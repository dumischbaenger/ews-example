
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BaseDelegateResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaseDelegateResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessages" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfDelegateUserResponseMessageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDelegateResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessages"
})
@XmlSeeAlso({
    GetDelegateResponseMessageType.class,
    AddDelegateResponseMessageType.class,
    RemoveDelegateResponseMessageType.class,
    UpdateDelegateResponseMessageType.class
})
public abstract class BaseDelegateResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "ResponseMessages")
    protected ArrayOfDelegateUserResponseMessageType responseMessages;

    /**
     * Ruft den Wert der responseMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDelegateUserResponseMessageType }
     *     
     */
    public ArrayOfDelegateUserResponseMessageType getResponseMessages() {
        return responseMessages;
    }

    /**
     * Legt den Wert der responseMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDelegateUserResponseMessageType }
     *     
     */
    public void setResponseMessages(ArrayOfDelegateUserResponseMessageType value) {
        this.responseMessages = value;
    }

}
