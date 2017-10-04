
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetAttachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetAttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}AttachmentResponseShapeType" minOccurs="0"/&gt;
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
@XmlType(name = "GetAttachmentType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "attachmentShape",
    "attachmentIds"
})
public class GetAttachmentType
    extends BaseRequestType
{

    @XmlElement(name = "AttachmentShape")
    protected AttachmentResponseShapeType attachmentShape;
    @XmlElement(name = "AttachmentIds", required = true)
    protected NonEmptyArrayOfRequestAttachmentIdsType attachmentIds;

    /**
     * Ruft den Wert der attachmentShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentResponseShapeType }
     *     
     */
    public AttachmentResponseShapeType getAttachmentShape() {
        return attachmentShape;
    }

    /**
     * Legt den Wert der attachmentShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentResponseShapeType }
     *     
     */
    public void setAttachmentShape(AttachmentResponseShapeType value) {
        this.attachmentShape = value;
    }

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
