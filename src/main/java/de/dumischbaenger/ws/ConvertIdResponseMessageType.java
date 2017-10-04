
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response Message for a single id conversion in the ConvertId web method.  Note
 *         that the AlternateId element will be missing in the case of an error.
 *       
 * 
 * <p>Java-Klasse für ConvertIdResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConvertIdResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternateIdBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertIdResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "alternateId"
})
public class ConvertIdResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "AlternateId")
    protected AlternateIdBaseType alternateId;

    /**
     * Ruft den Wert der alternateId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdBaseType }
     *     
     */
    public AlternateIdBaseType getAlternateId() {
        return alternateId;
    }

    /**
     * Legt den Wert der alternateId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdBaseType }
     *     
     */
    public void setAlternateId(AlternateIdBaseType value) {
        this.alternateId = value;
    }

}
