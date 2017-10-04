
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeleteAttachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteAttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRequestAttachmentIdsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAttachmentType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attachmentIds"
})
public class DeleteAttachmentType
    extends BaseRequestType
{

    @XmlElement(name = "AttachmentIds", required = true)
    protected NonEmptyArrayOfRequestAttachmentIdsType attachmentIds;

    /**
     * Ruft den Wert der attachmentIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRequestAttachmentIdsType }
     *     
     */
    public NonEmptyArrayOfRequestAttachmentIdsType getAttachmentIds() {
        return attachmentIds;
    }

    /**
     * Legt den Wert der attachmentIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRequestAttachmentIdsType }
     *     
     */
    public void setAttachmentIds(NonEmptyArrayOfRequestAttachmentIdsType value) {
        this.attachmentIds = value;
    }

}
