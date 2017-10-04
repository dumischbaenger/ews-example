
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeleteAttachmentResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteAttachmentResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RootItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RootItemIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAttachmentResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "rootItemId"
})
public class DeleteAttachmentResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RootItemId")
    protected RootItemIdType rootItemId;

    /**
     * Ruft den Wert der rootItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RootItemIdType }
     *     
     */
    public RootItemIdType getRootItemId() {
        return rootItemId;
    }

    /**
     * Legt den Wert der rootItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RootItemIdType }
     *     
     */
    public void setRootItemId(RootItemIdType value) {
        this.rootItemId = value;
    }

}
