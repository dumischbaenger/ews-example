
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AttachmentInfoResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttachmentInfoResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttachmentsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentInfoResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attachments"
})
public class AttachmentInfoResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Attachments", required = true)
    protected ArrayOfAttachmentsType attachments;

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentsType }
     *     
     */
    public ArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentsType }
     *     
     */
    public void setAttachments(ArrayOfAttachmentsType value) {
        this.attachments = value;
    }

}
