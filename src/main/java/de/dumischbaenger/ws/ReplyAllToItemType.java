
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReplyAllToItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReplyAllToItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SmartResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsSpecificMessageReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyAllToItemType", propOrder = {
    "isSpecificMessageReply"
})
public class ReplyAllToItemType
    extends SmartResponseType
{

    @XmlElement(name = "IsSpecificMessageReply")
    protected Boolean isSpecificMessageReply;

    /**
     * Ruft den Wert der isSpecificMessageReply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecificMessageReply() {
        return isSpecificMessageReply;
    }

    /**
     * Legt den Wert der isSpecificMessageReply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecificMessageReply(Boolean value) {
        this.isSpecificMessageReply = value;
    }

}
