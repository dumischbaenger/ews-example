
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the GetNonIndexableItemDetails web method.
 *       
 * 
 * <p>Java-Klasse für GetNonIndexableItemDetailsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemDetailsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonIndexableItemDetailsResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonIndexableItemDetailResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNonIndexableItemDetailsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "nonIndexableItemDetailsResult"
})
public class GetNonIndexableItemDetailsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "NonIndexableItemDetailsResult")
    protected NonIndexableItemDetailResultType nonIndexableItemDetailsResult;

    /**
     * Ruft den Wert der nonIndexableItemDetailsResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonIndexableItemDetailResultType }
     *     
     */
    public NonIndexableItemDetailResultType getNonIndexableItemDetailsResult() {
        return nonIndexableItemDetailsResult;
    }

    /**
     * Legt den Wert der nonIndexableItemDetailsResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonIndexableItemDetailResultType }
     *     
     */
    public void setNonIndexableItemDetailsResult(NonIndexableItemDetailResultType value) {
        this.nonIndexableItemDetailsResult = value;
    }

}
